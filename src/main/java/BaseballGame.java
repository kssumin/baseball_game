public class BaseballGame {
    private Computer computer;
    private User user;
    private Compare compare;

    public BaseballGame() {
        this.computer = new Computer();
        this.user = new User();
        this.compare=new Compare();
    }

    public void startGame() {
        while (true) {
            computer.setComputerNumber();
            while(!compare.isNextPlay()){
                user.userInit();
                user.setUserNumber();
                compare.compareNumber(computer.getComputerNumber(), user.getUserNumber());
            }if(checkReplay())compare.initCompare();
            else{break;}
        }
    }

    public boolean checkReplay(){

    }
}
