import java.util.ArrayList;

public class Compare {
    private int strikeCount;
    private int ball;
    private int retry;
    protected boolean exit;

    public Compare(){
        this.strikeCount=0;
        this.ball=0;
    }

    protected boolean getExit() {
        return exit;
    }

    private void initScore(){
        this.strikeCount=0;
        this.ball=0;
    }

    protected void initCompare(){
        this.strikeCount=0;
        this.ball=0;
        this.retry=0;
        this.exit=false;
    }

    public void compareNumber(ArrayList<Integer>userNumber, ArrayList<Integer>computerNumber) {
        initScore();
        retry++;
        for (int i = 0; i < Message.CIPHERS; i++)
        {
            validateNumber(computerNumber,userNumber.get(i),i);
        }
        result();
    }

    //strike,ball 계산
    private void validateNumber(ArrayList<Integer>computerNumber,int userNum, int userNumberIndex){
        if(computerNumber.contains(userNum)){
            if(computerNumber.get(userNumberIndex)==userNum){
                strikeCount++;
            }
            else
                ball++;
        }
    }
    //결과값 출력
    public void result(){
        if(strikeCount==3){
            System.out.println(Message.STRIKE_OUT);
            System.out.println(Message.SUCCESS);
        }else if(strikeCount==0&&ball==0){
            System.out.println(Message.BALLNET);
        }else{
            if(strikeCount!=0)System.out.print(strikeCount+Message.STRIKE);
            if(ball!=0)System.out.print(ball+Message.BALL);
        }System.out.println();
    }

}
