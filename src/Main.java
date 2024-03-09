import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        SellerDAO sellerDAO = DaoFactory.createSellerDao();

        System.out.println("=== TEST n°1: seller findById====");
        Seller seller = sellerDAO.findById(3);
        System.out.println(seller);
        System.out.println("\n=== TEST n°1:  seller findByDepartment====");
        Department department = new Department(2, null);
        List<Seller> list = sellerDAO.findByDepartment(department);
        for (Seller s : list){
            System.out.println(s);
        }


    }
}