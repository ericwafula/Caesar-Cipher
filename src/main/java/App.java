import java.io.Console;

public class App {
    public static void main (String[] args){
        Console newConsole = System.console();
//        prompts User for input
        System.out.println("Enter Text to be Encrypted:");
        String text = newConsole.readLine();

//        prompts User for input
        System.out.println("Enter Encryption Key:");
        Integer key = Integer.parseInt(newConsole.readLine());

        Encrypt newEncryption = new Encrypt(text, key);

//        Checks for number digits in text to be encrypted
        if(!newEncryption.isString()){
            System.out.println("Invalid Entry");
        }

//        checks to see if key is in range of 1 to 25
        if (!newEncryption.isInRange()){
            System.out.println("Key Range is between 1 and 25");
        }
//        Prints Encrypted text
        String encryptedText = newEncryption.forward();
        System.out.println(String.format("CypherText: %s", encryptedText));

    }
}
