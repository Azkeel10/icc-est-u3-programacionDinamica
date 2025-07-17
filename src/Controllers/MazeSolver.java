package Controllers;
import java.util.List;

import Models.Cell;

public interface MazeSolver {
    List<Cell> getPath(boolean [][] grid,Cell start,Cell end);
}
