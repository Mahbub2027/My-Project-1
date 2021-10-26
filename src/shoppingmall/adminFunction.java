package shoppingmall;

import java.util.Scanner;

public class adminFunction extends Login{

    public void adminFunction(){
    System.out.println();

        System.out.println("We select you as a admin.");

        System.out.println("Enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Enter your ID No:");
        int id = input.nextInt();
        System.out.println(name);
        System.out.println(id);


        if(id==111 || id==121 || id==127) {
            login();
        }
}}
