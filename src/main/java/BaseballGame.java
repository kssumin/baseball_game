import View.InputView;
import View.OutputView;

public class BaseballGame {
    public static final int RESTART = 1;

    private Computer computer;
    private User user;
    private Compare compare;
    private boolean newGameSet;

    public BaseballGame() {
        this.computer = new Computer();
        this.user = new User();
        this.compare = new Compare();
        this.newGameSet=true;
    }

    public void runGame() {
        do {
            setGame();
            startGame();
            endGame();
        }while(askRetry());
    }

    private void setGame() {
        computer.initComputerNumbers();
        computer.setComputerNumbers();
    }

    private void startGame() { //playGame
        while (!compare.canNextPlay()) {
            user.initUserNumbers();
            OutputView.printInputBallMessage();
            user.setUserNumbers();
            compare.compare(user.getUserNumbers(), computer.getComputerNumbers());
        }
    }

    private void endGame() {
        if(compare.getStrikeCount()==3){
            OutputView.printGameSuccessMessage();
        }else{
            OutputView.printGameFailMessage();
        }
    }

    private boolean askRetry() {
        OutputView.printAskReplayMessage();
        if (InputView.inputRestart() == RESTART) {
            newGameSet=true;
        }else newGameSet = false;
        return newGameSet;
    }
}
