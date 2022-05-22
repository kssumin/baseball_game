import View.OutputView;

import java.util.ArrayList;

public class Compare {
    public static final int THREE_STRIKE = 3;
    public static final int LIMIT_NUMBER_OF_ATTEMPS = 9;
    public static final int GAME_NUMBER_LENGTH = 3;

    private int strikeCount;
    private int ballCount;
    private int retry;
    private boolean exit;

    public Compare() {
        initCompare();
    }

    private void initScore() {
        this.strikeCount = 0;
        this.ballCount = 0;
    }

    private void initCompare() {
        this.strikeCount = 0;
        this.ballCount = 0;
        this.retry = 0;
        this.exit = false;
    }

    public int getStrikeCount(){
        return strikeCount;
    }

    private void incStrikeCount() {
        strikeCount+=1;
    }

    private void incBallCount() {
        ballCount+=1;
    }

    public void compare(ArrayList<Integer>userNumbers, ArrayList<Integer>computerNumber) {
        initScore();
        retry++;
        for (int i = 0; i < GAME_NUMBER_LENGTH; i++)
        {
            validateNumber(computerNumber,userNumbers.get(i),i);
        }
        OutputView.printScoreMessage(strikeCount,ballCount);
    }

    private void validateNumber(ArrayList<Integer>computerNumber,int userNum, int userNumbersIndex){
        if(computerNumber.contains(userNum)){
            if(computerNumber.get(userNumbersIndex)==userNum){
                incStrikeCount();
            }
            else
                incBallCount();
        }
    }

    public boolean canNextPlay() {
        if (strikeCount == THREE_STRIKE) {
            exit = true;
        } else if (retry == LIMIT_NUMBER_OF_ATTEMPS) {
            exit = true;
        } else exit = false;
        return exit;
    }

}

