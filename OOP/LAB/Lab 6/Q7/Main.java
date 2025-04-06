package Temp.Q7;

public class Main {
    public static void main(String[] args) {
        Software s = new Software("VS-Code", "21.1", "ABCD-EFGH-H1DA");
        s.displaySoftware();
        LicenseSoftware ls = new LicenseSoftware("Youtube", "16.2", "ASDASD-HSHDA-18AHA");
        ls.checkExpiry();
        ls.displayLicenseSoftware();
        CloudSoftware cs =new CloudSoftware("VNC", "7.8.9", "SGDASH-SDAJSH-12SAD");
        cs.calculateRemainingStorage(10);
        cs.displayCloudSoftware();
    }
}
