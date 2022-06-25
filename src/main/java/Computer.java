import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Computer {
    public static final int MAX_NUMBER_RANGE = 9;
    public static final int MIN_NUMBER_RANGE = 1;
    private List<Integer> computerNumbers;

    public Computer(){
        computerNumbers=new ArrayList<>();
    }
    
    public void setComputerNumbers() {
        while (computerNumbers.size() < Constant.BALL_LENGTH) {
            int candidateNumber = createRandomNumber();
            if (isContainNumber(candidateNumber)) {
                computerNumbers.add(candidateNumber);
            }
        }
    }

    public List<Integer> getComputerNumbers() {
        return computerNumbers;
    }

    private boolean isContainNumber(int randomNumber) {
        boolean isUnique;
        isUnique = !(computerNumbers.contains(randomNumber));
        return isUnique;
    }

    private int createRandomNumber() {
        int randomNum;
        Random random = new Random();
        randomNum = random.nextInt(MAX_NUMBER_RANGE) + MIN_NUMBER_RANGE;
        return randomNum;
    }
}



