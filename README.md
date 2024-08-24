![Kotlin](https://img.shields.io/badge/kotlin-%237F52FF.svg?style=for-the-badge&logo=kotlin&logoColor=white)
# News Katta

A News App that delivers customized short news articles tailored to user preferences.

## Built with

- Kotlin
- Jetpack Compose
- MVVM architecture
- NewsApi
- Paging 3 Library
- Retrofit
- Room Database
- Dagger Hilt
- Datastore Preferences

## Build Instructions

1) Clone the project

```bash
  git clone https://github.com/Shreyassp002/News-Katta.git
```

2) Open project in Android Studio.


3) Wait for Gradle to download dependencies.
4) Create a Object file into `app/src/main/java/com/rey/newskatta/util/Constants.kt`
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
7) Run.
