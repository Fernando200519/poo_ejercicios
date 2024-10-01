public class TV{

    int channel = 1;
    int volumeLevel = 1;
    boolean on = false;

    public TV(){
    }

    public void turnOn(){
        on = true;
    }

    public void turnOff(){
        on = false;
    }

    public void setChannel(int _channel){
        if(on && _channel >= 1 && _channel <= 120)
        channel = _channel;
    }

    public void setVolume(int _volumeLevel){
        if(on && _volumeLevel >= 1 && _volumeLevel <= 7)
        volumeLevel = _volumeLevel;
    }

    public void channelUp(){
        if(on && channel < 120)
        channel++;
    }

    public void channelDown(){
        if(on && channel > 1)
        channel--;
    }

    public void volumeUp(){
        if(on && volumeLevel < 7)
        volumeLevel++;
    }

    public void volumeDown(){
        if(on && volumeLevel > 1)
        volumeLevel--;
    }
}