package furamaresort.untils;

import furamaresort.models.facility.House;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteHouse {
    private static List<House> houseList = new ArrayList<>();
//    public static List<House> readHouse() throws IOException {
    public  List<House> readHouse() throws IOException {
        File file = new File("src\\furamaresort\\data\\house.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        List<House> houseList = new ArrayList<>();
        String[] infoHouse;
        House house;
        while ((line = bufferedReader.readLine()) != null) {
            infoHouse = line.split(",");
            house = new House(infoHouse[0], infoHouse[1], Double.parseDouble(infoHouse[2]), Double.parseDouble(infoHouse[3]), Integer.parseInt(infoHouse[4]), infoHouse[5], infoHouse[6], Integer.parseInt(infoHouse[7]));
            houseList.add(house);
        }
        bufferedReader.close();
        return houseList;
    }

    public void writeHouse() throws IOException {
        File file = new File("src\\furamaresort\\data\\house.csv");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (House house : houseList) {
            bufferedWriter.write(house.getInfoHouse());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
