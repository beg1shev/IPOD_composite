public class Milk implements Product{
    private int price;
    private String name;

    public Milk(int price, String name){
        this.price = price;
        this.name = name;
    }

    @Override
    public int calcPrice() {
        return price;
    }

    @Override
    public void printName() {
        System.out.println(name);
    }
}
