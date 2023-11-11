import java.util.*;
public class InsertionSort {
    public static void insertion(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the numbers of element in array :");
        int len=in.nextInt();
        int[] arr=new int[len];
        System.out.println("Enter the elements in array :");
        for(int i=0;i<len;i++){
            arr[i]=in.nextInt();
        }
        insertion(arr);
        System.out.println(Arrays.toString(arr));
        in.close();
    }
}