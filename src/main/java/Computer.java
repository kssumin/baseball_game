import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Computer {
    public static final int LIMIT_NUMBER_RANGE = 9;
    private List<Integer> computerNumbers;


    public void setComputerNumbers() {
        computerNumbers = new ArrayList<>();
        while (computerNumbers.size() < Constant.BALL_LENGTH) {
            int tmp = createRandomNumber();
            if (!isUniqueNumber(tmp)) {
                computerNumbers.add(tmp);
            }
        }
    }

    public List<Integer> getComputerNumbers() {
        System.out.println(computerNumbers);
        return computerNumbers;
    }

    private boolean isUniqueNumber(int randomNum) {
        boolean isUnique;
        isUnique = computerNumbers.contains(randomNum);
        return isUnique;
    }

    private int createRandomNumber() {
        int randomNum;
        Random random = new Random();
        randomNum = random.nextInt(LIMIT_NUMBER_RANGE) + 1;
        return randomNum;
    }
}



