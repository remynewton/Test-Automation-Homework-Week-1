import java.util.*;
 
class Hello {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = userInput.nextLine();
        userInput.close();
        System.out.println("Hello, " + name + "!");
    }
}