# Travel Agency Booking System - Java Implementation

This project implements a simple command-line travel agency booking system in Java.  The system allows users to book tickets for Air, Water, Rail, and Road travel.  The system is designed using an object-oriented approach with clear separation of concerns, although there's room for improvement in several areas.

## Project Structure

The project consists of the following Java files:

* **`Travel_Agency.java`:** The main application class.  This acts as the entry point and the main menu for the user.
* **`Passenger_Info.java`:** A base class containing common functionality for passenger information input, processing delays, and bill generation.
* **`AirWays.java`:** Handles air ticket bookings.
* **`WaterWays.java`:** Handles waterway ticket bookings.
* **`RailWays.java`:** Handles railway ticket bookings.
* **`RoadWays.java`:** Handles road trip bookings.


## Class Diagram

```
+-----------------+      +-----------------+      +-----------------+
| Travel_Agency   |---->| Passenger_Info |---->| AirWays        |
+-----------------+      +-----------------+      +-----------------+
                                      |
                                      |
                                      +-----------------+
                                      | WaterWays      |
                                      +-----------------+
                                      |
                                      |
                                      +-----------------+
                                      | RailWays       |
                                      +-----------------+
                                      |
                                      |
                                      +-----------------+
                                      | RoadWays       |
                                      +-----------------+

```

## Detailed Class Descriptions

### `Travel_Agency.java`

* **Purpose:** Main application entry point. Presents the main menu to the user, handles user input for travel mode selection, creates instances of appropriate booking classes, and manages the overall flow of the application.
* **Functionality:** Displays a welcome message, presents a menu of travel options, takes user input, creates an instance of the selected travel mode class, calls the passenger information input method (`Input_PassengerDet()` from `Passenger_Info`), calls the specific booking method for the selected mode, and handles the loop for multiple bookings.
* **Dependencies:**  Depends on `Passenger_Info`, `AirWays`, `WaterWays`, `RailWays`, and `RoadWays`.


### `Passenger_Info.java`

* **Purpose:** Base class for all travel modes. Contains common methods for handling passenger information and bill generation.  Promotes code reuse and consistency.
* **Functionality:**
    * `Input_PassengerDet()`: Collects passenger details (name, age, gender, journey date, and time).
    * `ProcessingDelay()`: Simulates a processing delay.
    * `GenerateBill()`: Generates and displays the final bill.
    * `PassengerNameMod()`: Formats passenger names for the bill.
* **Dependencies:** Uses `InputStreamReader` and `BufferedReader` for console input.  `java.util.Date` is used for date/time handling.


### `AirWays.java`, `WaterWays.java`, `RailWays.java`, `RoadWays.java`

These classes share a similar structure:

* **Purpose:** Each class handles bookings for a specific travel mode.
* **Functionality:** Each class presents a menu-driven interface for booking, collects specific travel details (e.g., destination, seat numbers, cabin class), calculates the fare, and generates a bill using the `GenerateBill()` method inherited from `Passenger_Info`.
* **Dependencies:** Extends `Passenger_Info`.  Each class uses the `in` object (BufferedReader) inherited from `Passenger_Info`.


##  Improvements and Future Enhancements

The current implementation has several areas for improvement:

* **Robust Error Handling:**  More comprehensive error handling is needed to gracefully handle invalid user input and potential exceptions.
* **Input Validation:**  Input validation should be more thorough to prevent unexpected behavior.
* **Data Structures:**  More efficient data structures (e.g., ArrayLists, custom classes) could be used to manage passenger and booking information, particularly for larger datasets.
* **Modular Design:** The code could benefit from better separation of concerns.  Consider separating the UI logic from the business logic.  A more sophisticated UI framework (Swing, JavaFX) could be used for a better user experience.
* **Data Persistence:**  Currently, booking data is not persisted.  Integration with a database or file storage would be beneficial.
* **Configuration:**  Hardcoded values (prices, destinations) should be moved to configuration files for easier maintainability.
* **Testing:**  Unit tests should be implemented to ensure code correctness and robustness.


## How to Run

1. Compile all Java files: `javac *.java`
2. Run the main application: `java Travel_Agency`


This README provides a comprehensive overview of the travel agency booking system.  Further improvements and enhancements are outlined for future development.


---
Generated with ❤️ using [GitDocs](https://github.com/mikhail-ram/gitdocs).