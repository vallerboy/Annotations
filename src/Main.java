import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();



        for (Method method : Game.class.getDeclaredMethods()) {
            System.out.println(method.getName());
        }


    }
}
