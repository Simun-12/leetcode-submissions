//package arrays;
//
//import java.util.Arrays;
//
//public class RotateTheBox {
//    public static char[][] rotate(char[][] matrix) {
//        int m = matrix.length;
//        int n = matrix[0].length;
//        char[][] rotated = new char[n][m];
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                rotated[j][m - 1 - i] = matrix[i][j];
//            }
//        }
//        return rotated;
//    }
//    public static char[][] rotateTheBox(char[][] boxGrid) {
//        int m = boxGrid.length; //row
//        int n = boxGrid[0].length; //col
//        for(int i = 0; i<m; i++){
//            int empty = n-1, stone =n-1;
//            for(int j=n-1; j>=0; j--) {
//
//               if(boxGrid[i][j] == '*') {
//                empty++;
//                stone++;
//               }
//               else if(boxGrid[i][j] == '.') {
//                   stone++;
//               }
//               else if(boxGrid[i][j] == '#') {
//                   boxGrid[i][empty] = '#';
//                   boxGrid[i][j] = '.';
//               }
//            }
//        }
//
//
//     return rotate(boxGrid);
//    }
//
//    public static void main(String[] args) {
//
//        char[][] boxGrid = {
//                {'#', '.', '*', '.'},
//                {'#', '#', '*', '.'}};
//        char[][] ans = rotateTheBox(boxGrid);
//        System.out.println(Arrays.deepToString(ans));
//        }
//    }
//}
