public class Main {
    public static void main(String[] args) {
        
        AppleCharger appleCharger = new Adapter(new XiaomiCharger());

        Iphone13 iphone13 = new Iphone13(appleCharger);
        
        iphone13.chargeIphone();

    }
}
