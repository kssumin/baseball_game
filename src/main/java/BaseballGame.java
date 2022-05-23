import View.InputView;
import View.OutputView;

public class BaseballGame {
    public static final int RESTART = 1;

    private final Computer computer;
    private Compare compare;
    private User user;

    public BaseballGame(Computer computer, Compare compare, User user) {
        this.computer = computer;
        this.compare = compare;
        this.user = user;

    }

    public void runGame() {
        do {
            setGame();
            startGame();
            endGame();
        } while (askRetry());
    }

    private void setGame() {
        computer.setComputerNumbers();//컴퓨터 숫자가 새로 생성이 된다,.
    }

    private void startGame() {
        while (!compare.canNextPlay()) {
            OutputView.printInputBallMessage();
            user.setUserNumbers();
            compare.compare(user.getUserNumbers(), computer.getComputerNumbers());
        }
    }

    private void endGame() {
        compare.isEndGame();
    }

    private boolean askRetry() {
        OutputView.printAskReplayMessage();
        return InputView.inputRestart() == RESTART; //1입력이 되면 true 반환
    }
}
