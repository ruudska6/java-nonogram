import java.util.Arrays;

public class Nonogram {
    private String[][] puzzle;
    private int level;
    private final static int Lt = 3;

    public String[][] getPuzzle() {
        return puzzle;
    }

    public void setPuzzle(int row, int col) {
        if (puzzle[row][col].equals("0")) {
            puzzle[row][col] = "1";

            //TODO blocks 추가 예정

        } else {
            System.out.println("이미 칠한 곳 입니다.");
        }
    }



    public void compareAnswer(String[][] rabitPuzzle, int row, int col) {
        if(rabitPuzzle[row][col].equals("1")) {
            setPuzzle(row, col);
        } else {
            System.out.println("틀렸습니다.");
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

    public String[][] createPuzzle() {
        String[][] puzzle = {
                {"0","0","0","0","0"},
                {"0","0","0","0","0"},
                {"0","0","0","0","0"},
                {"0","0","0","0","0"},
                {"0","0","0","0","0"}
        };
        return puzzle;
    }


}
