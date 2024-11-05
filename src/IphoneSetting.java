public class IphoneSetting {
    private int brightness ;
    private boolean  wifi;

    private static IphoneSetting instance;

    // constructor
    private IphoneSetting(){
    }


    public static IphoneSetting getInstance(){
        if (instance==null){
            instance = new IphoneSetting();
        }
        return instance;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        if (brightness<= 10 && brightness>=1){
        this.brightness = brightness;}
        else{
            System.out.println("enter valid brightness between 1-10");
        }
    }

    public String isWifi() {
        if (wifi == true){
            return "wifi enabled";
        }
        else{
            return "wifi disabled";
        }
    }


    public void enableWifi(){
    this.wifi = true;
    }
    public void disableWifi(){
        this.wifi=false;
    }

}
