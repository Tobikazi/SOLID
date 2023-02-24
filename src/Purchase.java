// И для корзины и для покупок мы используем один и тот же класс, так что разделим их на два класса Purchase и Basket;
//
public class Purchase {
    protected String title;
    protected int count;

    public Purchase(String title, int count) {
        this.title = title;
        this.count = count;
    }
}