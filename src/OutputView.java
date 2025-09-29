public class OutputView {

    public void printLevelInputMessage() {
        System.out.print("난이도를 입력해주세요 ( 예시 1,2,3) > ");
    }

    public void showPuzzle(String[][] puzzle, String[] rowAnswerIndex, String[] colAnswerIndex) {
        int rows = puzzle.length;
        int cols = puzzle[0].length;

        // 열 힌트 먼저 출력
        System.out.print("    "); // 행 힌트 자리 공백
        for (int j = 0; j < cols; j++) {
            System.out.printf("%-3s", colAnswerIndex[j]);
        }
        System.out.println();

        // 행 힌트 + 퍼즐 출력
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
