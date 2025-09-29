public class RabbitPuzzle {

    private final String[] rowAnswerIndex = {"1 1", "1 1", "5", "5", "5"};

    private final String[] colAnswerIndex = {"5", "3", "3", "3", "5"};

    private final String[][] AnswerPuzzle = {
            {"■", "□", "□", "□", "■"},
            {"■", "□", "□", "□", "■"},
            {"■", "■", "■", "■", "■"},
            {"■", "■", "■", "■", "■"},
            {"■", "■", "■", "■", "■"}
    };

    public String[] getRowAnswerIndex() {
        return rowAnswerIndex;
    }

    public String[] getColAnswerIndex() {
        return colAnswerIndex;
    }

    public String[][] getAnswerPuzzle() {
        return AnswerPuzzle;
    }
}


