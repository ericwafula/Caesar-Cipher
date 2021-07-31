public class CheckForDigit {
    public boolean isString(String text){
        for (int i = 0; i < text.length(); i++){
            if (text.charAt(i) >= '0' && text.charAt(i) <= '9'){
                System.out.println("Expected characters or words");
                return false;
            }
        }
        return true;
    }
}