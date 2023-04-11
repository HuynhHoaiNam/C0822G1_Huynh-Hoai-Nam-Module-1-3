package furamaresort.untils;

import furamaresort.models.facility.House;
import furamaresort.models.facility.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteVilla {
    private static List<Villa> villaList = new ArrayList<>();

    //    public static List<House> readHouse() throws IOException {
    public List<Villa> readVilla() throws IOException {
        File file = new File("src\\furamaresort\\data\\villa.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        List<Villa> villaList = new ArrayList<>();
        String[] infoVilla;
        Villa villa;
        while ((line = bufferedReader.readLine()) != null) {
            infoVilla = line.split(",");
            villa = new Villa(infoVilla[0], infoVilla[1], Double.parseDouble(infoVilla[2]), Double.parseDouble(infoVilla[3]),
              Integer.parseInt(infoVilla[4]), infoVilla[5], infoVilla[6], Double.parseDouble(infoVilla[7]), Integer.parseInt(infoVilla[8]));
            villaList.add(villa);
        }
        bufferedReader.close();
        return villaList;
    }

    public void writeVilla() throws IOException {
        File file = new File("src\\furamaresort\\data\\villa.csv");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Villa villa : villaList) {
            bufferedWriter.write(villa.getInfoVilla());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
