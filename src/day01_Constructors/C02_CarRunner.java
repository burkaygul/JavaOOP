package day01_Constructors;

public class C02_CarRunner {

    public static void main(String[] args) {

        C01_Car car = new C01_Car();
        System.out.println(car.brand); // No Brand
        System.out.println(car.modelName); // null
        System.out.println(car.color); // null
        System.out.println(car.modelYear); // 0
        System.out.println(car.price); // 0

        car.brand = "Mercedes";
        car.modelName = "CLA";
        car.color = "red";
        car.modelYear = 2024;
        car.price = 15000;

        System.out.println("================================");

        System.out.println(car.brand); // Mercedes
        System.out.println(car.modelName); // CLA
        System.out.println(car.color); // red
        System.out.println(car.modelYear); // 2024
        System.out.println(car.price); // 15000

        System.out.println(car.toString()); //day01_Constructors.C01_Car@6d03e736

        C01_Car car1 = new C01_Car("Audi","A3","red",2020,13000);
        System.out.println(car1.toString());


    }
}
