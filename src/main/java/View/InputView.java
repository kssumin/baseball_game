package View;

import java.util.Scanner;

public class InputView {
    static Scanner scanner = new Scanner(System.in);

    public static int inputRestart() {
        int whetherToRestart = scanner.nextInt();
        return whetherToRestart;
    }

    public static int inputNumbers() {
        int inputUserNumbers = scanner.nextInt();
        return inputUserNumbers;
    }
}
