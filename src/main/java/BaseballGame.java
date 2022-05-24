import View.InputView;
import View.OutputView;

public class BaseballGame {
    public static final int RESTART = 1;

    private final Computer computer;
    private final Compare compare;
    private final User user;

    public BaseballGame(Computer computer, Compare compare, User user) {
        this.computer = computer;
        this.compare = compare;
        this.user = user;
    }

    public void runGame() {
        do {
            setComputer();
            System.out.println(computer.getComputerNumbers());

            startGame();
            endGame();
        } while (askRetry());
    }

    private void setComputer() {
        computer.setComputerNumbers();
    }

    private void startGame() {
        while (compare.canNextPlay()) {
            setUser();
            compare.compare(user.getUserNumbers(), computer.getComputerNumbers());
        }
    }

    private void setUser() {
        OutputView.printInputBallMessage();
        user.setUserNumbers();
    }

    private void endGame() {
        compare.isEndGame();
    }

    private boolean askRetry() {
        OutputView.printAskReplayMessage();
        return InputView.inputRestart() == RESTART;
    }
}
