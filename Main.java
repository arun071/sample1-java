import java.util.Scanner;

public class Main {

public static void main(String[]args)
    {
        System.out.println("enter the average mark");
        Scanner arun=new Scanner(System.in);
        int avg= arun.nextInt();
        if(avg>90&&avg<=100)
        {
            System.out.println("your grade is A");
        }
        else if(avg>60&&avg<=89)
        {
            System.out.println("your grade is b");
        }
        else {
            System.out.println("your grade is c");
        }
    }
}
