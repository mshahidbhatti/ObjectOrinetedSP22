package week5;
import java.lang.*;
public class MediaPlayer extends Object{
    protected String name;
    protected int volume; //0  -- 50
    protected boolean isOn;


    public MediaPlayer(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public boolean isOn() {
        return isOn;
    }

    public int volumeUp(){

        setVolume(volume++);
        return volume;
    }
    public int volumeDwn(){
        setVolume(volume--);
        return volume;
    }


    public void setOn(boolean on) {
        isOn = on;
    }

    public void play(){
        isOn=true;
    }

    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if(volume>=0&&volume<=50)
            this.volume = volume;
    }
}
