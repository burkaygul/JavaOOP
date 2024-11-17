package day01_Constructors;

public class C01_Car {

    String brand = "No Brand";
    String modelName;
    String color;
    int modelYear;
    int price;


     public C01_Car(){
        // this is a default constructor
        // default constructor is public, has no parameters and no code in body
    }


    public C01_Car(String brand, String modelName, String color, int modelYear, int price){
        this.brand = brand;
        this.modelName = modelName;
        this.color = color;
        this.modelYear = modelYear;
        this.price = price;
    }


    @Override
    public String toString() {
        return "C01_Car{" +
                "brand='" + brand + '\'' +
                ", modelName='" + modelName + '\'' +
                ", color='" + color + '\'' +
                ", modelYear=" + modelYear +
                ", price=" + price +
                '}';
    }



}
