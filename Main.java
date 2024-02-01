
interface  Amphibious {
    void dock();
    void launch();
}


interface AirVehicle {
   
}

abstract class ElectricVehicle {
    public abstract String batteryType();
}


class AmphibiousPlane implements Amphibious, AirVehicle {
    @Override
    public void dock() {
        System.out.println("Docking amphibious vehicle...");
    }

    @Override
    public void launch() {
        System.out.println("Launching amphibious vehicle...");
    }

}


class ElectricCar extends ElectricVehicle {
    @Override
    public String batteryType() {
        return "Aluminium-ion";
    }
}


 class ElectricBike extends ElectricVehicle {
    @Override
    public String batteryType() {
        return "Calcium battery";
    }
}


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
