package musicPlayer;

public class IPod implements MusicPlayer {
    @Override
    public void playMusic() {
        System.out.println("Playing music on Ipod");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Music paused on Ipod");
    }

    @Override
    public void selectMusic() {
        System.out.println("Choose song you want to listen on Ipod");
    }
}
