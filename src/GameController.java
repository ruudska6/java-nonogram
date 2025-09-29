import java.util.Scanner;

public class GameController {
    private final OutputView outputView;

    public GameController() {
        this.outputView = new OutputView();
    }

    public void RunGame() {
        RabbitPuzzle answerPuzzle = new RabbitPuzzle();
        Nonogram nonogram = new Nonogram(answerPuzzle.getAnswerPuzzle().length, answerPuzzle.getAnswerPuzzle()[0].length);
        Scanner sc = new Scanner(System.in);
        String[][] userPuzzle = nonogram.getPuzzle();

        while(true) {
            outputView.showPuzzle(
                    userPuzzle,
                    answerPuzzle.getRowAnswerIndex(),
                    answerPuzzle.getColAnswerIndex()
            );

            System.out.print("행을 입력해주세요 >");
            int row = sc.nextInt() - 1;
            if (row > userPuzzle.length) {
                System.out.println(userPuzzle.length + "미만의 숫자를 입력해주세요");
                continue;
            }

            System.out.print("열을 입력해주세요 > ");
            int col = sc.nextInt() - 1;
            if (col > userPuzzle.length) {
                System.out.println(userPuzzle.length + "미만의 숫자를 입력해주세요");
                continue;
            }

            boolean isAnswer = nonogram.compareAnswer(answerPuzzle.getAnswerPuzzle(), row, col);
            outputView.showPuzzle(
                    userPuzzle,
                    answerPuzzle.getRowAnswerIndex(),
                    answerPuzzle.getColAnswerIndex()
            );

            if (nonogram.clearCondition(userPuzzle, answerPuzzle.getAnswerPuzzle())) {
                System.out.println("축하드립니다. 게임에 성공하셨습니다.");
                break;
            }
        }
    }
}
