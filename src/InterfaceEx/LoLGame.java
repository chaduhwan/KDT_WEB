package InterfaceEx;

public class LoLGame implements GameConsole{

    @Override
    public void up() {
        System.out.println("앞으로 이동");
    }
    @Override
    public void down() {
        System.out.println("뒤로 이동");
    }
    @Override
    public void right() {
        System.out.println("오른쪽으로 이동");
    }
    @Override
    public void left() {
        System.out.println("왼쪽으로 이동");
    }

}
