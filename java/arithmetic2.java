import java.util.Scanner;

public class arithmetic2 {
    public static void main(String[] args){
        int x;
        int y;
        int z;
        Scanner userInput=new Scanner(System.in);
        System.out.println("eneter x:");
        x=userInput.nextInt();
        System.out.println("eneter y:");
        y=userInput.nextInt();
        z=x+y;
        System.out.println("total"+z);
        userInput.close();
    }
}
