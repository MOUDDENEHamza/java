package geometry;

/**
 * @author MOUDDENE HAMZA
 */
public class Draw {

    /**
     * Attributes
     *
     * @param matrix represents the matrix of characters.
     */
    protected char[][] matrix;

    /**
     * Constructor that creates an empty matrix.
     */
    public Draw(int n, int p) {
        int i;
        int j;
        matrix = new char[n][p];
        for (i = 0; i < n; i++) {
            for (j = 0; j < p; j++) {
                matrix[i][j] = '.';
            }
        }
    }

    /**
     * Calculation of the number of lines inside the matrix.
     *
     * @return an Integer representing the number of lines.
     */
    public int numberLines() {
        return this.matrix.length;
    }

    /**
     * Calculation of the number of Columns inside the matrix.
     *
     * @return an Integer representing the number of columns.
     */
    public int numberColumns() {
        return this.matrix[0].length;
    }

    private boolean isInside(int n, int p) {
        return (0 <= n && n < this.numberLines()) && (0 <= p && p < this.numberColumns());
    }

    public void setPoint(int n, int p, char c) throws Exception {
        if (!this.isInside(n, p)) {
            throw new Exception("ERROR : Out of range");
        }
        this.matrix[n][p] = c;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        int i;
        int j;
        for (i = 0; i < numberLines(); i++) {
            for (j = 0; j < numberColumns(); j++) {
                s.append(matrix[i][j]);
            }
            s.append("\n");
        }
        return s.toString();
    }

}