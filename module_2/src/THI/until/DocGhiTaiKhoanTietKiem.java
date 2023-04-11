package THI.until;

import THI.model.TaiKhoanTietKiem;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DocGhiTaiKhoanTietKiem {
    public static List<TaiKhoanTietKiem> docTaiKhoanTietKiem() {
        List<TaiKhoanTietKiem> taiKhoanTietKiems = new ArrayList<>();
        File file = new File("src\\THI\\data\\taikhoantietkiem.csv");
        if (!file.exists()) {
            System.out.println("File ko ton tai");
        }
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            String[] thongtinTaiKhoanTietKiem;
            TaiKhoanTietKiem taiKhoanTietKiem;
            while ((line = bufferedReader.readLine()) != null) {
                thongtinTaiKhoanTietKiem = line.split(",");
                taiKhoanTietKiem = new TaiKhoanTietKiem(thongtinTaiKhoanTietKiem[0],
                        thongtinTaiKhoanTietKiem[1], thongtinTaiKhoanTietKiem[2]
                        , thongtinTaiKhoanTietKiem[3], Double.parseDouble(thongtinTaiKhoanTietKiem[4])
                        , thongtinTaiKhoanTietKiem[5],
                        Double.parseDouble(thongtinTaiKhoanTietKiem[6]), thongtinTaiKhoanTietKiem[7]);
                taiKhoanTietKiems.add(taiKhoanTietKiem);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.getMessage();
        }
        return taiKhoanTietKiems;
    }

    public static void vietTaiKhoanTietKiem(List<TaiKhoanTietKiem> taiKhoanTietKiems) throws IOException {
        File file = new File("src\\THI\\data\\taikhoantietkiem.csv");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (TaiKhoanTietKiem taiKhoanTietKiem : taiKhoanTietKiems) {
            bufferedWriter.write(taiKhoanTietKiem.thongTin());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
