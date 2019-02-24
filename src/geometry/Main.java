package geometry;

/**
 * @author MOUDDENE HAMZA
 */
public class Main {

    /**
     * Main function.
     *
     * @param args the parameter while executing from terminal.
     */
    public static void main(String[] args) throws Exception {
        Draw m1 = new Draw(11, 11);
        Draw m2 = new Draw(8, 14);
        Draw m3 = new Draw(9, 12);
        Draw m4 = new Draw(15, 30);
        Draw m5 = new Draw(15, 30);

        Triangle t = new Triangle(11, 11, 5, 5);
        Rectangle r = new Rectangle(8, 14, 5, 5);
        Square s = new Square(9, 12, 5, 5);
        Oval o = new Oval(15, 30, 5, 5);
        Circle c = new Circle(15, 30, 5, 5);

        System.out.println('\n' + "******************************DRAW******************************" + '\n');

        System.out.println("My triangle : ");
        t.fill(m1, 'T');
        String triangle = m1.toString();
        System.out.println(triangle);

        System.out.println("My rectangle : " + '\n' + '\n');
        r.fill(m2, 'R');
        String rectangle = m2.toString();
        System.out.println(rectangle);

        System.out.println("My square : " + '\n' + '\n');
        s.fill(m3, 'S');
        String square = m3.toString();
        System.out.println(square);

        System.out.println("My oval : " + '\n' + '\n');
        o.fill(m4, 'O');
        String oval = m4.toString();
        System.out.println(oval);

        System.out.println("My circle : " + '\n' + '\n');
        c.fill(m5, 'C');
        String circle = m5.toString();
        System.out.println(circle);

        System.out.println('\n' + "******************************END*******************************" + '\n');
    }
}