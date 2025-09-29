public class PuzzlePrinter {

    public void showPuzzle(String[][] puzzle, String[] rowAnswerIndex, String[] colAnswerIndex) {
        int rows = puzzle.length;
        int cols = puzzle[0].length;

        System.out.print("    ");
        for (int j = 0; j < cols; j++) {
            System.out.printf("%-3s", colAnswerIndex[j]);
        }
        System.out.println();

        for (int i = 0; i < rows; i++) {
            System.out.printf("%-4s", rowAnswerIndex[i]);
            for (int j = 0; j < cols; j++) {
                System.out.print(puzzle[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
