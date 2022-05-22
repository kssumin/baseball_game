import java.util.ArrayList;
import java.util.Random;

public class Computer {
    public static final int LIMIT_NUMBER_RANGE = 9;
    private ArrayList<Integer> computerNumbers;

    public void initComputerNumbers() {
        computerNumbers = new ArrayList<Integer>();
    }

    public void setComputerNumbers() {
        while (computerNumbers.size() < 3) {
            int tmp = createRandomNumber();
            if (!isUniqueNumber(tmp)) {
                computerNumbers.add(tmp);
            }
        }
    }

    public ArrayList<Integer> getComputerNumbers() {
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



