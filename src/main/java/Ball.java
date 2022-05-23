public class Ball {
    private int strikeCount;
    private int ballCount;

    public Ball(){
        this.strikeCount = 0;
        this.ballCount = 0;
    }

    public int getStrikeCount() {
        return strikeCount;
    }
    public int getBallCount(){
        return ballCount;
    }

    public void incStrikeCount() {
        strikeCount += 1;
    }

    public void incBallCount() {
        ballCount += 1;
    }
}
