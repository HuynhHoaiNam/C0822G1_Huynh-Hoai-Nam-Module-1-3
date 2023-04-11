package studen_test.until;

import studen_test.model.StudentTest;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteStudentTest {
    public static List<StudentTest> readStudentTest() {
        List<StudentTest> studentTestList = new ArrayList<>();
        File file = new File("src\\studen_test\\data\\student.csv");
        if (!file.exists()) {
            System.out.println("File ko ton tai");
        }
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            String[] inforStudenTest;
            StudentTest studentTest;
            while ((line = bufferedReader.readLine()) != null) {
                inforStudenTest = line.split(",");
                studentTest = new StudentTest(inforStudenTest[0], inforStudenTest[1], LocalDate.parse(inforStudenTest[2]),
                        inforStudenTest[3], inforStudenTest[4], Double.parseDouble(inforStudenTest[5]));
                studentTestList.add(studentTest);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.getMessage();
        }

        return studentTestList;
    }

    public void writeStudentTest(List<StudentTest> studentTestList) throws IOException {
        File file = new File("src\\studen_test\\data\\student.csv");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (StudentTest studentTest : studentTestList) {
            bufferedWriter.write(studentTest.getInfo());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }

}
