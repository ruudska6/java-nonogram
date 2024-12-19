import java.util.Scanner;

public class GameController {
    private final OutputView outputView;

    public GameController() {
        this.outputView = new OutputView();
    }

    public void RunGame() {

        while(true) {

            String[][] answerPuzzle = {
                    {"1", "0", "0", "0", "1"},
                    {"1", "0", "0", "0", "1"},
                    {"1", "0", "1", "0", "1"},
                    {"1", "1", "1", "1", "1"},
                    {"1", "1", "1", "1", "1"}
            };

            String[] answerIndex = {
                    "1,1 / 5",
                    "1,1 / 1,1",
                    "5 / 3",
                    "1,1,1 / 1,1",
                    "5 / 5"
            };


            Scanner sc = new Scanner(System.in);
            Nonogram nonogram = new Nonogram();
            String[][] userPuzzle = nonogram.createPuzzle();
            // outputView.printLevelInputMessage();
            // nonogram.setLevel(sc.nextInt());

            for (int i = 0; i < 5; i++) {
                System.out.print(answerIndex[i]);
            }

            outputView.showPuzzle(nonogram.getPuzzle());

            System.out.print("행을 입력해주세요 >");
            int row = sc.nextInt();
            System.out.print("열을 입력해주세요 > ");
            int col = sc.nextInt();

            nonogram.compareAnswer(answerPuzzle, row, col);

            if (nonogram.clearCondition(userPuzzle, answerPuzzle)) {
                System.out.println("축하드립니다. 게임에 성공하셨습니다.");
                break;
            }
        }
    }
}
