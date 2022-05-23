package View;

import java.util.Scanner;

public class InputView {
    public static int inputRestart() {
        Scanner scanner = new Scanner(System.in);
        int whetherToRestart = scanner.nextInt();
        return whetherToRestart;
    }

    public static int inputNumbers(){
        Scanner scanner = new Scanner(System.in);
        int inputUserNumbers = scanner.nextInt();
        return inputUserNumbers;
    }
}
