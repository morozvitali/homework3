package Package1;

public class SameName {
    public SameName() {
        System.out.println("Package2 object created");
    }
    public static void main(String[] args) {
        Package2.SameName sameNameFromPackage = new Package2.SameName();
        SameName sameName = new SameName();
    }
}
