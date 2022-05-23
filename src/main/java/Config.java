import java.util.List;

public class Config {

    public Compare compare(){
        return new Compare(ball());
    }

    public Ball ball(){
        return new Ball();
    }

    public BaseballGame baseballGame(){
        return new BaseballGame(computer(),compare(),user());
    }

    public Computer computer(){
        return new Computer();
    }

    public User user(){
        return new User();
    }
}
