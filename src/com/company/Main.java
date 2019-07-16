package com.company;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Scanner;

public class Main {
    static public  Scanner cin;
    static{
        Scanner cin = new Scanner(System.in);
    }
    public static void main(String[] args)
    {
        showMainMenu();
        Select();
    }
    private static void Select()
    {

        System.out.println("What Is Your Choice: ");
        String Choice = Main.cin.nextLine();
        switch (Choice)
        {
            case "1":break;
            case "2":break;
            case "3":break;
            case "4":
                System.exit(0);
                break;
        }
    }


    private static void showMainMenu()
    {
        System.out.println("Welcome to the brand new “Sticky Notes”!\n" +
                "Here is the list of operation this program offers:\n" +
                "1- Add new user\n" +
                "2- Add new note\n" +
                "3- View notes for a specific user\n" +
                "4- Exit\n");
    }
    private static void showNewUserMenu()
    {
        System.out.println("Welcome aboard new user!\n");
        System.out.println("Please let me know your first name:");
        String firstName=Main.cin.nextLine();
        System.out.println("Great "+ firstName+", now please enter your last name:");
        String lastName=Main.cin.nextLine();
        //check if its exist or not
        System.out.println("Nice to meet you "+firstName+" " +lastName);
        User newUser= new User(firstName,lastName);
        Server.usersList.add(newUser);
        //Create file for the user.
        System.out.println("Click Enter to return to main menu");
        Main.cin.nextLine();

    }
    private static void addNoteUserMenu()
    {
        System.out.println(
                "Let’s add a new note ...\n" +
                "Please enter your full name first:");
        String firstLastName=Main.cin.nextLine();
        //check Userexistance
        Boolean exist=Server.checkExistance(firstLastName);
        if(exist==false)
        {
            System.out.println
                    (
                    "\nOh! Sorry the user name was not found, please check the name again and if this is your first time here," +
                            " please go ahead and create a new user from the main menu ...\n" +
                    "Click Enter to return to main menu"
                    );
            return ;

        }
        System.out.println
                (
                "Your record is found, I’m now opening your file ….\n" +
                "Ready!\n" +
                "Please enter your note:"
                );
        String newNote=Main.cin.nextLine();
        System.out.println("################");
        System.out.println
                (
                "Your note has been well received, 1 second while saving it ….\n" +
                "Done!\n"
                );
        System.out.println("Click Enter to return to main menu");
        Main.cin.nextLine();
    }
}
