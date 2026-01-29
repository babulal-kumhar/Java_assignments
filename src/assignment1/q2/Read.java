package assignment1.q2;

import java.util.Scanner;

class Read{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        StringBuilder text=new StringBuilder();
        String input;

        while(true){
            input=sc.nextLine();
            if(input.equals("XDONE"))
                break;
            text.append(input).append("\n");
        }

        System.out.println("Entered Text:");
        System.out.print(text.toString());
    }
}
