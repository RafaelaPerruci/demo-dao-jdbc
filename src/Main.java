import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Department obj = new Department(1, "Books");

        System.out.println(obj);
        Seller seller = new Seller(1, "Bob", "bob@gmail.com",
                LocalDate.parse("20/07/2022", fmt1), 3000.0, obj);

        System.out.println(seller);

        SellerDAO sellerDAO = DaoFactory.createSellerDao();

    }
}