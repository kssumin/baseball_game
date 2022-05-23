import View.InputView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {
    private List<Integer> userNumbers;

    public List<Integer> getUserNumbers() {
        return userNumbers;
    }

    public void setUserNumbers() {
        userNumbers = new ArrayList<Integer>();
        toArray(InputView.inputNumbers());
    }

    private void toArray(int inputUserNumbers) {
        int i = 0;
        while (i < Constant.BALL_LENGTH) {
            userNumbers.add(0, inputUserNumbers % 10);
            inputUserNumbers /= 10;
            i++;
        }
    }
}
