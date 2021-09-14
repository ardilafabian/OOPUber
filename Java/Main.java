package Java;
class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        Account acc = new Account("Andrés herrera", "123456789");
        Car car = new Car("AMQ123", acc);
        car.passenger = 4;
        car.printDataCar();
    }
}