import java.util.Scanner;
public class InputFromKeyBoard {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = keyboard.nextLine();
        System.out.println("How old are you? ");
        int age = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("How tall are you(m)? ");
        double height = keyboard.nextDouble();

        System.out.println("\n\n____________________________");
        System.out.println("Mr/Mrs " + name + "\nAge: "+ age +"\nYour height is: " +height+ " m");
    }
}