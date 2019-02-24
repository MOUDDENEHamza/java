package geometry;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author MOUDDENE HAMZA
 *
 */
public class Schema {

    /**
     *
     * Attributes of the class.
     *
     * @param d is the big matrix of this class.
     * @param f is the the figures will be drawing on d.
     */
    protected char[][] d;

    /**
     * Constructor of class.
     */
    public Schema(int l, int c) {
        int i;
        int j;
        d = new char[l][c];
        for (i = 0; i < l; i++) {
            for (j = 0; j < c; j++) {
                d[i][j] = '.';
            }
        }
    }

    public void fill(char[][] matrix, int x, int y, int n, int p, char s) {
        int i;
        int j;
        for (i = x; i < n; i++) {
            for (j = y; j < p; j++) {
                if (i >= 10 || j >= 10) {
                    d[i][j] = matrix[n - i - 1][p - j - 1];
                    continue;
                }
                d[i][j] = matrix[i][j];
            }
        }
    }

    public void toString(int n, int p) {
        int i;
        int j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < p; j++) {
                System.out.print(d[i][j]);
            }
            System.out.println();
        }
    }

    /**
     * Main function.
     *
     * @param args the parameter while executing from terminal.
     */
    public static void main(String[] args) throws Exception {
        Schema s = new Schema(30, 30);
        Draw m1 = new Draw(10, 10);
        Draw m2 = new Draw(10, 10);
        Draw m3 = new Draw(10, 10);
        Draw m4 = new Draw(10, 10);
        Draw m5 = new Draw(10, 10);
        Rectangle r = new Rectangle(10, 10, 5, 5);
        Circle c = new Circle(10, 10, 5, 5);
        Triangle t = new Triangle(10, 10, 0, 0);
        Square square = new Square(10, 10, 5, 5);
        Oval o = new Oval(10, 10, 5, 5);
        System.out.println('\n' + "****************************GEOMETRY*******************************" + '\n');
        r.fill(m1, '*');
        s.fill(m1.matrix, 0,0,10, 10, '*');
        s.fill(m1.matrix, 0,20,10, 30, '*');
        c.fill(m2, '*');
        s.fill(m2.matrix, 10,10,20, 20, '*');
        t.fill(m3, '*');
        s.fill(m3.matrix, 20,0,30, 10, '*');
        square.fill(m4, '*');
        s.fill(m4.matrix, 20,10,30, 20, '*');
        o.fill(m5, '*');
        s.fill(m5.matrix, 20,20,30, 30, '*');
        s.toString(30, 30);
        System.out.println('\n' + "******************************END**********************************" + '\n');
    }
}