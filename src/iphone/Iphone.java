package iphone;

import internetBrowser.InternetBrowser;
import musicPlayer.MusicPlayer;
import phoneDevice.PhoneDevice;

public class Iphone  implements InternetBrowser, MusicPlayer, PhoneDevice {
    @Override
    public void showPage() {
        System.out.println("Showing web page on iPhone");
    }

    @Override
    public void addNewTab() {
        System.out.println("Adding a new tab on iPhone");
    }

    @Override
    public void refreshPage() {
        System.out.println("Refreshing page on iPhone");
    }
    @Override
    public void playMusic() {
        System.out.println("Playing music on iPhone");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Music paused on iPhone");
    }

    @Override
    public void selectMusic() {
        System.out.println("Choose song you want to listen on iPhone");
    }

    @Override
    public void makeCall() {
        System.out.println("Making a phone call on iPhone");
    }

    @Override
    public void takeCall() {
        System.out.println("Taking a call on iPhone");
    }

    @Override
    public void startVoiceMail() {
        System.out.println("Checking voice mail on iPhone");
    }
}
