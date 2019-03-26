package Tree;

import java.util.Random;
import java.util.Scanner;

public class MainSearchBinTree {
    public static void main(String args[]) {
        Random rd = new Random();
        SearchBinTree<Integer> bt;
        SearchBinTree<Integer> bt2;
        Scanner sc = new Scanner(System.in);
        int v = 0;
        bt = new SearchBinTree<>(); // créé vide
        System.out.println("-------------> Test avec arbre vide \nVue de l'arbre : " + bt.root);

        System.out.println("Infixe : " + bt);
        bt.setTypeParcours(TypeParcours.PREFIXE);
        System.out.println("Prefixe : " + bt);
        bt.setTypeParcours(TypeParcours.POSTFIXE);
        System.out.println("Postfixe : " + bt);

        System.out.println("La valeur " + v + " est contenue dans l'arbre : " + bt.contains(v));
        v = rd.nextInt(50);
        System.out.println("La valeur " + v + " est contenue dans l'arbre : " + bt.contains(v));
        System.out.println("La profondeur de l'arbre est : " + bt.getProf());

        bt = new SearchBinTree<>(); // créé vide
        v = rd.nextInt(50);
        bt.add(v);
        System.out.println("-------------> Test avec 1 valeur " + v + "\nVue de l'arbre : " + bt.root);

        System.out.println("bt Infixe : " + bt);
        bt.setTypeParcours(TypeParcours.PREFIXE);
        System.out.println("Prefixe : " + bt);
        bt.setTypeParcours(TypeParcours.POSTFIXE);
        System.out.println("Postfixe : " + bt);

        System.out.println("La valeur " + v + " est contenue dans l'arbre : " + bt.contains(v));
        bt2 = new SearchBinTree<>();
        bt2.add(v);
        v = rd.nextInt(50);
        System.out.println("La valeur " + v + " est contenue dans l'arbre : " + bt.contains(v));
        System.out.println("La profondeur de l'arbre est : " + bt.getProf());
        System.out.println("bt2 Infixe : " + bt2);

        System.out.println("Les deux arbres sont égaux : " + bt.equals(bt2));
        bt2 = new SearchBinTree<>();
        System.out.println("bt2 Infixe : " + bt2);
        System.out.println("Les deux arbres sont égaux : " + bt.equals(bt2));

        System.out.print("-------------> Test avec nb de valeurs quelconque à saisir \nCombien de valeurs : ");
        int nbVal = sc.nextInt();

        // on crée l'arbre avec une première valeur
        bt = new SearchBinTree<>(); // créé vide
        System.out.print("Ordre d'ajout : ");
        for (int i = 0; i < nbVal; i++) {
            v = rd.nextInt(50);
            System.out.print(v + " ");
            bt.add(v);
        }

        System.out.println("\nVue de l'arbre : " + bt.root);

        System.out.println("Infixe : " + bt);
        bt.setTypeParcours(TypeParcours.PREFIXE);
        System.out.println("Prefixe : " + bt);
        bt.setTypeParcours(TypeParcours.POSTFIXE);
        System.out.println("Postfixe : " + bt);

        System.out.println("La valeur " + v + " est contenue dans l'arbre : " + bt.contains(v));
        v = rd.nextInt(50);
        System.out.println("La valeur " + v + " est contenue dans l'arbre : " + bt.contains(v));
        System.out.println("La profondeur de l'arbre est : " + bt.getProf());

        sc.close();
    }
}