public class Adapter implements AppleCharger {

    private AndroidCharger androidCharger;
    
    public Adapter(AndroidCharger androidCharger) {
        this.androidCharger = androidCharger;
    }

    @Override
    public void chargeIphone() {
       androidCharger.chargeAndroidPhone();
       System.out.println("Phone is charging with adapter");
    }
    
}
