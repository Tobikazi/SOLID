import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("В МАГАЗИНЕ В НАЛИЧИИ");
        for (Map.Entry<String, Integer> productAndPrice : ListOfProducts.products.entrySet()) {
            System.out.println(productAndPrice.getKey() + " за " + productAndPrice.getValue() + " руб./шт.");
        }

        System.out.println("Введите два слова: название товара и количество. Или end");
        Scanner scanner = new Scanner(System.in);
        //Меняем класс Purchase на Basket ниже;
        Basket purchase = new Basket(ListOfProducts.products);
        while (true) {
            String line = scanner.nextLine();
            if ("end".equals(line)) break;
            String[] parts = line.split(" ");
            String product = parts[0];
            int count = Integer.parseInt(parts[1]);
            purchase.addPurchase(product, count);
        }
        long sum = purchase.sum();
        //передаем products не в sum, а в basket (22 строчка)
        System.out.println("ИТОГО: " + sum);
    }
}
