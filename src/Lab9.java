public class Lab9 {
    public static void main(String[] args) {
        House house = new House();
        Flat Flat1 = new Flat("2-room Flexi", 67);
        house.addf(Flat1);
        house.addf(new Flat("4-Room", 120));
        Office Office1 = new Office("Storage Unit", 1267);
        house.addf(Office1);
        house.printHouse();
        System.out.println("Количество Квартир - " + house.countFlat() + " Количество Офисов - " + house.countOffice());
    }
}