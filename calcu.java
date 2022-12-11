import java.util.Scanner;

public class calcu{

    public static void main(String[] args) {
        int a,b,c;
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        a = ab.nextInt();

        Scanner bc = new Scanner(System.in);
        System.out.println("Enter Second Number : ");
        b = bc.nextInt();

        Scanner ca = new Scanner(System.in);
        System.out.println("Enter 1(+),2(-),3(*),4(/) Number : ");
        c = ca.nextInt();

        switch(c){

            case 1:
                c=a+b;
                System.out.println("Sum of : "+c);
                break;

            case 2:
                c=a-b;
                System.out.println("Sum of : "+c);
                break;

            case 3:
                c=a*b;
                System.out.println("Sum of : "+c);
                break;

            case 4:
                c=a/b;
                System.out.println("Sum of : "+c);
                break;

            default:
                System.out.println("Error");
                break;
        }
    }
}