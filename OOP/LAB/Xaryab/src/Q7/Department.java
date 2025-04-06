package Q7;

public class Department {
    private String DepartName;
    private String Location;

    public Department(String departName, String location) {
        DepartName = departName;
        Location = location;
    }
    public void Display_Dept_Details()
    {
        System.out.println("Department Name: "+DepartName);
        System.out.println("Location: "+Location);
    }
}
