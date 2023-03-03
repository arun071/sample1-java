import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            System.out.println("enter the values");
        Scanner arun=new Scanner(System.in);
        int []a=new int[arun.nextInt()];


        for(int i=0;i<=10;i++)
        {
            a[i]=i*5;
            System.out.println("the array index a"+i+"is"+a[i]);

        }
    }
}