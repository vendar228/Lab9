public class Office extends Facility{
    private double Area_o;

    Office() {
        super();
        Area_o = 0;
    }

    Office(String fType, double AreaValue) {
        super(fType);
        Area_o = AreaValue;
    }

    public void AreaSet(int AreaValue) {
        Area_o = AreaValue;
    }

    public double AreaValue() {
        return Area_o;
    }

    @Override
    public String toString() {
        return "Office{" +
                "Area_o=" + Area_o +
                "Type=" + getType() +
                '}';
    }
}