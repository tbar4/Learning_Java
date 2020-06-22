package Ch_09_Objects_and_Classes;

public class TV {
    int channel = 1;
    int volume = 1;
    boolean on = false;

    public TV() {
    }
    public void turnOn() {
        on = true;
    }
    public void turnOff() {
        on = false;
    }
    public void setChannel(int newChannel) {
        if (on && newChannel >= 1 && newChannel <= 120)
            channel = newChannel;
    }
    public void setVolume(int newVolumeLevel) {
        if(on && newVolumeLevel >= 1 && newVolumeLevel <= 7)
            volume = newVolumeLevel;
    }
    public void channelUp() {
        if (on && channel < 120)
            channel++;
    }
    public void channelDown() {
        if (on && channel > 1)
            channel--;
    }
    public void volumeUp() {
        if (on && volume < 7)
            volume++;
    }
    public void volumeDown() {
        if (on && volume > 1)
            volume--;
    }
}
