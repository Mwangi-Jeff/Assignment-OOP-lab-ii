// Interface for amphibious vehicles
interface  Amphibious {
    void dock();
    void launch();
}

// Interface for air vehicles (assuming it's already defined elsewhere)
interface AirVehicle {
    // ... methods for air vehicles ...
}

// Abstract class for electric vehicles
abstract class ElectricVehicle {
    public abstract String batteryType();
}

// Class for amphibious planes
class AmphibiousPlane implements Amphibious, AirVehicle {
    @Override
    public void dock() {
        System.out.println("Docking amphibious vehicle...");
    }

    @Override
    public void launch() {
        System.out.println("Launching amphibious vehicle...");
    }

    // ... methods for air vehicles ...
}

// Class for electric cars
class ElectricCar extends ElectricVehicle {
    @Override
    public String batteryType() {
        return "Lithium-ion";
    }
}

// Class for electric bikes
 class ElectricBike extends ElectricVehicle {
    @Override
    public String batteryType() {
        return "Lead-acid";
    }
}

// Example usage
public class Main {
    public static void main(String[] args) {
        AmphibiousPlane amphibiousPlane = new AmphibiousPlane();
        amphibiousPlane.dock();
        amphibiousPlane.launch();

        ElectricCar electricCar = new ElectricCar();
        ElectricBike electricBike = new ElectricBike();

        System.out.println(electricCar.batteryType());
        System.out.println(electricBike.batteryType());
    }
}