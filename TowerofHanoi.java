import java.util.*;
public class TowerofHanoi{
    public static void tower(int n,char a,char b,char c){
        if(n>0){
            tower(n-1,a,c,b);
            System.out.println("Move disk "+n+" from "+a+" to "+c);
            tower(n-1,b,a,c);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of disks : ");
        int n=sc.nextInt();
        tower(n,'A','B','C');
        sc.close();
    }
}