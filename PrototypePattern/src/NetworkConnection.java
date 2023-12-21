public class NetworkConnection implements Cloneable{

    private String ip;
    private String data;

    public String getIp() {
        return ip;
    }
    public void setIp(String ip) {
        this.ip = ip;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    public void loadData() throws InterruptedException{
        // suppose this method performs heavy operation to load the data
        this.data = "Very important data";
        //to visualize object creation
        Thread.sleep(5000);
    }

@Override
protected Object clone() throws CloneNotSupportedException {
    return super.clone();
}    

@Override
    public String toString() {
        return this.ip + " : " + this.data;
 }

}