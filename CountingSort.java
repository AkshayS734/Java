import java.util.*;
public class CountingSort{
    public static void countSort(int[] arr){
        int len = arr.length;
        if (len == 0) {
            return;
        }
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max=num;
            }
        }
        int[] countarray = new int[max + 1];
        for (int num : arr) {
            countarray[num]++;
        }
        int index = 0;
        for (int i = 0; i <= max; i++){
            while(countarray[i] > 0){
                arr[index] = i;
                index++;
                countarray[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 34, 4, 56, 3};
        countSort(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}