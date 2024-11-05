//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    IphoneSetting iphone = IphoneSetting.getInstance();
    IphoneSetting iphone2 = IphoneSetting.getInstance();

    iphone.setBrightness(8);
        System.out.println(iphone.getBrightness());

        iphone.disableWifi();

        System.out.println(iphone.isWifi());
        System.out.println(iphone2.isWifi());
    }
}