package ss16_text_file.excercise.readfile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("src\\ss16_text_file\\excercise\\readfile\\text.csv");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String str;
            List<Country> countryList = new ArrayList<>();
            String[] arr;
            Country country;
            while ((str = bufferedReader.readLine()) != null) {
                arr = str.split(",");
                country = new Country(Integer.parseInt(arr[0]), arr[1], arr[2]);
                countryList.add(country);
            }
            bufferedReader.close();
            for (Country c : countryList) {
                System.out.println(c.getInfo());
            }
        } catch (Exception e) {
            System.out.println("Return C08");
        }


    }

}
