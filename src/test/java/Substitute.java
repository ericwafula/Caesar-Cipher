public class Substitute {
    public int mKey;
    public char mText;

    public Substitute(char text, int key) {
        this.mText = text;
        this.mKey = key;
    }

    public char forward(){
        int castText = (int) mText;
        castText += this.mKey;
        char castBackToChar = (char) castText;
        return castBackToChar;
    }
}