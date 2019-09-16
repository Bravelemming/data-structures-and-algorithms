package repeated_word;

public class RepeatedWord {

    //vars
    String[] words;
    int size;

    //cons
    public RepeatedWord(String input){
        //should give an array of words without punctuation
        this.words = input.split("\\W+");
        this.size = this.words.length;
    }

    //gets and sets

    public String[] getWords() {
        return words;
    }

    public void setWords(String[] words) {
        this.words = words;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    //methods
    public String check(){
        //make a unique hashtable of the size (plus one just because).
        Hashtable u = new Hashtable(getSize());
        //push words into hashtable
        for(String word : getWords()){

            boolean flag = u.has(word);
            if (flag) return word;
            u.set(word, word);
        }
        return "And so it was that there were no repeated words.  Crabapple.";
    }


}
