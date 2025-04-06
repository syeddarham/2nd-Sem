package Q4;

public class Bus {
    private int Bus_id;
    private String Bus_number;
    private Transportation AssignedRoute;

    public Bus( String bus_number, int bus_id) {
        Bus_number = bus_number;
        Bus_id = bus_id;
    }

    public int getBus_id() {
        return Bus_id;
    }

    public String getBus_number() {
        return Bus_number;
    }

    public Transportation getAssignedRoute() {
        return AssignedRoute;
    }
    public void setAssignedRoute(Transportation assignedRoute) {
        this.AssignedRoute = assignedRoute;
        System.out.println("Bus:"+Bus_number+" Assigned Route:"+assignedRoute.getRouteName());

    }
}
