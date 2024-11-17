package day01_Constructors;

public class C03_CodeReading {

    String name = "No name";
    String adress = "No adress";
    int age;

    C03_CodeReading(){
        age = 40;
    }

    C03_CodeReading(int age){
        age = 23;
        adress = "Cankaya";
    }

    C03_CodeReading(String name, String adress){
        this.name = name;
        this.adress = adress;
    }


    public static void main(String[] args) {

        C03_CodeReading obj = new C03_CodeReading();
        System.out.println(obj.age + "," + obj.name + "," + obj.adress); //40,No name,No adress

        C03_CodeReading obj1 = new C03_CodeReading("Burkay","Gülsuyu");
        System.out.println(obj1.age + "," + obj1.name + "," + obj1.adress); //0,Burkay,Gülsuyu

        C03_CodeReading obj2 = new C03_CodeReading(28);
        System.out.println(obj2.age + "," + obj2.name + "," + obj2.adress); //0,No name,Cankaya




    }
}
