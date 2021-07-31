public class Decrypt {
    private int mKey;
    private String mText;

    Decrypt(String text, int key) {
        this.mText = text;
        this.mKey = key;
    }
    public String backward(){
        char[] newCharText = mText.toCharArray();

        for (int i = 0; i < newCharText.length; i++){
            int castText = ((int) newCharText[i] - 97 - this.mKey) % 26 + 97;
            newCharText[i] = (char)castText;
        }

        final String newS = String.valueOf(newCharText);
        return newS;
    }
}
