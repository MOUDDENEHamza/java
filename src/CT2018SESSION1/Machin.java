package CT2018SESSION1;

public class Machin {
    public String methode1(String s) {
        int longueur = s.length();
        String resultat = new String();
        for (int i = 0; i < longueur; i++) {
            resultat = resultat + s.charAt(longueur - i - 1);
        }
        return resultat;
    }

    public boolean methode2(String chaine) {
        String autre = methode1(chaine);
        return (autre.equals(chaine));
    }

    public static void main(String[] args) {
        Machin machin = new Machin();
        String test = "ada";
        System.out.println(machin.methode2(test));
        test = "java";
        System.out.println(machin.methode2(test));
    }
}

