import java.util.ArrayList;

public class Compare {
    private int strikeCount;
    private int ball;
    private int retry;
    protected boolean exit;

    public Compare() {
        initCompare();
    }

    protected boolean getExit() {
        return exit;
    }

    private void initScore() {
        this.strikeCount = 0;
        this.ball = 0;
    }

    protected void initCompare() {
        this.strikeCount = 0;
        this.ball = 0;
        this.retry = 0;
        this.exit = false;
    }

    public void compareNumbers(ArrayList<Integer> userNumber, ArrayList<Integer> computerNumbers) {
        initScore();
        retry++;
        for (int i = 0; i < Message.LIMIT_NUMBERS_INDEX; i++) {
            validateNumber(computerNumbers, userNumber.get(i), i);
        }
        result();
    }

    //strike,ball 계산
    private void validateNumber(ArrayList<Integer> computerNumbers, int userNumber, int userNumberIndex) {
        if (computerNumbers.contains(userNumber)) {
            if (computerNumbers.get(userNumberIndex) == userNumber) {
                strikeCount++;
            } else
                ball++;
        }
    }

    //결과값 출력
    public void result() {
        if (strikeCount == Message.THREE_STRIKE) {
            System.out.println(Message.STRIKE_OUT);
            System.out.println(Message.SUCCESS);
        } else if (strikeCount == 0 && ball == 0) {
            System.out.println(Message.FOUR_BALL);
        } else {
            if (strikeCount != 0) System.out.print(strikeCount + Message.STRIKE);
            if (ball != 0) System.out.print(ball + Message.BALL);
        }
        System.out.println();
    }

    public boolean canNextPlay() {
        if (strikeCount == Message.THREE_STRIKE) {
            exit = true;
        } else if (retry == Message.LIMIT_NUMBER_OF_ATTEMPS) {
            exit = true;
        } else {
            exit = false;
        }
        return exit;
    }

}
