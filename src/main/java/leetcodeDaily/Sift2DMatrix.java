package leetcodeDaily;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sift2DMatrix {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        int rowSize = grid.length;
        int colSize = grid[0].length;
        List<Integer> flatten = new ArrayList<>();
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                flatten.add(grid[i][j]);
            }
        }
        int list =0;
        Collections.rotate(flatten, k);
        for(int i=0; i<rowSize;i++){
            List<Integer> row = new ArrayList<>();
            for(int j =0; j<colSize;j++){
                row.add(flatten.get(list));
                list++;
            }
            ans.add(row);
        }
    return ans;
    }
}
