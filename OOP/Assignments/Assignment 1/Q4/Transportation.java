package Q4;

import java.util.ArrayList;

public class Transportation {
    private int route_id;
    private String routeName;
    private ArrayList<String> stops;

    public String getRouteName() {
        return routeName;
    }

    public int getRoute_id() {
        return route_id;
    }

    public Transportation(int route_id, String routeName) {
        this.route_id = route_id;
        this.routeName = routeName;
        stops=new ArrayList<>();
    }
    public void addStop(String stop) {
        stops.add(stop);
        System.out.println("Stop added to route"+this.routeName);
    }
    public void removeStop(String stop) {
        if(stops.contains(stop)){
            stops.remove(stop);
        }
        else {
            System.out.println("Stop not found in route"+this.routeName);
        }
    }

    public ArrayList<String> getStops() {
        return stops;
    }

}
