package week5;

public class AudioPlayer extends MediaPlayer{

    private String fileType;
    private int bitRate;
    private int currentRate;
    AudioPlayer(String name,int volume, String fileType, int bitRate){
        super(name,volume);
        this.bitRate=bitRate;
        this.fileType=fileType;
    }

    public String getFileType() {
        return fileType;
    }

    public int changeQuality(){
        if(currentRate<=bitRate)
            currentRate++;
        return currentRate;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public int getBitRate() {
        return bitRate;
    }

    public void setBitRate(int bitRate) {
        this.bitRate = bitRate;
    }
}
