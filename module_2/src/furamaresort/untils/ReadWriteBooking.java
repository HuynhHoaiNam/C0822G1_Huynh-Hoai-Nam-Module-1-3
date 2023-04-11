package furamaresort.untils;

import furamaresort.models.Booking;

import java.io.*;
import java.time.LocalDate;
import java.util.TreeSet;

public class ReadWriteBooking {
    public TreeSet<Booking> readBooking() throws IOException {
        File file = new File("src\\furamaresort\\data\\booking.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = "";
        TreeSet<Booking> bookingTreeSet = new TreeSet<>();
        String[] info;
        Booking booking;
        while (((line = bufferedReader.readLine()) != null)) {
            info = line.split(",");
            booking = new Booking(info[0], LocalDate.parse(info[1]), LocalDate.parse(info[2]), info[3], info[4], info[5]);
            bookingTreeSet.add(booking);
        }
        bufferedReader.close();
        return bookingTreeSet;
    }

    public void writeBooking(TreeSet<Booking> bookingTreeSet) throws IOException {
        File file2 = new File("src\\furamaresort\\data\\booking.csv");
        FileWriter fileWriter = new FileWriter(file2);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Booking booking : bookingTreeSet) {
            bufferedWriter.write(booking.getInfoBooking());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
