package Assignment2.q2;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
class UserApp{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        try(FileWriter fw=new FileWriter("users.txt",true)){
            while(true){
                System.out.print("Enter firstname: ");
                String firstname=sc.nextLine();

                System.out.print("Enter lastname: ");
                String lastname=sc.nextLine();

                System.out.print("Enter age: ");
                int age=Integer.parseInt(sc.nextLine());

                System.out.print("Enter phone number: ");
                String phone=sc.nextLine();

                User u=new User(firstname,lastname,age,phone);
                fw.write(u.toString()+"\n");
                fw.flush();

                System.out.print("Do you want to continue creating users? (Type QUIT to exit): ");
                String choice=sc.nextLine();

                if(choice.equalsIgnoreCase("QUIT"))
                    break;
            }
        }
        catch(IOException e){
            System.out.println("File error: "+e);
        }
        sc.close();
    }
}
