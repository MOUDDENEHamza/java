package geometry;

/**
 * @author MOUDDENE HAMZA
 */
public abstract class Figure {
    /**
     * Attributes
     *
     * @param drawing represents the matrix of characters.
     * @param x the coordinate of the line.
     * @param y the coordinate of the column.
     */
    protected Draw drawing;
    protected int x;
    protected int y;

    /**
     * Constructor of the class.
     *
     * @param l represents the matrix lentgh.
     * @param c represents the matrix height.
     * @param x the coordinate of the line.
     * @param y the coordinate of the column.
     */
    public Figure(int l, int c, int x, int y) {
        this.drawing = new Draw(l, c);
        this.x = x;
        this.y = y;
    }

    /**
     * Abstract method that fills the drawing shape with the correspondent characters.
     *  @param drawing represents the matrix of characters.
     * @param s       represents the character by what the drawing will be filling.
     */
    public abstract void fill(Draw drawing, char s) throws Exception;

}	
