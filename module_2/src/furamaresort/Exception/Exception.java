package furamaresort.Exception;

import excerciseHTT.DateBirthException;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

public class Exception extends Throwable {
    public static void dateException( long old) throws DateBirthException {
        if (old >= 18 && old < 100) {
            System.out.println("Nhập ngày sinh thành công");
        } else {
            throw new DateBirthException("Tuổi phải nhỏ hơn 100 và lớn hơn 18,vui lòng nhập lại");
        }
    }
}
