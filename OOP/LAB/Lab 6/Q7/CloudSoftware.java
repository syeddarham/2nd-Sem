package Temp.Q7;


final class CloudSoftware extends LicenseSoftware {
    private final double storageLimit = 100;
    private double used_storage;
    public CloudSoftware(String name, String version, String licenseKey) {
        super(name, version, licenseKey);
    }

    public void calculateRemainingStorage(double input) {
        if (input < storageLimit) {
            double remainingStorage = storageLimit - input;
            double used_storage = (remainingStorage / storageLimit) * 100;
            System.out.println("Remaining Storage Percentage: " + used_storage + "%");
        }
        else{
            System.out.println("Invalid Input");
        }
    }

    public void displayCloudSoftware(){
        super.displaySoftware();
        System.out.println("used Storage: "+used_storage);
    }
}
