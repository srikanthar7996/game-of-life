package com.srikantha.gameoflife.service;

import com.srikantha.gameoflife.model.CellGrid;

 //Contains logic to compute the next generation based on Game of Life rules.
public class GameOfLife {

     // Generates the next state of the grid.
    // Important: We use a new grid to ensure all updates happen simultaneously.
     
    public CellGrid nextGeneration(CellGrid currentGrid) {

        int rows = currentGrid.getGrid().length;
        int cols = currentGrid.getGrid()[0].length;

        CellGrid nextGrid = new CellGrid(rows, cols);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                boolean isAlive = currentGrid.isAlive(i, j);
                int liveNeighbors = currentGrid.getLiveNeighborCount(i, j);

                boolean nextState = false;

                // Apply Game of Life rules
                // Rule 1 & 3: Underpopulation or Overpopulation
                if (isAlive && (liveNeighbors == 2 || liveNeighbors == 3)) {
                    nextState = true;
                }
                // Rule 4: Reproduction
                else if (!isAlive && liveNeighbors == 3) {
                    nextState = true;
                }

                nextGrid.setAlive(i, j, nextState);
            }
        }

        return nextGrid;
    }
}