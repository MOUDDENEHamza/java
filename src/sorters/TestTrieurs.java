package sorters;

import java.util.Random;
import java.util.ArrayList;

public class TestTrieurs {
    /**
     * nombre d'éléments à trier, afin de tester pour 0, 1, ou plusieurs éléments
     */
    protected int nbElem;
    /**
     * pour tester on fixe le type des éléments à Integer
     */
    protected Trieur<Integer> t[];
    /**
     * permet d'obtenir les données à trier
     */
    protected Random r = new Random();
    // On peut tester jusqu'à 5 trieurs
    private int nbTrieurs = 5;

    @SuppressWarnings("unchecked")
    public TestTrieurs() {
        t = new Trieur[nbTrieurs];
        for (int num = 0; num < nbTrieurs; num++) {
            t[num] = creerTrieur(num);
        }
    }

    /**
     * Design pattern "fabrique", crée une instance de trieur à partir d'un numéro
     *
     * @param num numéro du trieur à créer en fonction du menu proposé
     * @return instance de trieur, référence un trieur concret
     */
    public Trieur<Integer> creerTrieur(int num) {
        Trieur<Integer> t = null;
        switch (num + 1) {
            case 1:
                t = new SelectionSorter<Integer>();
                break;
            case 2:
                t = new TrieurBulle<Integer>();
                break;
            case 3:
                t = new TrieurShaker<Integer>();
                break;
            case 4:
                t = new TrieurPivot<Integer>();
                break;
            case 5:
                t = new TrieurFusion<Integer>();
                break;
            default:
        }
        return t;
    }

    /**
     * Lance le tri sur les données de v
     * calcule et affiche la durée en millisecondes + le nombre d'itérations
     */
    public void lancerTri(Trieur<Integer> t) {
        try {
            System.out.println("Avant tri : " + t.getData());
            long debut = System.currentTimeMillis();
            int nbPerm = t.sort();
            long fin = System.currentTimeMillis();
            System.out.println("Après tri : " + t.getData());
            System.out.println(" Temps pour "
                    + t.getData().size() + " elements avec "
                    + t.getClass().getName()
                    + " : " + (fin - debut) + " ms. Nb d'itérations : " + nbPerm);
        } catch (Exception e) {
            System.out.println("Erreur de tri des données " + t.getData() + " avec "
                    + t.getClass().getName());
        }

    }


    /**
     * Méthode privée qui teste tous les trieurs à partir de données fournies par l'appelant
     *
     * @param data données à trier
     */
    private void lancerTousLesTrieurs(ArrayList<Integer> data) {
        for (int num = 0; num < nbTrieurs; num++) {
            t[num].setData(data);
            lancerTri(t[num]);
        }
    }

    /**
     * teste tous les trieurs sur n éléments initialisés de façon aléatoire
     *
     * @param nbVal nombre de valeurs à tester
     */
    public void trierRandomData(int nbVal) {
        ArrayList<Integer> v = new ArrayList<>();
        for (int i = 0; i < nbVal; i++) {
            v.add((int) (r.nextFloat() * 500.0));
        }
        lancerTousLesTrieurs(v);
    }

    /**
     * teste tous les trieurs sur 100 éléments initialisés de façon croissante
     */
    public void trierDejaTrie() {
        // init croissant
        ArrayList<Integer> v = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            v.add(i);
        }
        lancerTousLesTrieurs(v);
    }

    /**
     * teste tous les trieurs sur 100 éléments initialisés de façon décroissante
     */
    public void trierInvTrie() {
        // init décroissant
        ArrayList<Integer> v = new ArrayList<>();
        for (int i = 100; i > 0; i--) {
            v.add(i);
        }
        lancerTousLesTrieurs(v);
    }
}
