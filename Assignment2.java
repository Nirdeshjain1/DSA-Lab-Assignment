public class Assignment2 {public static void main(String[] args) {

    TwoDimensionalArray matrix = new TwoDimensionalArray(2, 2);
    matrix.insertRow(0, new int[]{1, 2});
    matrix.insertRow(1, new int[]{3, 4});
    System.out.println("Matrix:");
    matrix.traverse();
    System.out.println("Transpose:");
    int[][] transpose = matrix.transposeMatrix();
    for (int[] row : transpose) {
        for (int value : row) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    System.out.println("KMP Pattern Matching: " + StringAlgorithms.kmpPatternMatch("abxabcabcaby", "abcaby"));

    System.out.println("Run-Length Encoding: " + StringAlgorithms.runLengthEncoding("aaabbbcccaaa"));
}
}
