public class Main {
    public static void main(String[] args) {
        Car car = new Car("KIA", 4);
        Car car2 = new Car("HYUNDAI", 4);


        Truck truck = new Truck("FORD", 6);
        Truck truck2 = new Truck("CHEVROLET", 8);


        Bicycle bicycle = new Bicycle("АИСТ", 2);
        Bicycle bicycle2 = new Bicycle("КАМА", 2);


        ServiceStation station = new ServiceStation();
        station.check(car);
        station.check(truck);
        station.check(bicycle);
        station.check(car2);
        station.check(truck2);
        station.check(bicycle2);


    }
}


