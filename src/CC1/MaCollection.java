package CC1;

public class MaCollection<E> implements ICollection<E> {

    public class Node_m {
        protected E val;
        protected Node_m suiv;
        protected Node_m prec;

        public Node_m(E val) {
            this.val = val;
            this.suiv = null;
            this.prec = null;
        }
    }

    protected Node_m prem;
    protected Node_m dern;
    protected int taille;

    public MaCollection() {
        this.taille = 0;
        this.prem = null;
        this.dern = null;
    }

    @Override
    public void add(E e) {
        Node_m n = new Node_m(e);

        if (this.taille == 0) {
            this.prem = n;
            this.dern = n;
        } else {
            this.dern.suiv = n;
            this.dern = n;
        }
        this.taille++;
    }

    @Override
    public void removeFirst() throws RuntimeException {

        if (taille == 0) {
            throw new RuntimeException("la collection est vide");
        } else {
            prem = prem.suiv;
            prem.prec = null;
        }
        this.taille--;
    }

    @Override
    public void removeLast() throws RuntimeException {

        if (taille == 0) {
            throw new RuntimeException("la collection est vide");
        } else {
            dern = dern.prec;
            dern.suiv = null;
        }
        this.taille--;
    }

    @Override
    public boolean isEmpty() {
        return taille == 0;
    }

    @Override
    public int size() {
        return taille;
    }

    @Override
    public E getFirst() throws RuntimeException {
        if (taille == 0) {
            throw new RuntimeException("la collection est vide");
        } else {
            return prem.val;
        }
    }

    @Override
    public E getLast() throws RuntimeException {
        if (taille == 0) {
            throw new RuntimeException("la collection est vide");
        } else {
            return dern.val;
        }
    }

    public String toString() {
        String str = "";
        Node_m temp = prem;

        while (temp != null) {
            str += temp.val + " ";
        }
        return str;
    }

    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }

        if (!(o instanceof MaCollection)) {
            return false;
        }

        MaCollection<E> c = (MaCollection<E>) o;
        Node_m c1 = this.prem;
        Node_m c2 = c.prem;

        if (this.taille != c.taille) {
            return false;
        }

        while (c1 != null) {
            if (c1.val != c2.val) {
                return false;
            }

            c1 = c1.suiv;
            c2 = c2.suiv;
        }

        return true;
    }

    public static void main(String[] args) {
        MaCollection<Integer> p = new MaCollection<>();
        MaCollection<Integer> q = new MaCollection<>();

        System.out.println("**********************CC1**********************");
        System.out.println("p is empty : " + p.isEmpty());
        System.out.println("Size of p : " + p.size());
        System.out.println("The p : " + p.toString());
        System.out.println("***************************END***************************");
    }
}