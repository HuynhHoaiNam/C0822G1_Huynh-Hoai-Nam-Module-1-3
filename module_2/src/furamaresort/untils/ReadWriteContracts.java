package furamaresort.untils;

import furamaresort.models.Contract;
import furamaresort.models.facility.Room;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class ReadWriteContracts {
    private static TreeSet<Contract> contractTreeSet = new TreeSet<>();

    //    public static List<House> readHouse() throws IOException {
    public TreeSet<Contract> readContracts() throws IOException {
        File file = new File("src\\furamaresort\\data\\contracts.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        TreeSet<Contract> contractTreeSet = new TreeSet<>();
        String[] infoContracts;
        Contract contract;
        while ((line = bufferedReader.readLine()) != null) {
            infoContracts = line.split(",");
            contract = new Contract(infoContracts[0], infoContracts[1], Integer.parseInt(infoContracts[2]), Integer.parseInt(infoContracts[3]), infoContracts[4]);
            contractTreeSet.add(contract);
        }
        bufferedReader.close();
        return contractTreeSet;
    }

    public void writeContracts() throws IOException {
        File file = new File("src\\furamaresort\\data\\contracts.csv");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Contract contract : contractTreeSet) {
            bufferedWriter.write(contract.getInfoContracts());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
