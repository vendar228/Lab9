public class Facility {
    private String fasType;

    public Facility() {
        fasType = "";
    }
    public Facility(String Type) {
        fasType = Type;
    }
    public void SetType(String temp) {
        fasType = temp;
    }
    public String getType() {
        return fasType;
    }
}