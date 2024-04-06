import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number of elements in array : ");
        int len=in.nextInt();
        int[] arr=new int[len];
        System.out.println("Enter the elements of array : ");
        for(int i=0;i<len;i++){
            arr[i]=in.nextInt();
        }
        selection(arr);
        System.out.println(Arrays.toString(arr));
        in.close();
    }
    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // find the max item in the remaining array and swap with correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}