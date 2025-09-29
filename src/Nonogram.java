import java.util.Arrays;

public class Nonogram {
    private String[][] puzzle;

    private int level;
    private final static int Lt = 3;

    public Nonogram(int rows, int cols) {
        puzzle = new String[rows][cols];
        for (int i = 0; i < rows; i++) {
            Arrays.fill(puzzle[i], "□");
        }
    }

    public String[][] getPuzzle() {
        return puzzle;
    }



    public void setPuzzle(int row, int col) {
        if (puzzle[row][col].equals("□")) {
            puzzle[row][col] = "■";

            //TODO blocks 추가 예정

        } else {
            System.out.println("이미 칠한 곳 입니다.");
        }
    }

    public boolean compareAnswer(String[][] rabbitPuzzle, int row, int col) {
        if(rabbitPuzzle[row][col].equals("■")) {
            setPuzzle(row, col);
            return true;
        } else {
            System.out.println("틀렸습니다.");
            return false;
        }
    }

    public boolean clearCondition(String[][] userPuzzle, String[][] answer) {
        return Arrays.deepEquals(userPuzzle, answer);
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
