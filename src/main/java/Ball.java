public class Ball {
    private int strikeCount;
    private int ballCount;
    private int retry;

    public Ball() {
        this.strikeCount = 0;
        this.ballCount = 0;
        this.retry = 0;
    }

    public void initStrikeAndBallCount() {
        this.strikeCount = 0;
        this.ballCount = 0;
    }

    public void incRetryCount() {
        retry += 1;
    }

    public int getRetryCount() {
        return retry;
    }

    public void initRetryCount() {
        this.retry = 0;
    }

    public int getStrikeCount() {
        return strikeCount;
    }

    public int getBallCount() {
        return ballCount;
    }

    public void incStrikeCount() {
        strikeCount += 1;
    }

    public void incBallCount() {
        ballCount += 1;
    }
}
