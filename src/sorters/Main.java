package sorters;

import java.util.Scanner;

/**
 * @author MOUDDENE HAMZA
 * <p>
 * Main class of the package
 */
public class Main {

    public static void main(String[] args) {
        System.currentTimeMillis();
        TestTrieurs ctl = new TestTrieurs();
        System.out.println("----------------> we try with 0 elements");
        ctl.trierRandomData(0);
        System.out.println("----------------> we try with 1 elements");
        ctl.trierRandomData(1);
        System.out.println("----------------> we try with already sorted data");
        ctl.trierDejaTrie();
        System.out.println("----------------> we test with the worst case");
        ctl.trierInvTrie();
        System.out.println("----------------> On teste avec un nombre d'éléments choisi par l'utilisateur");
        boolean ok = false;
        int nbElem = 5;
        Scanner myInput = new Scanner(System.in);
        while (!ok) {
            try {
                System.out.print("Entrer le nombre d'éléments à trier >= 0 : ");
                ok = true;
                nbElem = myInput.nextInt();
                if (nbElem < 0)
                    throw new Exception(" Valeur positive ou nulle ...");
                // ne sera fermé que si la saisie est OK
                myInput.close();
            } catch (Exception exc) {
                System.out.println("Erreur de saisie" + exc.getMessage());
                ok = false;
            }
        }
        // On teste avec le nombre d'éléments choisi par l'utilisateur
        ctl.trierRandomData(nbElem);
    }
 }
