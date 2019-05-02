package CT2018SESSION1;

import java.util.ArrayList;

public class Dico {
    protected char c;
    protected boolean last;
    protected ArrayList<Character> al;

    public Dico() {
        c = '\0';
        last = false;
        al = new ArrayList<>();
    }

    public Dico(char charcter) {
        c = charcter;
        last = false;
        al = new ArrayList<>();
    }

    public  int indexOfChar(char c) {
        int i;
        for (i = 0; i < al.size(); i++) {
            if (al.get(i) == c) {
                return i;
            }
        }
        return -1;
    }

    public int insertChar(char c) {
        int index = indexOfChar(c);
        if (index != -1) {
            return index;
        } else {
            int i = 0;

            while (i < al.size() && al.get(i).compareTo(c) < 0) {
                i++;
            }
            al.add(i, c);
            return i;
        }
    }

    public boolean findWord(String word) {
        int i;
        char c = word.charAt(0);
        String s = word.substring(1);
        if (word.length() == 0) {
            return false;
        } else {
            int index = indexOfChar(c);
            if (index == -1) {
                return false;
            }
            findWord(s);
        }
        return true;
    }

    public void addWord(String word) throws exception {
        if (findWord(word)) {
            throw new exception("le mot est déja present");
        } else {

        }
    }

    public static void main(String[] args) {
        Dico d = new Dico();


         //d.addWord("as");
         //d.addWord("asperge");
         //d.addWord("aspic");
         //d.addWord("asticot");
         //d.addWord("essai");
         //d.addWord("art");
         //d.addWord("artiste");
         //d.addWord("astre");
         //d.addWord("est");
    }
}
