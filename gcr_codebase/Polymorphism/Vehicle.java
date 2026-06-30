abstract class Vehicle {
    String vehicleNumber;

    Vehicle(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    abstract double fuelCost(double km);
}

class Car extends Vehicle {

    Car(String vehicleNumber) {
        super(vehicleNumber);
    }

    double fuelCost(double km) {
        return km * 8;
    }
}

class Bus extends Vehicle {

    Bus(String vehicleNumber) {
        super(vehicleNumber);
    }

    double fuelCost(double km) {
        return km * 15;
    }
}

class Bike extends Vehicle {

    Bike(String vehicleNumber) {
        super(vehicleNumber);
    }

    double fuelCost(double km) {
        return km * 3;
    }
}

class ElectricCar extends Vehicle {

    ElectricCar(String vehicleNumber) {
        super(vehicleNumber);
    }

    double fuelCost(double km) {
        return km * 2;
    }
}

public class Main {
    public static void main(String[] args) {

        Vehicle[] fleet = {
                new Car("C101"),
                new Bus("B101"),
                new Bike("BK101"),
                new ElectricCar("E101")
        };

        double km = 100;

        for (Vehicle v : fleet) {

            System.out.println(v.vehicleNumber +
                    " Fuel Cost = ₹" + v.fuelCost(km));

            if (v instanceof Car) {
                Car c = (Car) v;
                System.out.println("This is a Car");
            } else if (v instanceof Bus) {
                Bus b = (Bus) v;
                System.out.println("This is a Bus");
            } else if (v instanceof Bike) {
                Bike bk = (Bike) v;
                System.out.println("This is a Bike");
            } else if (v instanceof ElectricCar) {
                ElectricCar e = (ElectricCar) v;
                System.out.println("This is an Electric Car");
            }

            System.out.println();
        }
    }
}