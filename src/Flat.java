public class Flat extends Facility{
    private double Area;

    Flat() {
        super();
        Area = 0;
    }

    Flat(String fType, double AreaValue) {
        super(fType);
        Area = AreaValue;
    }

    public void AreaSet(int AreaValue) {
        Area = AreaValue;
    }

    public double AreaValue() {
        return Area;
    }

    @Override
    public String toString() {
        return "Office{" +
                "Area_o=" + Area +
                "Type=" + getType() +
                '}';
    }
}