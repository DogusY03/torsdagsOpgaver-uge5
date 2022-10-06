package Task3;

import java.util.ArrayList;

public class Main {

    public static void main (String []args){
        Customer Customers = new Customer("Jens", "Petersen", "Jens123");
        Customer Customers2 = new Customer("Lars", "Pinholt", "Isse2635");
        Customer Customers3 = new Customer("Emir", "Can", "Emircan");



        c.add(Customers);
        c.add(Customers2);
        c.add(Customers3);
        printCustomers(c);

    }
   public static ArrayList<Customer> c = new ArrayList<>();


    public static void printCustomers(ArrayList<Customer> c){
        for (Customer e:c) {
            System.out.println(e);


        }
    }
}
