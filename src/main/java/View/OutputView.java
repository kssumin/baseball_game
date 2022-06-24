package View;

public class OutputView {
    private static final int THREE_STRIKE = 3;
    private static final String STRIKE_OUT = "3 스트라이크 아웃";
    private static final String FOUR_BALL = "볼넷";
    private static final String STRIKE = "스트라이크";
    private static final String BALL = "볼";
    private static final String ASK_REPLAY = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
    private static final String INPUT_BALL = "숫자를 입력해주세요 : ";
    private static final String SUCCESS = "3개의 숫자를 모두 맞히셨습니다! 당신의 승리입니다.";
    private static final String FAIL = "9번의 시도 동안 맞히지 못했습니다! 당신의 패배입니다.";

    public static void printScoreMessage(int strikeCount, int ballCount) {
        if (strikeCount == THREE_STRIKE) {
            System.out.println(STRIKE_OUT);
        } else if (strikeCount == 0 && ballCount == 0) {
            System.out.println(FOUR_BALL);
        } else {
            if (strikeCount != 0){
                System.out.print(strikeCount + STRIKE);
            }
            if (ballCount != 0){
                System.out.print(ballCount + BALL);
            }
            System.out.println();
        }
    }

    public static void printAskReplayMessage() {
        System.out.print(ASK_REPLAY);
    }

    public static void printInputBallMessage() {
        System.out.print(INPUT_BALL);
    }

    public static void printGameSuccessMessage() {
        System.out.println(SUCCESS);
    }

    public static void printGameFailMessage() {
        System.out.println(FAIL);
    }
}
