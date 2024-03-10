package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDAO;
import model.entities.Department;

import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DepartmentDAO dao = DaoFactory.createDepartmentDao();
        System.out.println("---- Test 1 : findAll Departments ----");
        List<Department> list = dao.findAll();
        for (Department d : list){
            System.out.println(d);
        }

        System.out.println("---- Test 2 : findById Departments ----");
        Department department = dao.findById(2);
        System.out.println(department);

        System.out.println("---- Test 3: insert Departments ----");
        /*Department newDepartment = new Department(null, "Food");
        dao.insert(newDepartment);
        System.out.println(newDepartment.getId() + " " + newDepartment.getName());*/
        System.out.println("---- Test 4: update Departments ----");
        department = dao.findById(3);
        department.setName("Fashion");
        dao.update(department);
        System.out.println("update completed");

        System.out.println("---- Test 5: delete Departments ----");
        System.out.println("Enter the id for delete teste:");
        int id = sc.nextInt();
        dao.deleteById(id);
        System.out.println("Delete completed");



    }
}
