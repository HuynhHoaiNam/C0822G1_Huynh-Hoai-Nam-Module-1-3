package furamaresort.untils;

import furamaresort.models.facility.Facility;
import furamaresort.models.facility.House;
import furamaresort.models.facility.Room;
import furamaresort.models.facility.Villa;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReadWriteMaintanance {
    public void writeMaintenance(Map<Facility, Integer> map) throws IOException {
        File file = new File("src\\furamaresort\\data\\facilitymaintenance.csv");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Map.Entry<Facility, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 5) {
                bufferedWriter.write(entry.getKey() + "" + entry.getValue());
                bufferedWriter.newLine();
            }
        }
        bufferedWriter.close();
    }

    public Map<Facility, Integer> readMaintenance() throws IOException {
        File file = new File("src\\furamaresort\\data\\facilitymaintenance.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        Map<Facility, Integer> map = new LinkedHashMap<>();
        String[] info;
        Villa villa;
        House house;
        Room room;
        while ((line = bufferedReader.readLine()) != null) {
            info = line.split(",");
            if (info[0].contains("VL")) {
                villa = new Villa(info[0], info[1], Double.parseDouble(info[2]), Double.parseDouble(info[3]), Integer.parseInt(info[4]), info[5], info[6], Double.parseDouble(info[7]), Integer.parseInt(info[8]));
                map.put(villa, Integer.parseInt(info[9]));
            } else if (info[0].contains("HO")) {
                house = new House(info[0], info[1], Double.parseDouble(info[2]), Double.parseDouble(info[3]), Integer.parseInt(info[4]), info[5], info[6], Integer.parseInt(info[7]));
                map.put(house, Integer.parseInt(info[8]));
            } else if (info[0].contains("RO")) {
                room = new Room(info[0], info[1], Double.parseDouble(info[2]), Double.parseDouble(info[3]), Integer.parseInt(info[4]), info[5], info[6]);
                map.put(room, Integer.parseInt(info[7]));
            }
        }
        bufferedReader.close();
        return map;
    }
}
