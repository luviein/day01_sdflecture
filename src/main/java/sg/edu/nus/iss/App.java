package sg.edu.nus.iss;

import java.io.Console;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Console cons = System.console();
        String name = cons.readLine("What is your name? ");

        if (name.length() > 0) {
            System.out.printf("Nice to meet you, %s\n", name);
        } else {
            System.err.println("You have not told me your name");
        }

        int age = 25;
        System.out.printf("%s is %d years old.\n", name, age);
        // another way System.out.println(name + "is" + age + "years old.");
        
        String input = cons.readLine("What is your hobby? ");
        input = input.trim();

        if (input.equals("swim")) {
            System.out.println("Your nearest swimming pool is Clementi");

        } else if (input.equals("jog")) {
            System.out.println("The nearest park is West Coast Park");

        } else if (input.equals("cycle")) {
            System.out.println("You could cycle along PCN");

        } else {
            System.out.println("You are boring");

        }

        //Slide 18 (Switch Statement)

        switch (input) {
            case "swim":
                System.out.println("Your nearest swimming pool is Clementi");
                break;
            case "jog":
                System.out.println("The nearest park is West Coast Park");
                break;
            case "cycle":
                System.out.println("You could cycle along PCN");
                break;
            default:
                System.out.printf("What is this '%s' hobby of yours?\n", input);
                break;
        }

        //Slide 19 (If Statement)

        Integer myAge = 0;
        String inputAge = cons.readLine("What is your age? ");
        myAge = Integer.parseInt(inputAge); //turns string inputAge to integer 
        
        if (myAge >= 0 && myAge <= 2){
            System.out.println("You are a baby.");
        }else if (myAge > 2 && myAge <= 4){
            System.out.println("You are a toddler.");
        }else if (myAge > 4 && myAge < 12){
            System.out.println("You are a child.");
        }else if (myAge > 12 && myAge < 19){
            System.out.println("You are a teen.");
        }else {
            System.out.println("You are an adult. :(");
        }

    }
}
