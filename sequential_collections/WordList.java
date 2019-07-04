import java.util.TreeSet;

public class WordList {
    public static void main(String[] args) {
        String text;

        text = "We hold these truths to be self-evident that all men are created equal that they are endowed by their Creator with certain unalienable Rights that among these are Life Liberty and the pursuit of Happiness That to secure these rights Governments are instituted among Men deriving their just powers from the consent of the governed That whenever any Form of Government becomes destructive of these ends it is the Right of the People to alter or to abolish it and to institute new Government laying its foundation on such principles and organizing its powers in such form as to them shall seem most likely to effect their Safety and Happiness";

        String[] words = text.split(" ");

        System.out.println("Number of words: " + words.length);

        TreeSet<String> wordList = new TreeSet<String>();

        for (String word : words) {
            wordList.add(word); 
        }

        System.out.println("Number of UNIQUE words: " + wordList.size());
    }
}

