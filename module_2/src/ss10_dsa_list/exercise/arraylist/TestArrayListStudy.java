package ss10_dsa_list.exercise.arraylist;

import ss10_dsa_list.practice.liststudy.ListStudy;

public class TestArrayListStudy {
    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public static void main(String[] args) {
            Student a = new Student(1, "rồng xanh");
            Student b = new Student(2, "rồng đỏ");
            Student c = new Student(3, "rồng vàng");

            ArrayListStudy<Student> studentArrayListStudy = new ArrayListStudy<>();
            ArrayListStudy<Student> newArrayList = new ArrayListStudy<>();

            studentArrayListStudy.add(a);
            studentArrayListStudy.add(b);
            studentArrayListStudy.add(c);
//            for (int i = 0; i < studentArrayListStudy.size(); i++) {
//                Student student = (Student) studentArrayListStudy.elements[i];
//                System.out.println(student.getId());
//                System.out.println(student.getName());
//            }

//            System.out.println(studentArrayListStudy.get(0).getName());
//            System.out.println(studentArrayListStudy.indexOf(a));

//            System.out.println(studentArrayListStudy.constans(b));

            newArrayList = studentArrayListStudy.clone();
            newArrayList.remove(0);
            for (int i = 0; i < newArrayList.size(); i++) {
                System.out.println(newArrayList.get(i).getName());
            }


        }
    }
}
