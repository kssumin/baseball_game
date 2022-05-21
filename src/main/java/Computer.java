import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


public class Computer {
    private ArrayList<Integer>computerNumbers;

    //초기화
    private void initcomputerNumbers(){
        computerNumbers=new ArrayList<Integer>();
    }

    //3자리 숫자 생성
    protected void setcomputerNumbers(){

        initcomputerNumbers();
        while(computerNumbers.size()<3){
            int tmp=createRandomNumber();
            if(!isUniqueNumber(tmp)){
                computerNumbers.add(tmp);
            }
        }
    }

    public ArrayList<Integer> getcomputerNumbers() {
        return computerNumbers;
    }

    //중복 아닌지 확인
    private boolean isUniqueNumber(int randomNum){
        boolean isUnique;
        isUnique=computerNumbers.contains(randomNum);
        return isUnique;
    }


    //각 숫자 랜덤으로 생성
    private int createRandomNumber(){
        int randomNum;
        Random random=new Random();
        randomNum=random.nextInt(Message.LIMIT_NUMBER_RANGE)+1;
        return randomNum;
    }
}



