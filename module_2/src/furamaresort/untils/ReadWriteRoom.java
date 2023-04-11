package furamaresort.untils;

import furamaresort.models.facility.Room;
import furamaresort.models.facility.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteRoom {
    private static List<Room> roomList = new ArrayList<>();

    //    public static List<House> readHouse() throws IOException {
    public List<Room> readRoom() throws IOException {
        File file = new File("src\\furamaresort\\data\\room.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        List<Room> roomList = new ArrayList<>();
        String[] infoRoom;
        Room room;
        while ((line = bufferedReader.readLine()) != null) {
            infoRoom = line.split(",");
            room = new Room(infoRoom[0], infoRoom[1], Double.parseDouble(infoRoom[2]), Double.parseDouble(infoRoom[3]),
                    Integer.parseInt(infoRoom[4]), infoRoom[5], infoRoom[6]);
            roomList.add(room);
        }
        bufferedReader.close();
        return roomList;
    }

    public void writeRoom() throws IOException {
        File file = new File("src\\furamaresort\\data\\room.csv");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Room room : roomList) {
            bufferedWriter.write(room.getInfoRoom());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
