public class Main {
    public static void main(String[] args) {
        Product cheese = new Cheese(100, "Russian");
        Product milk = new Milk(50, "Prostokvashino");
        Product chips = new UniversalProduct(70, "Chips");
        Product cola = new UniversalProduct(60, "cola");

        CompoundBox box1 = new CompoundBox("Box for homies");
        CompoundBox box2 = new CompoundBox("Box for guests");
        CompoundBox box3 = new CompoundBox("Compound Box");
//        System.out.println(cheese.calcPrice());
        box1.addProduct(cheese);
        box1.addProduct(milk);
        box2.addProduct(chips);
        box2.addProduct(cola);
        box3.addProduct(box1);
        box3.addProduct(box2);
        System.out.println(box3.calcPrice());
        box3.printName();
    }
}
