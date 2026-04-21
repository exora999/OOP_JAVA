# 🧠 Interactive Java Quiz Application

A console-based educational application built with Java, featuring dynamic multiple-choice questions, automated scoring, and a built-in timer.

## 🚀 Features
* **Interactive Gameplay:** Users answer a series of technical programming questions.
* **Automated Scoring:** Real-time evaluation of answers and final score calculation.
* **Execution Timer:** Tracks the exact time taken to complete the quiz in minutes and seconds.

## 🛠️ Software Architecture (OOP)
The project is divided into specialized classes for maintainability and separation of concerns:
* `Main.java`: Handles the program loop and user input.
* `Qcm.java`: Manages the question text, available options, and correct index.
* `Score.java`: Encapsulates the scoring logic and final evaluation.
* `Chrono.java`: Uses `System.currentTimeMillis()` to measure execution time.
