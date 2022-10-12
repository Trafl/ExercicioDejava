package app;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for(int i = 1; i <=n; i++){
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            if(ch == 'c'){
                Product product = new Product(name, price);
                list.add(product);
            }

            if(ch == 'u'){
                System.out.print("Manufacture  date (DD/MM/YYYY): ");
                String m = sc.next();
                LocalDate date = LocalDate.parse(m,df);
                Product product = new UsedProduct(name, price, date);
                list.add(product);
            }

            if(ch == 'i'){
                System.out.print("Customs fee: ");
                double fee = sc.nextDouble();
                Product product = new ImportedProduct(name, price, fee);
                list.add(product);
            }

        }

        System.out.println("Price Tags: ");
        for( Product i: list){
            System.out.println(i.toString());
        }

        sc.close();
    }
}
