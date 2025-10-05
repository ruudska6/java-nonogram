public class PuzzlePrinter {

    public void showPuzzle(String[][] puzzle, String[] rowAnswerIndex, String[] colAnswerIndex) {
        int rows = puzzle.length;
        int cols = puzzle[0].length;

        // 각 힌트 중 가장 긴 문자열의 길이 계산
        int maxRowHintLen = 0;
        for (String rowHint : rowAnswerIndex) {
            maxRowHintLen = Math.max(maxRowHintLen, rowHint.length());
        }

        int maxColHintLen = 0;
        for (String colHint : colAnswerIndex) {
            maxColHintLen = Math.max(maxColHintLen, colHint.length());
        }

        // 가로 방향 (열 힌트) 출력
        System.out.print(" ".repeat(maxRowHintLen + 4)); // 왼쪽 여백
        for (String colHint : colAnswerIndex) {
            System.out.printf("%-" + (maxColHintLen + 2) + "s", colHint);
        }
        System.out.println();

        // 세로 방향 (행 힌트 + 퍼즐)
        for (int i = 0; i < rows; i++) {
            System.out.printf("%-" + (maxRowHintLen + 4) + "s", rowAnswerIndex[i]);
            for (int j = 0; j < cols; j++) {
                System.out.printf("%-" + (maxColHintLen + 2) + "s", puzzle[i][j]);
            }
            System.out.println();
        }

        System.out.println();
    }
}
