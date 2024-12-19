public class OutputView {

    public void printLevelInputMessage() {
        System.out.print("난이도를 입력해주세요 ( 예시 1,2,3) > ");
    }

    public void showPuzzle(String[][] puzzle) {
        for (int i = 0; i < puzzle.length; i++) {
            for (int j = 0; j < puzzle[i].length; j++) {
                System.out.print(puzzle[i][j]);
            }
            System.out.println();
        }
    }
}
