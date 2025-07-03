# Sample Delhi University App

## Overview

This is a sample android application designed to provide users with quick access to important information and resources related to Delhi University (DU). It allows users to easily navigate to various sections of the official DU website directly from the app. A better and a fully functioning app is still under development phase done by yours truly...schyeah 🧛🧛🧛

## Features

*   **Locate Colleges :** Opens a webpage listing colleges affiliated with Delhi University.
*   **About DU :** Provides quick access to the "About DU" section of the DU website.
*   **Courses Offered :** Links to the page detailing syllabi and courses offered at DU.
*   **Departments :** Directs users to the list of departments within Delhi University.
*   **Amenities :** Directs users to the list of different amenities within Delhi University campuses.

## How it Works

The main screen of the application presents several buttons, each corresponding to a specific resource on the Delhi University website. When a user taps a button, the app launches the device's default web browser to display the relevant webpage.

## Technical Details (Main Activity)

*   The `MainActivity` sets up click listeners for each button.
*   When a button is clicked, an `Intent` with the `ACTION_VIEW` action is created.
*   The `Intent` data is set to the `Uri` of the corresponding DU webpage.
*   The app checks if there's an activity (typically a web browser) available to handle the `Intent` before attempting to start it, preventing crashes if no browser is installed.

## Setup & Installation

1.  Clone the repository: `git clone [your-repository-url]`
2.  Open the project in Android Studio.
3.  Build the project (Build > Make Project).
4.  Run the app on an Android emulator or a physical device.

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.