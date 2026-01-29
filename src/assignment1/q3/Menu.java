package assignment1.q3;

import java.util.Scanner;

class Menu{
    static double area(double r){
        return Math.PI*r*r;
    }
    static double circumference(double r){
        return 2*Math.PI*r;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.println("*******Menu*******");
        System.out.println("1.Calculate Area of Circle");
        System.out.println("2.Calculate Circumference of a Circle");
        System.out.println("3.Exit");
        System.out.print("Choose an option (1-3): ");

        int choice=sc.nextInt();

        if(choice==3){
            System.out.println("Exit");
            return;
        }
        System.out.print("Enter radius: ");
        double radius=sc.nextDouble();

        switch(choice){
            case 1:
                System.out.println("Area of Circle:"+area(radius));
                break;
            case 2:
                System.out.println("Circumference of Circle:"+circumference(radius));
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
