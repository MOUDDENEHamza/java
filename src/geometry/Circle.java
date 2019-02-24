package geometry;

/**
 *
 * @author MOUDDENE HAMZA
 *
 */
public class Circle extends Figure {

    /**
     * Attributes
     *
     * @param l is the size of the half line.
     * @param c is the size of the half line.
     */
    protected int l;
    protected int c;

    /**
     * Constructor of the class.
     *
     * @param l represents the matrix lentgh.
     * @param c represents the matrix height.
     * @param x the coordinate of the line.
     * @param y the coordinate of the column.
     */
    public Circle(int l, int c, int x, int y) {
        super(l, c, x, y);
        this.l = l;
        this.c = c;
    }

    /**
     * Method that fills the drawing shape with the correspondent characters.
     *
     * @param drawing represents the matrix of characters.
     * @param s       represents the character by what the drawing will be filling.
     */
    public void fill(Draw drawing, char s) throws Exception {
        int i;
        int j;
        int r = l / 2;
        for (i = 0; i < this.l; i++) {
            for (j = 0; j < this.c; j++) {
                if (Math.pow(i - r, 2) + Math.pow(j - r, 2) <= Math.pow(r, 2)){
                    drawing.setPoint(i, j, s);
                }
            }
        }
    }
}
