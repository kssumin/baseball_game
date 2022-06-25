public class Application {
    public static void main(String[] args) {
        Config config = new Config();
        BaseballGame baseballGame = config.baseballGame();
        baseballGame.runGame();
    }
}
