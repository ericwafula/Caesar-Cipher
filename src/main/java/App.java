import java.io.Console;

public class App {
    public static void main (String[] args){
        Console newConsole = System.console();
//        prompts User for input
        System.out.println("Enter Text to be Encrypted:");
        String text = newConsole.readLine();

//        prompts User for input
        System.out.println("Enter Encryption Key:");
        String key = newConsole.readLine();

//        Checks for number digits
//        Encrypt newEncryption = new Encrypt();
    }
}
