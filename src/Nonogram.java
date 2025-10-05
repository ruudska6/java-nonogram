import java.util.Arrays;

public class Nonogram {
    private String[][] puzzle;
    private int life = 3;
    private Level level;

    public Nonogram(int rows, int cols) {
        puzzle = new String[rows][cols];
        for (int i = 0; i < rows; i++) {
            Arrays.fill(puzzle[i], "□");
        }
    }

    public void setLevel(Level level) {
        this.level = level;
        this.life = level.getLife();
        System.out.println("현재 레벨: " + level + " | 목숨: " + life);
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

    public void compareAnswer(String[][] rabbitPuzzle, int row, int col) {
        if(rabbitPuzzle[row][col].equals("■")) {
            setPuzzle(row, col);
        } else {
            System.out.println("틀렸습니다. 목숨 -1");
            System.out.println("현재 목숨: " + --life);
        }
    }

    public boolean clearCondition(String[][] userPuzzle, String[][] answer) {
        return Arrays.deepEquals(userPuzzle, answer);
    }

    public int getLife() {
        return life;
    }
}
