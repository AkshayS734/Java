import java.util.Arrays;
public class CyclicSort {
    public static void main(String[] args) {
        int[] arr={4,3,2,1};
        sort(arr);
    }
    public static void sort(int[] arr1){
        int i=0;
        while(i<arr1.length){
            int correct=arr1[i]-1;
            if(arr1[correct]!=arr1[i]){
                int temp=arr1[correct];
                arr1[correct]=arr1[i];
                arr1[i]=temp;
            }
            i++;
        }
        System.out.println(Arrays.toString(arr1));
    }
}