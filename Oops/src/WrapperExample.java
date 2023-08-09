public class WrapperExample {
    public static void main(String[] args) {
//       int a = 20;
//       int b = 40;
//
//       Integer num = 55;

        Integer a = 20;
        Integer b = 45;
       swap(a, b);

        System.out.println(a + " " + b);
//        final int bonus = 5;
//        bonus = 5;

        final A Tarique = new A("Tarique Anwer Khan");
        Tarique.name = "other name";

        //when a non primitive is final, you cannot reassign it.
        //Tarique = new A("new object");
    }

    static void swap(Integer a, Integer b){
        int temp = a;
        a = b;
        b = temp;
    }
}

class A {
    final int num = 10;
    String name;

    public A(String name){
        this.name = name;
    }
}
