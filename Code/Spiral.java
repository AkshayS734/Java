public class Spiral {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9,10,11,12}
        };
        spiral(arr);
    }
    static void spiral(int[][] arr) {
        int top = 0;
        int bottom = arr.length - 1;
        int left = 0;
        int right = arr[0].length - 1;
        int dir = 1;
        while (top <= bottom && left <= right) {
            if (dir == 1) {
                for (int i = left; i <= right; i++) {
                    System.out.print(arr[top][i] + " ");
                }
                top++;
                dir = 2;
            }
            else if (dir == 2) {
                for (int i = top; i <= bottom; i++) {
                    System.out.print(arr[i][right] + " ");
                }
                right--;
                dir = 3;
            }
            else if (dir == 3) {
                for (int i = right; i >= left; i--) {
                    System.out.print(arr[bottom][i] + " ");
                }
                bottom--;
                dir = 4;
            }
            else if (dir == 4) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
                left++;
                dir = 1;
            }
        }
    }
}
