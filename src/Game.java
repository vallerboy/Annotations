public class Game {
    private String[] nicks;
    private int maxPlayer;

    @NeedInternet
    public void allowPlayerPlay(){
        System.out.println("Łaczy graczy..");
    }

    public void startGame(){
        System.out.println("graaa startuje");
    }
}
