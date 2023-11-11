import java.util.*;
public class BubbleSort {
    public static void main(String[] args){
        System.out.print("Enter the numbers of element in array: ");
        Scanner in=new Scanner(System.in);
        int len=in.nextInt();
        int[] arr=new int[len];
        System.out.println("Enter the elements of array : ");
        for(int i=0;i<len;i++){
            arr[i]=in.nextInt();
        }
        for(int i=0;i<len;i++){
            for(int j=0;j<len-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted array : ");
        System.out.println(Arrays.toString(arr));
        in.close();
    }
}
