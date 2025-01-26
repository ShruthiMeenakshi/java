import java.util.Scanner;

public class operations {
    public static void main(String[] args) {
        int a;
        int b;
        int product;
        Scanner userInput=new Scanner(System.in);
        System.out.println("a= ");
        a=userInput.nextInt();
        System.out.println("b= ");
        b=userInput.nextInt();
        product=a*b;
        System.out.println("product is:"+product);
        userInput.close();
    }
}
