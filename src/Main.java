public class Main {
    public static void main(String[] args) throws Exception {
        double[][] matrixValues = {
                { 2, 1, 2 },
                { 3, 2, 2 },
                { 1, 2, 3 }
        };

        double[][] matrix2Values = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        Matrix matrix = new Matrix(matrixValues);
        Matrix matrix2 = new Matrix(matrix2Values);

        double[] columnUpdate = { 5, 5, 5 };
        matrix.setRow(columnUpdate, 1);
        matrix.setEntry(4, 1, 1);
        matrix.printMatrix();
    }
}