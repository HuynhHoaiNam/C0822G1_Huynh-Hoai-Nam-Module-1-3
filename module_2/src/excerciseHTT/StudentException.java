package excerciseHTT;

import java.util.Scanner;

public class StudentException {
    public static class Check {
        public void checkGender(String gender) throws CheckException {
            if (gender.equals("Nam") || gender.equals("Nữ")) {
                System.out.print("Nhập giới tính thành công");
            } else {
                throw new CheckException("Giới tình không hợp lệ: ");
            }
        }

        public void checkScore(double score) throws CheckException {
            if (score > 10 || score < 0) {
                throw new CheckException("Điểm chỉ được phép >0 và <10");
            } else {
                System.out.println("Điểm hợp lệ:");
            }
        }
    }


//    public void checkName(String name) {
//
//    }

    public static void main(String[] args) {
        Check check = new Check();
        Scanner scanner = new Scanner(System.in);

        String gender;
        while (true) {
            try {
                System.out.println("Nhập giới tính: ");
                gender = scanner.nextLine();
                check.checkGender(gender);
                break;
            } catch (CheckException e) {
//            e.printStackTrace();
                System.out.print(e.getMessage());
                System.out.println("\nNhập lại giới tính: ");
            }
        }

        while (true) {
            double score;
            try {
                System.out.print("\nNhập điểm: ");
                score = scanner.nextInt();
                check.checkScore(score);
                break;
            } catch (CheckException e) {
//            e.printStackTrace();
                System.out.print(e.getMessage());
                System.out.print("\nNhập lại điểm: ");
            }
        }

    }
}


