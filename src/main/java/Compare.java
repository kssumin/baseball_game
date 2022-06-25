import View.OutputView;

import java.util.List;

public class Compare {
    public static final int THREE_STRIKE = 3;
    public static final int LIMIT_NUMBER_OF_ATTEMPS = 9;

    private Ball ball;
    private boolean exit;

    public Compare(Ball ball) {
        this.ball = ball;
        this.exit = false;
    }

    public void compare(List<Integer> userNumbers, List<Integer> computerNumber) {
        ball.initStrikeAndBallCount();
        ball.increaseRetryCount();
        for (int i = 0; i < Constant.BALL_LENGTH; i++) {
            validateNumber(computerNumber, userNumbers.get(i), i);
        }
        OutputView.printScoreMessage(ball.getStrikeCount(), ball.getBallCount());
    }

    private void validateNumber(List<Integer> computerNumbers, int userNum, int userNumberIndex) {
        if (computerNumbers.contains(userNum)) {
            if (computerNumbers.get(userNumberIndex) == userNum) {
                ball.increaseStrikeCount();
            } else
                ball.increaseBallCount();
        }
    }

    public boolean canNextPlay() {
        if (ball.getStrikeCount() == THREE_STRIKE) {
            exit = true;
        } else if (ball.getRetryCount() == LIMIT_NUMBER_OF_ATTEMPS) {
            exit = true;
        } else exit = false;
        return !exit;
    }

    public void isEndGame() {
        if (ball.getStrikeCount() == THREE_STRIKE) {
            OutputView.printGameSuccessMessage();
        } else {
            OutputView.printGameFailMessage();
        }
        initBall();
    }

    public void initBall() {
        ball.initRetryCount();
        ball.initStrikeAndBallCount();
    }

}

