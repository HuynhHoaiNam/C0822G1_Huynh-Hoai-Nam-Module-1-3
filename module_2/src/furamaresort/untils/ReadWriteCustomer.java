package furamaresort.untils;

import furamaresort.models.person.Customer;

import java.io.*;
import java.time.LocalDate;
import java.util.LinkedList;

public class ReadWriteCustomer {
    public  LinkedList<Customer> readCustomer() throws IOException {
        File file = new File("src\\furamaresort\\data\\customer.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = "";
        LinkedList<Customer> customerList = new LinkedList<>();
        String[] info;
        Customer customer;
        while (((line = bufferedReader.readLine()) != null)) {
            info = line.split(",");
            customer = new Customer(info[0], info[1], LocalDate.parse(info[2]), info[3], info[4],
                    info[5], info[6], info[7], info[8]);
            customerList.add(customer);
        }
        bufferedReader.close();
        return customerList;
    }

    public void writeCustomer(LinkedList<Customer> customerList) throws IOException {
        File file2 = new File("src\\furamaresort\\data\\customer.csv");
        FileWriter fileWriter = new FileWriter(file2);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Customer customer : customerList) {
            bufferedWriter.write(customer.getInfoCustomer());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
