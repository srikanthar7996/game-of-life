package com.srikantha.gameoflife.model;

 //Represents the grid (universe) of the Game of Life.
 //Each cell can be either alive (true) or dead (false).
public class CellGrid {

    private int rows;
    private int cols;
    private boolean[][] grid;

    public CellGrid(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;

        // Initialize grid with all cells dead by default
        this.grid = new boolean[rows][cols];
    }


    public boolean isAlive(int row, int col) {
        if (row < 0 || col < 0 || row >= rows || col >= cols) {
            return false;
        }
        return grid[row][col];
    }

  
     //Sets the state of a cell (alive or dead)
    public void setAlive(int row, int col, boolean state) {
           grid[row][col] = state;
    }

    
     //Counts the number of live neighbors for a given cell.
     // Neighbors include horizontal, vertical and diagonal cells.
    public int getLiveNeighborCount(int row, int col) {
        int count = 0;
        // Check all 8 surrounding cells
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {

                // Skip the cell itself
                if (i == 0 && j == 0) continue;

                if (isAlive(row + i, col + j)) {
                    count++;
                }
            }
        }
        return count;
    }

    public boolean[][] getGrid() {
        return grid;
    }

    
     // Prints the grid to console. 'X' represents alive cell, '.' represents dead cell.
    public void printGrid() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(grid[i][j] ? "X " : ". ");
            }
            System.out.println();
        }
        System.out.println();
    }
}