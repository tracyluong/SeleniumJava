public class Bien {

    public void sayHello() {

        //Khai bao bien local
        int n = 10;
        System.out.println("Gia tri cua n la: " + n);
    }

    public static void main(String[] args) {
        Bien bien = new Bien();
        bien.sayHello();

        //Khai bao bien
        int number1 = 123456;
        int number2 = 789;

        String name = "Nhung";
        String ten = "Linh";

        //In gia tri cua bien ra man hinh
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(name);
        System.out.println(ten);

    }
}
