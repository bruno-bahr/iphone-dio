import internetBrowser.InternetBrowser;
import internetBrowser.WebBrowser;
import iphone.Iphone;
import musicPlayer.IPod;
import musicPlayer.MusicPlayer;
import phoneDevice.PhoneDevice;

import java.nio.file.WatchEvent;

public class Main {
    public static void main(String[] args) {
        Iphone ip = new Iphone();
        IPod ipod = new IPod();


        InternetBrowser ib = ip;
        MusicPlayer mp = ipod;
        PhoneDevice pd = ip;

        ib.showPage();
        mp.selectMusic();
        pd.takeCall();
        ip.addNewTab();


    }
}