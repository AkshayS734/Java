import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter first integer : ");
        int num1=in.nextInt();
        System.out.print("Enter second integer : ");
        int num2=in.nextInt();
        System.out.print("Enter operation : ");
        char op=in.next().charAt(0);
        calc(num1,num2,op);
        in.close();
    }
    static void calc(int a , int b, char ch){
        switch (ch){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);;
                break;
            case '/':
                if(b!=0){
                    System.out.println(a/b);
                    break;
                }else{
                    System.out.println("Can't divide by zero");
                    break;
                }
            default:
            System.out.println("Invalid operation");
            break;
        }
    }
}
