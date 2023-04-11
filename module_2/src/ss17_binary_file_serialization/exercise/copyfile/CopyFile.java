package ss17_binary_file_serialization.exercise.copyfile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        try {
            File file = new File("src\\ss17_binary_file_serialization\\exercise\\copyfile\\dataOutput.txt");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            List<String> strings = new ArrayList<>();
            strings.add("Hoài Nam");
            strings.add("Phan Long");
            strings.add("Quốc Trung");
            objectOutputStream.writeObject(strings);
            objectOutputStream.close();


            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            List<String> string = (List<String>) objectInputStream.readObject();
            objectInputStream.close();


            FileOutputStream fileOutputStream1 = new FileOutputStream("src\\ss17_binary_file_serialization\\exercise\\copyfile\\dataInput.txt");
            ObjectOutputStream objectOutputStream1 = new ObjectOutputStream(fileOutputStream1);
            objectOutputStream1.writeObject(string);

        } catch (IOException e) {
            e.getMessage();
        } catch (ClassNotFoundException e) {
            e.getMessage();
        }


    }
}
