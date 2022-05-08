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

    public ArrayList<Integer> getUserNumber() {
        return userNumber;
    }

    public void setUserNumber() {
        Scanner scanner = new Scanner(System.in);
        int input=scanner.nextInt();
        changeToArray(input);
    }

    private void changeToArray(int input){
        int i=0;
        while(i<Message.CIPHERS){
            userNumber.add(0,input % 10);
            input/=10;
            i++;
        }
    }

    public int choiceRetry(){
        Scanner scanner=new Scanner(System.in);
        int whetherToRestart=scanner.nextInt();
        return whetherToRestart;
    }

}
