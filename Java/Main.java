package Java;
class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        Car car = new Car();
        car.licence = "AMQ123";
        car.driver = "Andrés herrera";
        car.passenger = 4;
        car.printDataCar();
    }
}