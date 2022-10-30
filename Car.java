public class Car {

    public void start() {
        System.out.println("Start Systems: ");
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startElectricity() {
        System.out.println("Start Elictricity Systems...");
    }

    private void startCommand() {
        System.out.println("Start Command Systems...");
    }

    private void startFuelSystem() {
        System.out.println("Start Fuel Systems...");
    }


}