package InterfaceEx;

interface Playable {
    void play();
    void pause();
    void stop();

}
class MP3Player implements Playable {

    @Override
    public void play() {
        System.out.println("노래가 나와요");
    }

    @Override
    public void pause() {
        System.out.println("노래가 잠시 멈췄어요");
    }

    @Override
    public void stop() {
        System.out.println("노래가 정지됐어요");
    }
}

class DVDPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("동영상이 나와요");
    }

    @Override
    public void pause() {
        System.out.println("동영상이 잠시 멈췄어요");
    }

    @Override
    public void stop() {
        System.out.println("동영상이 정지됐어요");
    }
}
public class InterfaceWork {
    public static void main (String[] args) {
        MP3Player mp3 = new MP3Player();
        mp3.play();
        mp3.pause();
        mp3.stop();

        DVDPlayer dvd = new DVDPlayer();
        dvd.play();
        dvd.pause();
        dvd.stop();
    }
}
