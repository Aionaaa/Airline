import java.util.ArrayList;

public class Plane {
    private ArrayList<Plane> planes;
    private PlaneType planeType;

    public Plane(PlaneType planeType) {
        this.planes = new ArrayList<Plane>();
        this.planeType = planeType;
    }

    public PlaneType getPlaneType() {
        return this.planeType;
    }
}
