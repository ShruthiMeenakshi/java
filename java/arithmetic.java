import java.util.Scanner;

public class arithmetic {
    public static void main(String[] args){
        int productone;
        int producttwo;
        int totalproducts;
        Scanner userInput=new Scanner(System.in);
        System.out.println("enter the cost for 1: ");
        productone=userInput.nextInt();
        System.out.println("enter the cost for 2: ");
        producttwo=userInput.nextInt();
        totalproducts=productone+producttwo;    
        System.out.println("Total Product Sum:Rs."+totalproducts);
        userInput.close();
    }
}
