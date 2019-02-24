package geometry;

/**
 * @author MOUDDENE HAMZA
 */
public class Triangle extends Figure {

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
    public Triangle(int l, int c, int x, int y) {
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
        for (i = 0; i < this.l; i++) {
            for (j = this.c / 2; j < this.c; j++) {
                if (i == j && i != this.l - 1) {
                    drawing.setPoint(i, j, s);
                }
                if (i == this.l - 1) {
                    drawing.setPoint(i, j, s);
                }
            }
        }
        for (i = 0; i < this.c / 2; i++) {
                drawing.setPoint(l - 1 - i, i, s);
                drawing.setPoint(l - 1, i, s);
        }
    }
}