import java.util.Scanner;

public class getdata {
    public static void main(String[] args){
        String name;
        Scanner userInput=new Scanner(System.in);
        System.out.println("enter your name");
        name=userInput.nextLine();
        System.out.println("Hello,"+name);
    }
}
