import java.util.ArrayList;
import java.util.Scanner;

public class User {
    private ArrayList<Integer> userNumber;
    public User(){
        userNumber=new ArrayList<Integer>();
    }
    public void userInit(){
        userNumber.clear();
    }

    public ArrayList<Integer> getUserNumbers() {
        return userNumber;
    }

    public void setUserNumbers() {
        Scanner scanner = new Scanner(System.in);
        int inputUserNumbers=scanner.nextInt();
        changeToArray(inputUserNumbers);
    }

    private void changeToArray(int inputUserNumbers){
        int i=0;
        while(i<Message.LIMIT_NUMBERS_INDEX){
            userNumber.add(0,inputUserNumbers % 10);
            inputUserNumbers/=10;
            i++;
        }
    }

    public int inputRestart(){
        Scanner scanner=new Scanner(System.in);
        int whetherToRestart=scanner.nextInt();
        return whetherToRestart;
    }

}
