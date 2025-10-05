package puzzle;

public class RabbitPuzzle implements Puzzle {
    private final String[][] answerPuzzle = {
            {"■", "□", "□", "□", "■"},
            {"■", "□", "□", "□", "■"},
            {"■", "■", "■", "■", "■"},
            {"■", "■", "■", "■", "■"},
            {"■", "■", "■", "■", "■"}
    };

    private final String[] rowHints = {
            "1 1", "1 1", "5", "5", "5"
    };

    private final String[] colHints = {
            "5", "3", "3", "3", "5"
    };

    @Override
    public String[][] getPuzzle() {
        return answerPuzzle;
    }

    @Override
    public String[] getRowHints() {
        return rowHints;
    }

    @Override
    public String[] getColHints() {
        return colHints;
    }
}
