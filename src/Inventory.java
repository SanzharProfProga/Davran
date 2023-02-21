import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Inventory implements Method {
    private Product[] products;

    public Inventory(Product[] products) {
        this.products = products;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    @Override
    public String productName(String name) {
        for (Product p: products) {
            if (p.getName().equals(name));
            return p.toString();
        }
        return "Invalid product name";
    }

    @Override
    public String typeProduct(TypeProduct typeProduct) {
        for (Product p: products) {
            if (p.getTypeProduct().equals(typeProduct)){
                return p.toString();
            }
        }
        return "Invalid type product";
    }

    @Override
    public LocalDate vegetables(LocalDate vegetables) {
        for (Product f: products) {
            int a = Period.between(f.getMadeOfDate(), LocalDate.now()).getDays();
            if (a > 10) {
                System.out.println("Просрочка");
                break;
            }
        }
        return null;
    }

    @Override
    public LocalDate electronios(LocalDate electronios) {
        for (Product p: products) {
           int a = Period.between(p.getMadeOfDate(), LocalDate.now()).getMonths();

            if (a<= 6) {
                System.out.println("50% скитка");
                break;
            }

        }
        return electronios;
    }
}
