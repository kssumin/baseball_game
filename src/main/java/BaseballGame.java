public class BaseballGame {
    private Computer computer;
    private User user;
    private Compare compare;

    public BaseballGame() {
        this.computer = new Computer();
        this.user = new User();
        this.compare = new Compare();
    }

    public void startGame() {
        while (true) {
            computer.setcomputerNumbers();
            while (!compare.canNextPlay()) {
                user.userInit();
                user.setUserNumbers();
                compare.compareNumbers(user.getUserNumbers(), computer.getcomputerNumbers());
            }
            if (isNextGameSet()) compare.initCompare();
            else {
                break;
            }
        }
    }

    public boolean isNextGameSet() {
        System.out.println(Message.ASK_REPLAY);
        if (user.inputRestart() == Message.RESTART) {
            return true;
        } else {
            return false;
        }
    }
}
