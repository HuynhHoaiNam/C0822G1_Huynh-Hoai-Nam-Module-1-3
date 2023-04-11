package ss16_text_file.excercise.coppyfile;

import java.io.*;

public class CoppyFile {
    public static class ReadFile {
        public void readFile(String filePath, String filePath2) throws IOException {
            File file = new File(filePath);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);


            File file2 = new File(filePath2);
            FileWriter fileWriter = new FileWriter(file2);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            try {
                if (!file.exists() || !file2.exists()) {
                    throw new FileNotFoundException();
                }
                String line = "";
                int count = 0;
                while ((line = bufferedReader.readLine()) != null) {
                    bufferedWriter.write(line);
                    bufferedWriter.newLine();
                    count++;

                }
                bufferedWriter.write("Số kí tự là: " + count);
                bufferedReader.close();
                bufferedWriter.close();
            } catch (IOException e) {
                System.out.println("File đã tồn tạiiiiiiiii, return về c09");
            }

        }


        public static void main(String[] args) throws IOException {
            ReadFile blue = new ReadFile();
            blue.readFile("src\\ss16_text_file\\excercise\\coppyfile\\input.csv", "src\\ss16_text_file\\excercise\\coppyfile\\output.csv");

        }
    }
}
