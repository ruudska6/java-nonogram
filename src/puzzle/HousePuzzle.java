package puzzle;

public class HousePuzzle implements Puzzle {
    private final String[][] answerPuzzle = {
        {"□","□","□","□","■","□","□","□","□","□"},
        {"□","□","□","■","■","■","□","□","□","□"},
        {"□","□","■","■","■","■","■","□","□","□"},
        {"□","■","■","■","■","■","■","■","□","□"},
        {"■","■","■","■","■","■","■","■","■","□"},
        {"■","□","□","□","□","□","□","□","■","□"},
        {"■","□","■","■","■","■","■","□","■","□"},
        {"■","□","■","□","□","□","■","□","■","□"},
        {"■","□","■","■","■","■","■","□","■","□"},
        {"■","■","■","■","■","■","■","■","■","□"}
    };

    private final String[] rowHints = {"1","3","5","7","9","2 1","1 5 1","1 1 1","1 5 1","9"};
    private final String[] colHints = {"5","4","7","6","7","6","7","4","5","1"};

    @Override public String[][] getPuzzle() { return answerPuzzle; }
    @Override public String[] getRowHints() { return rowHints; }
    @Override public String[] getColHints() { return colHints; }
}
