package puzzle;

public class CatPuzzle implements Puzzle {
    private final String[][] answerPuzzle = {
        {"□","■","□","■","□","■","□"},
        {"■","□","■","□","■","□","■"},
        {"■","■","■","■","■","■","■"},
        {"□","■","■","■","■","■","□"},
        {"■","■","■","■","■","■","■"},
        {"■","□","■","□","■","□","■"},
        {"□","■","□","■","□","■","□"}
    };

    private final String[] rowHints = {"1 1 1","1 1 1 1","7","5","7","1 1 1 1","1 1 1"};
    private final String[] colHints = {"3","4","5","5","5","4","3"};

    @Override public String[][] getPuzzle() { return answerPuzzle; }
    @Override public String[] getRowHints() { return rowHints; }
    @Override public String[] getColHints() { return colHints; }
}
