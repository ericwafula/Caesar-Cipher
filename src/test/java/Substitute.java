public class Substitute {
    private int mKey;
    private String mText;

    Substitute(String text, int key) {
        this.mText = text;
        this.mKey = key;
    }

    public String forward(){
        char[] newCharText = mText.toCharArray();

        for (int i = 0; i < newCharText.length; i++){
            int castText = (int) newCharText[i] + this.mKey;
            newCharText[i] = (char)castText;
        }

        final String newS = String.valueOf(newCharText);
        return newS;
    }
}
