package internetBrowser;

public class WebBrowser implements InternetBrowser{
    @Override
    public void showPage() {
        System.out.println("Showing web page on internet browser");
    }

    @Override
    public void addNewTab() {
        System.out.println("Adding a new tab on internet browser");
    }

    @Override
    public void refreshPage() {
        System.out.println("Refreshing page on internet browser");
    }
}
