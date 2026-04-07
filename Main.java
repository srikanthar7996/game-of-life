package com.srikantha.gameoflife;

import com.srikantha.gameoflife.model.CellGrid;
import com.srikantha.gameoflife.service.GameOfLife;

 // Entry point to run the Game of Life simulation.
public class Main {

    public static void main(String[] args) throws InterruptedException {

        // Assumption:
        // Although the problem states infinite grid,
        // we use a fixed 25x25 grid for demonstration.
        int size = 25;

        CellGrid grid = new CellGrid(size, size);

        // Initialize Glider pattern at center
        int mid = size / 2;

        grid.setAlive(mid, mid + 1, true);
        grid.setAlive(mid + 1, mid + 2, true);
        grid.setAlive(mid + 2, mid, true);
        grid.setAlive(mid + 2, mid + 1, true);
        grid.setAlive(mid + 2, mid + 2, true);

        GameOfLife game = new GameOfLife();

        // Number of generations (configurable)
        int generations = 20;

        for (int i = 0; i < generations; i++) {
            System.out.println("Generation: " + i);

            grid.printGrid();

            // Compute next state
            grid = game.nextGeneration(grid);

            // Small delay for readability
            Thread.sleep(500);
        }
    }
}