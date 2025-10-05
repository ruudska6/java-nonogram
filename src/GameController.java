import java.util.Scanner;

public class GameController {
    private final PuzzlePrinter puzzlePrinter;

    public GameController() {
        this.puzzlePrinter = new PuzzlePrinter();
    }

    public void RunGame() {
        RabbitPuzzle answerPuzzle = new RabbitPuzzle();
        Nonogram nonogram = new Nonogram(answerPuzzle.getPuzzle().length, answerPuzzle.getPuzzle()[0].length);

        Scanner sc = new Scanner(System.in);
        String[][] userPuzzle = nonogram.getPuzzle();


        System.out.print("난이도를 설정해주세요 (1~5): > ");

        int levelNum = 0;
        while (true) {
            if (!sc.hasNextInt()) {
                System.out.println("숫자를 입력해주세요!");
                sc.next();
                continue;
            }

            levelNum = sc.nextInt();

            if (levelNum >= 1 && levelNum <= 5) {
                break;
            } else {
                System.out.println("잘못된 난이도입니다. 1~5 사이의 숫자를 입력해주세요.");
            }
        }

        Level selectedLevel = Level.valueOf("LEVEL" + levelNum);
        nonogram.setLevel(selectedLevel);

        System.out.println("난이도 설정 완료! 현재 목숨: " + nonogram.getLife());


        while(true) {
            puzzlePrinter.showPuzzle(
                    userPuzzle,
                    answerPuzzle.getRowHints(),
                    answerPuzzle.getColHints()
            );

            System.out.print("행을 입력해주세요 > ");
            int row = sc.nextInt() - 1;
            if (row >= userPuzzle.length) {
                System.out.println("1이상 " + userPuzzle.length + "미만의 숫자를 입력해주세요");
                continue;
            }

            System.out.print("열을 입력해주세요 > ");
            int col = sc.nextInt() - 1;
            if (col >= userPuzzle.length) {
                System.out.println("1이상 " + userPuzzle.length + "미만의 숫자를 입력해주세요");
                continue;
            }

            nonogram.compareAnswer(answerPuzzle.getPuzzle(), row, col);

            if (nonogram.getLife() == 0) {
                System.out.println("GAME OVER!! ");
                break;
            }

            if (nonogram.clearCondition(userPuzzle, answerPuzzle.getPuzzle())) {
                System.out.println("축하드립니다 \uD83C\uDF89 게임을 클리어하셨습니다!!");
                puzzlePrinter.showPuzzle(
                        userPuzzle,
                        answerPuzzle.getRowHints(),
                        answerPuzzle.getColHints()
                );
                break;
            }
        }
    }
}
