package View;

import java.util.Scanner;

public class InputView {
    public static int inputRestart() {
        Scanner scanner = new Scanner(System.in);
        int whetherToRestart = scanner.nextInt();
        return whetherToRestart;
    }
}
