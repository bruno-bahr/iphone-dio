package phoneDevice;

public class Telephone implements PhoneDevice{
    @Override
    public void makeCall() {
        System.out.println("Making a phone call on telephone");
    }

    @Override
    public void takeCall() {
        System.out.println("Taking a call on telephone");
    }

    @Override
    public void startVoiceMail() {
        System.out.println("Checking voice mail on telephone");
    }
}
