# Android Playground

An Android application designed to experiment with new features, technologies, and Google announcements. This project serves as a sandbox for rapid prototyping and testing the latest advancements in Android development.

## 🎯 Project Goals

* Build a base Android app that enables rapid feature prototyping
* Explore new features introduced in Android OS upgrades
* Implement best practices for UI/UX using Jetpack Compose
* Develop a backend service that interacts with PokeAPI to provide session data
* Utilize modern Android development tools and architectures
* Apply modularization according to Google's guidelines

## 🏗️ Architecture

The project follows Clean Architecture principles with the following modules:

* `app` - Main application module
* `core` - Common utilities and shared code
* `data` - Data layer implementation
* `domain` - Business logic and use cases
* `feature-sessions` - Feature module for sessions

### Tech Stack

* **Kotlin** - Primary programming language
* **Jetpack Compose** - Modern UI toolkit
* **Koin** - Dependency injection
* **Coil** - Image loading
* **Coroutines** - Asynchronous programming
* **Material Design 3** - UI components and theming

## 🚀 Features

### Current Features
* List of tech sessions with Pokémon speakers
* MVI architecture implementation
* Image loading with Coil
* Material Design 3 UI components

### Planned Features
* Session details screen
* Search functionality
* Filtering by date/speaker
* Offline support
* Dark mode support

## 🛠️ Setup

### Prerequisites
* Android Studio Hedgehog | 2023.1.1 or later
* JDK 17 or later
* Android SDK 34 (Android 14)

### Installation
1. Clone the repository
2. Open the project in Android Studio
3. Sync the project with Gradle files
4. Run the app on an emulator or physical device

## 📱 Screenshots

[Add screenshots here]

## 🧪 Testing

The project includes:
* Unit tests for ViewModels
* Repository tests
* Use case tests

## 📚 Documentation

### Architecture
The app follows Clean Architecture principles with:
* Presentation Layer (UI)
* Domain Layer (Business Logic)
* Data Layer (Repository Implementation)

### MVI Pattern
The app uses Model-View-Intent pattern for state management:
* **Model** - Represents the state
* **View** - Displays the UI
* **Intent** - Represents user actions
