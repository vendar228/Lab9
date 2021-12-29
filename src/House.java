import java.util.ArrayList;

public class House {
    private ArrayList<Facility> facilities = new ArrayList<Facility>();

    public void addf(Facility m) {
        facilities.add(m);
    }

    public House() {

    }

    public int countFlat() {
        int count = 0;
        for (Facility a : facilities) {
            if (a instanceof Flat)
                count++;
        }
        return count;
    }

    public int countOffice() {
        int count = 0;
        for (Facility a : facilities) {
            if (a instanceof Office)
                count++;
        }
        return count;
    }

    public House(ArrayList<Facility> n) {
        facilities = n;
    }

    public void printHouse() {
        System.out.println("В доме: ");
        for (Facility a : facilities) {
            System.out.println("\t" + a.toString());
        }
    }
}