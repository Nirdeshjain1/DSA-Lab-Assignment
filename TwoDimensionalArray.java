public class TwoDimensionalArray {
    private int[][] matrix;
    private int rows;
    private int cols;

    public TwoDimensionalArray(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.matrix = new int[rows][cols];
    }

    public void insertRow(int rowIndex, int[] values) {
        if (rowIndex >= 0 && rowIndex < rows && values.length == cols) {
            matrix[rowIndex] = values;
        } else {
            System.out.println("Invalid row index or values length");
        }
    }

    public void insertColumn(int colIndex, int[] values) {
        if (colIndex >= 0 && colIndex < cols && values.length == rows) {
            for (int i = 0; i < rows; i++) {
                matrix[i][colIndex] = values[i];
            }
        } else {
            System.out.println("Invalid column index or values length");
        }
    }

    public void deleteRow(int rowIndex) {
        if (rowIndex >= 0 && rowIndex < rows) {
            for (int i = rowIndex; i < rows - 1; i++) {
                matrix[i] = matrix[i + 1];
            }
            matrix[rows - 1] = new int[cols]; // Clear the last row
        } else {
            System.out.println("Invalid row index");
        }
    }

    public void traverse() {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public int[][] transposeMatrix() {
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
}
