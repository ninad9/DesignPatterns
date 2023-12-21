

public class Main {
 public static void main(String[] args)  {
    System.out.println("Creating object using prototype design");
    
    NetworkConnection networkConnection1 = new NetworkConnection();
    networkConnection1.setIp("192.164.1.1");
    try {
        networkConnection1.loadData();
        NetworkConnection networkConnection2 = (NetworkConnection) networkConnection1.clone();
        NetworkConnection networkConnection3 = (NetworkConnection) networkConnection1.clone();
        
        System.out.println(networkConnection1);
        System.out.println(networkConnection2);
        System.out.println(networkConnection3);
    } catch (CloneNotSupportedException | InterruptedException e) {
        e.printStackTrace();
    }
 }
}