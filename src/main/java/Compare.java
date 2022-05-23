import View.OutputView;

import java.util.ArrayList;
import java.util.List;

public class Compare {
    //TODO
    //compare 객체 생성하기 -> compare 할 때마다 볼객체 생성이 되어서 initball,strike는 된다ㅣ.
    public static final int THREE_STRIKE = 3;
    public static final int LIMIT_NUMBER_OF_ATTEMPS = 9;

    private Ball ball;
    private int retry;
    private boolean exit;


    public Compare(Ball ball) {
        this.ball=ball;
        this.retry=0;
        this.exit=false;
    }

    private void incRetryCount() {
        retry += 1;
    }

    public void compare(List<Integer> userNumbers, List<Integer> computerNumber) {
        incRetryCount();
        for (int i = 0; i < Constant.BALL_LENGTH; i++) {
            validateNumber(computerNumber, userNumbers.get(i), i);
        }
        OutputView.printScoreMessage(ball.getStrikeCount(), ball.getBallCount());
    }

    private void validateNumber(List<Integer> computerNumbers, int userNum, int userNumberIndex) {
        if (computerNumbers.contains(userNum)) {
            if (computerNumbers.get(userNumberIndex) == userNum) {
                ball.incStrikeCount();
            } else
                ball.incBallCount();
        }
    }

    public boolean canNextPlay() {
        if (ball.getStrikeCount() == THREE_STRIKE) {
            exit = true;
        } else if (retry == LIMIT_NUMBER_OF_ATTEMPS) {
            exit = true;
        } else exit = false;
        return exit;
    }

    public void isEndGame(){
        if (ball.getStrikeCount() == 3) {
            OutputView.printGameSuccessMessage();
        } else {
            OutputView.printGameFailMessage();
        }
    }

}

