package THI.until;

import THI.model.TaiKhoanThanhToan;
import THI.model.TaiKhoanTietKiem;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DocGhiTaiKhoanThanhToan {
    public static List<TaiKhoanThanhToan> docTaiKhoanThanhToan() {
        List<TaiKhoanThanhToan> taiKhoanThanhToans = new ArrayList<>();
        File file = new File("src\\THI\\data\\taikhoantietkiem.csv");
        if (!file.exists()) {
            System.out.println("File ko ton tai");
        }
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            String[] thongtinTaiKhoanThanhToan;
            TaiKhoanThanhToan taiKhoanThanhToan;
            while ((line = bufferedReader.readLine()) != null) {
                thongtinTaiKhoanThanhToan = line.split(",");
                taiKhoanThanhToan = new TaiKhoanThanhToan(thongtinTaiKhoanThanhToan[0],
                        thongtinTaiKhoanThanhToan[1], thongtinTaiKhoanThanhToan[2]
                        , thongtinTaiKhoanThanhToan[3], thongtinTaiKhoanThanhToan[4]
                        , Double.parseDouble(thongtinTaiKhoanThanhToan[5]));
                taiKhoanThanhToans.add(taiKhoanThanhToan);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.getMessage();
        }
        return taiKhoanThanhToans;
    }

    public static void vietTaiKhoanThanhToan(List<TaiKhoanThanhToan> taiKhoanThanhToans) throws IOException {
        File file = new File("src\\THI\\data\\taikhoantietkiem.csv");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (TaiKhoanThanhToan taiKhoanThanhToan : taiKhoanThanhToans) {
            bufferedWriter.write(taiKhoanThanhToan.thongTin());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
