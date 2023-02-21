import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("apple", "sweed", new BigDecimal(20), LocalDate.of(2023, 2, 1), TypeProduct.VEGETABLES);
        Product product2 = new Product("Banana", "sweed", new BigDecimal(25), LocalDate.of(2023, 2, 1), TypeProduct.VEGETABLES);
        Product product3 = new Product("Nout", "10/10", new BigDecimal(1000000), LocalDate.of(2022, 12, 3), TypeProduct.ELECTRONIC);
        Product product4 = new Product("Iphone", "10/10", new BigDecimal(4000000), LocalDate.of(2021, 8, 3), TypeProduct.ELECTRONIC);
        Product product5 = new Product("kurtka", "10/100", new BigDecimal(20000), LocalDate.of(2023, 12, 12), TypeProduct.CLOTHES);
        Product product6 = new Product("Tolstovka", "10/10", new BigDecimal(20000), LocalDate.of(2023, 12, 12), TypeProduct.CLOTHES);

        Product[] products = {product1, product2, product3, product4, product5, product6};

        Inventory inventory = new Inventory(products);
        while (true) {
            System.out.println("""
                    1. Product name
                    2. Type product
                    3. electronios
                    4. vegetables
                    """);
            int num = new Scanner(System.in).nextInt();
            switch (num) {
                case 1 -> System.out.println(inventory.productName(new Scanner(System.in).nextLine()));
                case 2 -> System.out.println(inventory.typeProduct(TypeProduct.ELECTRONIC));
                case 3 -> System.out.println(inventory.electronios(LocalDate.of(2023,1,1)));
                case 4 -> System.out.println(inventory.vegetables(LocalDate.of(2023,1,1)));

            }
        }

    }
}