import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


public class Computer {
    private ArrayList<Integer>computerNumber;

    //초기화
    private void initComputerNumber(){
        computerNumber=new ArrayList<Integer>();
    }

    //3자리 숫자 생성
    protected void setComputerNumber(){
        initComputerNumber();
        while(computerNumber.size()<3){
            int tmp=createRandomNumber();
            if(!isUniqueNumber(tmp)){
                computerNumber.add(tmp);
            }
        }
    }

    public ArrayList<Integer> getComputerNumber() {
        return computerNumber;
    }

    //중복 아닌지 확인
    private boolean isUniqueNumber(int randomNum){
        boolean isUnique;
        isUnique=computerNumber.contains(randomNum);
        return isUnique;
    }


    //각 숫자 랜덤으로 생성
    private int createRandomNumber(){
        int randomNum;
        Random random=new Random();
        randomNum=random.nextInt(9)+1;
        return randomNum;
    }
}



