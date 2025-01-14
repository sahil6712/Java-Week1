public class OperationOnMatrix {
    public static void main(String[] args) {
        int numRows = 2;
        int numCols = 2;
        
        // Generating random matrices
        int[][] matrixA = generateRandomMatrix(numRows, numCols);
        int[][] matrixB = generateRandomMatrix(numRows, numCols);

        // Displaying matrices
        System.out.println("Matrix A:");
        printMatrix(matrixA);
        System.out.println("Matrix B:");
        printMatrix(matrixB);

        // Performing addition
        System.out.println("\nMatrix Addition:");
        int[][] additionResult = addMatrices(matrixA, matrixB);
        if (additionResult != null) {
            printMatrix(additionResult);
        }

        // Showing subtraction
        System.out.println("\nMatrix Subtraction:");
        int[][] subtractionResult = subtractMatrices(matrixA, matrixB);
        if (subtractionResult != null) {
            printMatrix(subtractionResult);
        }

        // Showing multiplication
        System.out.println("\nMatrix Multiplication:");
        int[][] multiplicationResult = multiplyMatrices(matrixA, matrixB);
        if (multiplicationResult != null) {
            printMatrix(multiplicationResult);
        }

        // Transpose of matrix
        System.out.println("\nTranspose of Matrix A:");
        int[][] transposedMatrix = transposeMatrix(matrixA);
        printMatrix(transposedMatrix);

        // Determinant of matrix
        System.out.println("\nDeterminant of Matrix A (for 2x2):");
        if (numRows == 2 && numCols == 2) {
            System.out.println(calculateDeterminant2x2(matrixA));
        } else if (numRows == 3 && numCols == 3) {
            System.out.println(calculateDeterminant3x3(matrixA));
        } else {
            System.out.println("Determinant calculation not supported for this matrix size.");
        }

        // Inverse of matrix
        System.out.println("\nInverse of Matrix A (for 2x2):");
        if (numRows == 2 && numCols == 2) {
            double[][] inverseMatrix = calculateInverse2x2(matrixA);
            if (inverseMatrix != null) {
                for (double[] row : inverseMatrix) {
                    for (double element : row) {
                        System.out.printf("%.2f ", element);
                    }
                    System.out.println();
                }
            }
        } else {
            System.out.println("Inverse calculation not supported for this matrix size.");
        }
    }
    
    // Method for generating a random matrix
    public static int[][] generateRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        return matrix;
    }

    // Method for adding two matrices
    public static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
        if (matrixA.length != matrixB.length || matrixA[0].length != matrixB[0].length) {
            System.out.println("Matrix dimensions are incompatible for addition.");
            return null;
        }

        int rows = matrixA.length;
        int cols = matrixA[0].length;
        int[][] resultMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return resultMatrix;
    }

    // Method for subtracting two matrices
    public static int[][] subtractMatrices(int[][] matrixA, int[][] matrixB) {
        if (matrixA.length != matrixB.length || matrixA[0].length != matrixB[0].length) {
            System.out.println("Matrix dimensions are incompatible for subtraction.");
            return null;
        }

        int rows = matrixA.length;
        int cols = matrixA[0].length;
        int[][] resultMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultMatrix[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
        return resultMatrix;
    }

    // Method for multiplying two matrices
    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        if (matrixA[0].length != matrixB.length) {
            System.out.println("Matrix dimensions are incompatible for multiplication.");
            return null;
        }

        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int colsB = matrixB[0].length;
        int[][] resultMatrix = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return resultMatrix;
    }

    // Method for transposing a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposedMatrix = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        return transposedMatrix;
    }

    // Method for calculating determinant of 2x2 matrix
    public static int calculateDeterminant2x2(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    // Method for calculating determinant of 3x3 matrix
    public static int calculateDeterminant3x3(int[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) - 
               matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]) + 
               matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }

    // Method for calculating the inverse of 2x2 matrix
    public static double[][] calculateInverse2x2(int[][] matrix) {
        int determinant = calculateDeterminant2x2(matrix);
        if (determinant == 0) {
            System.out.println("Matrix is singular, inverse does not exist.");
            return null;
        }

        double[][] inverseMatrix = new double[2][2];
        inverseMatrix[0][0] = (double) matrix[1][1] / determinant;
        inverseMatrix[0][1] = -(double) matrix[0][1] / determinant;
        inverseMatrix[1][0] = -(double) matrix[1][0] / determinant;
        inverseMatrix[1][1] = (double) matrix[0][0] / determinant;
        return inverseMatrix;
    }

    // Method for printing the matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
