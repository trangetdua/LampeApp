# 💡 Lampe Magique – Application Android de contrôle de couleurs

**Lampe Magique** est une application Android permettant de **contrôler la couleur d'une "lampe virtuelle"** via une interface intuitive avec sliders, boutons, et même **contrôle gestuel**. L'application communique également avec un **serveur distant** pour envoyer et récupérer les couleurs, simulant un vrai système domotique.

---

## 🎯 Fonctionnalités principales

- 🎨 **Affichage et modification des couleurs RGB**
- ⬆️ **Envoi de la couleur sélectionnée vers un serveur distant**
- 🌈 **Séquence animée de couleurs avec dégradés**
- 💾 **Sauvegarde de la dernière couleur choisie (via SharedPreferences)**
- 👆 **Mode de contrôle gestuel** : glisser pour changer de composante et ajuster l’intensité
- ⚙️ **Écran de préférences** pour afficher/masquer les composantes RGB
- 🧪 **Réception de la couleur actuelle d'une lampe distante (protocole `KXX`)**

---

## 📱 Navigation dans l'application

1. **MainActivity2** : Choix initial de la couleur de la lampe
2. **MainActivity** : Écran principal d'affichage et de contrôle de couleur
3. **GestureControlActivity** : Contrôle artistique par gestes
4. **SettingsActivity** : Écran des préférences

---

## 🛠️ Technologies utilisées

- Java (Android SDK)
- XML (UI layouts avec ConstraintLayout & ScrollView)
- SharedPreferences (stockage persistant)
- Sockets TCP (client vers serveur `chadok.info`)
- Threads & UI Handlers
- MediaPlayer (pour le mode artistique)
- GestureDetector (pour le mode gestuel)
- AlertDialog, DialogFragment (réponses serveur et saisie HEX)

---

## 🧪 Protocole du serveur de lampe

- Envoi d’une commande `04RRGGBB` pour modifier la couleur de la lampe 04
- Envoi `K04` pour demander la couleur actuelle de la lampe
- Réception de 3 lignes : `rouge`, `vert`, `bleu` (valeurs de 0 à 255)

---

## 👨‍💻 Auteurs
Van Trang DANG – IUT d’Orsay – BUT Informatique
