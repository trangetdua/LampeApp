package com.example.lampemagique;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private int red = 255, green = 0, blue = 0; // Giá trị RGB ban đầu
    private TextView colorDisplay; // Hiển thị màu

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Thiết lập Toolbar thay thế ActionBar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Ánh xạ View
        colorDisplay = findViewById(R.id.color_display);
        updateColor(); // Hiển thị màu ban đầu

        // Ánh xạ các nút bấm
        Button increaseRed = findViewById(R.id.increase_red);
        Button decreaseRed = findViewById(R.id.decrease_red);
        Button increaseGreen = findViewById(R.id.increase_green);
        Button decreaseGreen = findViewById(R.id.decrease_green);
        Button increaseBlue = findViewById(R.id.increase_blue);
        Button decreaseBlue = findViewById(R.id.decrease_blue);

        // Gán sự kiện cho các nút
        increaseRed.setOnClickListener(v -> changeColor("red", 10));
        decreaseRed.setOnClickListener(v -> changeColor("red", -10));
        increaseGreen.setOnClickListener(v -> changeColor("green", 10));
        decreaseGreen.setOnClickListener(v -> changeColor("green", -10));
        increaseBlue.setOnClickListener(v -> changeColor("blue", 10));
        decreaseBlue.setOnClickListener(v -> changeColor("blue", -10));
    }

    // Hàm thay đổi giá trị màu
    private void changeColor(String color, int amount) {
        switch (color) {
            case "red":
                red = Math.max(0, Math.min(255, red + amount));
                break;
            case "green":
                green = Math.max(0, Math.min(255, green + amount));
                break;
            case "blue":
                blue = Math.max(0, Math.min(255, blue + amount));
                break;
        }
        updateColor(); // Cập nhật màu sau mỗi lần bấm nút
    }

    // Cập nhật màu nền của TextView
    private void updateColor() {
        colorDisplay.setBackgroundColor(Color.rgb(red, green, blue));
        colorDisplay.setText(String.format("ROUGE : %d ; VERT : %d ; BLEU : %d", red, green, blue));
    }
}
