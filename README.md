# Game of Life - ChargePoint Assignment

## Overview
This project is an implementation of Conway's Game of Life.

The Game of Life is a zero-player simulation where cells evolve based on predefined rules. Each cell can be either alive or dead, and its next state depends on its neighbors.

---

## Features
- 25x25 grid simulation
- Implements all Game of Life rules
- Uses "Glider" pattern for demonstration
- Console-based output for each generation
- Clean separation of concerns (Model & Service layers)

---

## Assumptions
- Although the problem defines an infinite grid, a finite 25x25 grid is used for demonstration.
- Cells outside the grid are considered dead.
- Number of generations is configurable (default: 20).

---

## Technologies Used
- Java (Core Java, no external libraries)

---

## Project Structure

com.srikantha.gameoflife
│
├── model
│ └── CellGrid.java
│
├── service
│ └── GameOfLife.java
│
└── Main.java


---

## How to Run

1. Compile:

javac com/srikantha/gameoflife/**/*.java


2. Run:

java com.srikantha.gameoflife.Main


---

## Sample Output
Each generation is printed in the console:
- `X` → Alive cell
- `.` → Dead cell

---

## Notes
- The implementation ensures all updates happen simultaneously by using a new grid for each generation.
- The design is kept simple and extensible for future enhancements.

---

## Author
Srikantha Ramachandrappa
