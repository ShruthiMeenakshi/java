import java.util.Scanner;

public class getdata2{
    public static void main(String[] args) {
        int mark;
        String name;
        Scanner userInput=new Scanner(System.in);
        System.out.println("enter name");
        name=userInput.nextLine();
        System.out.println("enter your marks");
        mark=userInput.nextInt();
        System.out.println("hi! "+name+" your marks"+mark);
        userInput.close();
    }
}
