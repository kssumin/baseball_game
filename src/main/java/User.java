import java.util.ArrayList;
import java.util.Scanner;

public class User {
    public static final int LIMIT_NUMBERS_INDEX = 3;
    private ArrayList<Integer> userNumbers;

    public User() {
        userNumbers = new ArrayList<Integer>();
    }

    public void initUserNumbers() {
        userNumbers.clear();
    }

    public ArrayList<Integer> getUserNumbers() {
        return userNumbers;
    }

    public void setUserNumbers() {
        Scanner scanner = new Scanner(System.in);
        int inputUserNumbers = scanner.nextInt();
        toArray(inputUserNumbers);
    }

    private void toArray(int inputUserNumbers) {
        int i = 0;
        while (i < LIMIT_NUMBERS_INDEX) {
            userNumbers.add(0, inputUserNumbers % 10);
            inputUserNumbers /= 10;
            i++;
        }
    }
}
