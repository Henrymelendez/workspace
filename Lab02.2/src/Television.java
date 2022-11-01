import java.util.Objects;

public class Television {

    // Fields
    private String brand = "Toshiba";
    private int volume = 1;
    private int savedVolume;
    private boolean muted;
    public static final int MAX = 100;
    public static final int MIN = 0;
    private DisplayType displayType = DisplayType.LED;



    public Television(){

    }


    public Television (String brand, int volume) {
        setBrand(brand);
        setVolume(volume);
    }

    public Television(String brand, int volume, DisplayType displayType) {
        this(brand, volume);
        setDisplayType(displayType);
    }

    public Television(String brand) {
        this.brand = brand;
    }

    public Television(int volume) {
        this.volume = volume;
    }

    // Business Logic
    public void turnOn() {
        System.out.println("turning on  " + brand + " Televsion" + " at volume " + volume);
    }

    public void turnOff() {
        System.out.println("Turning off");
    }

    // Accessors
    public String getBrand() {
        return brand;
    }


    public DisplayType getDisplayType() {
        return displayType;
    }

    public void setDisplayType(DisplayType displayType) {
        this.displayType = displayType;
    }

    public void setBrand(String brand) {

        switch (brand){
            case "Samsung":
            case "LG":
            case "Toshiba":
            case "Sony":
                this.brand = brand;
                break;
            default:
                System.out.println("Not a valid Brand");

        }



    }

    public int getSavedVolume() {
        return savedVolume;
    }

    public void setSavedVolume(int savedVolume) {
        this.savedVolume = savedVolume;
    }

    public boolean isMuted() {
        return muted;
    }

    public void setMuted(boolean muted) {
        this.muted = muted;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {

        if(volume < MIN || volume > MAX){
            System.out.println("Please set volume between 0 and 100");
        }
        else{
            this.volume = volume;

        }

    }

    public boolean mute(){

        if(muted){
            setVolume(savedVolume);
            setMuted(false);
            System.out.println("TV is Un-Muted");
        }
        else {
            setSavedVolume(volume);
            setVolume(0);
            setMuted(true);
            System.out.println("TV is Muted");
        }



        return muted;
    }

    public static DisplayType convertStringtoDisplayType(String s){

        switch (s){
            case "LED":
                return DisplayType.LED;
            case "OLED":
                return DisplayType.OLED;
            case "LCD":
                return DisplayType.LCD;
            case "CRT":
                return DisplayType.CRT;
            case "PLASMA":
                return DisplayType.PLASMA;

            default:
                return DisplayType.LED;

        }
    }


    //ToString()
    @Override
    public String toString() {
        return "Television{" +
                "brand='" + brand + '\'' +
                ", volume=" + volume +
                '}' + " DisplayType= "+ displayType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Television that = (Television) o;
        return volume == that.volume && savedVolume == that.savedVolume && muted == that.muted && brand.equals(that.brand) && displayType == that.displayType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, volume, savedVolume, muted, displayType);
    }
}
