public class SubstituteString {
    public String mText;
    public int mKey;
    public SubstituteString(String text, int key) {
        this.mText = text;
        this.mKey = key;
    }

//    public String forward(){
//        char[] newCharArray = this.mText.toCharArray();
//        for (int i = 0; i < newCharArray.length(); i++){
//            Substitute newArray = new Substitute(newCharArray[i], this.mKey);
//            newArray.forward();
//            newCharArray = newArray;
//        }
//        return String.valueOf(newCharArray);
//    }
}
