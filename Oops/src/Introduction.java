public class Introduction {
    public static void main(String[] args) {
        //store 5 roll numbers
        int[] numbers = new int[5];

        //store 5 names
        String[] names = new String[5];

        //data of 5 students: {roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];


        Student Tarique = new Student(13, "Tarique Anwer Khan", 85.4f);
        Student Khan = new Student();

//        Tarique.rno = 287;
//        Tarique.name = "Tarique Anwer Khan";
//        Tarique.marks = 85.4f ;

        Tarique.changeName("Khan");
        Tarique.greeting();

        System.out.println(Tarique.rno);
        System.out.println(Tarique.name);
        System.out.println(Tarique.marks);
    }
}
    //create a class
    //for every single students
    class Student {
        int rno;
        String name;
        float marks;

        //we need a way to add the values of the above
        //properties object by objects

        //we need on word to access every object

        void greeting() {
            System.out.println("Hello! My name is " + name);
        }

        void changeName(String newName){
            name = newName;
        }
        Student (){
            this.rno = 287;
            this.name = "Tarique Anwer Khan";
            this.marks = 85.4f;
        }


        Student (int rno, String name, float marks){
            this.rno = rno;
            this.name = name;
            this.marks = marks;
        }
    }
