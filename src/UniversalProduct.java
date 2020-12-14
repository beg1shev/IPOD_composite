public class UniversalProduct implements Product {
    private int price;
    private String name;

    public UniversalProduct(int price, String name){
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
