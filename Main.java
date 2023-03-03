import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner arun=new Scanner(System.in);
        System.out.println("Enter the years ");
        int num= arun.nextInt();
        if(num%4==0||(num%100==0&&num%400==0))
        {
            System.out.println("the given year is leap year");
        }
        else {
            System.out.println("the given year is not a leap year");


        }}}