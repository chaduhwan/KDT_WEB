package InterfaceEx;

public class GameMain {
    public static void main(String[] args) {
        LoLGame game1 = new LoLGame();
        game1.up();
        game1.down();
        game1.right();
        game1.left();

        DiabloGame game2 = new DiabloGame();
        game2.up();
        game2.down();
        game2.right();
        game2.left();
    }
}
