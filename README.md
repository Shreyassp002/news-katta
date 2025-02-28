![Kotlin](https://img.shields.io/badge/kotlin-%237F52FF.svg?style=for-the-badge&logo=kotlin&logoColor=white)

<div align="center">
  <img src="https://github.com/Shreyassp002/News-Katta/raw/main/app/src/main/res/drawable/ic_news_katta.png" alt="News Katta Logo" width="280"/>
</div>

# News Katta
A News App that delivers customized short news articles tailored to user preferences.

## Tech Stack

- **Language**: Kotlin
- **UI Framework**: Jetpack Compose
- **Architecture**: MVVM (Model-View-ViewModel)
- **Networking**: Retrofit 
- **JSON Parsing**: Gson
- **Image Loading**: Coil
- **Local Database**: Room
- **Asynchronous Programming**: Kotlin Coroutines
- **Navigation**: Jetpack Navigation Compose
- **Dependency Injection**: Dagger Hilt
- **UI Components**: Material Design 3
- **Build System**: Gradle with Kotlin DSL
- **Minimum SDK**: 21 (Android 5.0 Lollipop)
- **Target SDK**: 34 (Android 14)

## Key Features

1. Browse news by different categories (sports, politics, etc.)
2. Search for news
3. View detailed news information
4. Mark news as favorites
8. Toggle between light and dark themes


## Build Instructions

1) Clone the project

```bash
  git clone https://github.com/Shreyassp002/News-Katta.git
```

2) Open project in Android Studio.


3) Wait for Gradle to download dependencies.
4) Create a Object file named `Constants.kt` into `app/src/main/java/com/rey/newskatta/util/`
5) Copy this code and paste in Constants.kt
   
 ```bash
  object Constants {
    const val USER_SETTINGS = "userSettings"

    const val APP_ENTRY = "appEntry"

    const val API_KEY = " /*Your api key here*/ "

    const val BASE_URL = "https://newsapi.org/v2/"
}
```

6) Get your Api key from [Here](https://newsapi.org/)
7) Run :)
