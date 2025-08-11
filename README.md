# 🪐 PlanetsApp - Explore the Solar System

> **A visually engaging Android application that displays information about planets in our solar system. Features a custom-styled list and a cosmic theme. Built with Kotlin and XML.**

---

## 🚀 Features

- 🪐 **Planet Listing:** Displays a list of planets.
- 🎨 **Custom Theming:** Utilizes a space-themed UI with custom drawables (stars, gradients, icons).
- 📱 **Custom Adapter:** Uses `MyCustomAdapter.kt` to render planets in a `ListView`.
- ✨ **Styled UI Elements:** Features `CardView` for a modern look and feel, custom fonts, and text styling.
- 📄 **Data Model:** Likely uses a `Planet.kt` data class to structure planet information.

---

## 🎨 Tech Stack

- **Language:** Kotlin
- **UI:** XML (`ConstraintLayout`, `CardView`, `ListView`)
- **Core Components:** Android SDK (Activities, Custom Adapters, `Drawable` resources)

---

## 🏗️ Project Structure

```
com.surajvanshsv.planetsapp/  # (Assuming this is your package name)
├── MainActivity.java           # Or MainActivity.kt - Main activity displaying the planets
├── MyCustomAdapter.kt          # Custom adapter for the planet list
├── Planet.kt                   # Data model for planet objects
├── res/
│   ├── layout/
│   │   └── activity_main.xml   # Main layout with ListView and cosmic theme
│   ├── drawable/               # Contains various custom drawables (ic_star, ic_moon, gradients, etc.)
│   └── values/                 # String, color, and style resources
└── AndroidManifest.xml
```

*(Please verify and adjust the package name and file names if they differ.)*

---

## ⚙️ Installation & Run

1.  **Clone this repo:**
    
    ```bash
    git clone https://github.com/your-github-username/PlanetsApp.git
    cd PlanetsApp
    ```

2.  **Open in Android Studio.**

3.  **Run the app on an emulator or physical device.**

---

## 🧪 Future Enhancements

*   ✅ Detailed planet view on item click.
*   ✅ Fetch planet data from an API or local database.
*   ✅ Add animations and transitions.
*   ✅ Implement search/filter functionality for planets.
*   ✅ Add more interactive elements like quizzes or facts.

---

## 🤝 Contribution

Pull requests are welcome! For major changes, please open an issue first to discuss what you would like to change or improve.

---

## 📜 License

MIT © 2024 [Your Name](https://github.com/your-github-username)

---

## 🌐 Connect With Me

*   🔗 [LinkedIn - Your Name](https://www.linkedin.com/in/your-linkedin-profile/)
*   💻 [GitHub - your-github-username](https://github.com/your-github-username)
