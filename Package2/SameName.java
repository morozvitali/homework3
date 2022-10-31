package Package2;

public class SameName {
    public SameName() {
        System.out.println("Package1 object created");
    }
    public static void main(String[] args) {
        Package1.SameName sameNameFromPackage = new Package1.SameName();
        SameName sameName = new SameName();
    }
}
