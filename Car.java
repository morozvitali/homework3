public class Car {

    public static void main(String[] args) {
        Employe employe = new Employe("Emile Paparazzi", "Journalist", "nightHawk@gmail.com", "+77878945600", 55 );
        System.out.println(employe.getAge());
        employe.setAge(59);
        System.out.println(employe.getAge());
        System.out.println(employe.toString());
        Car ford = new Car();
        ford.start();
    }


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