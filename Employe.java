public class Employe {

    public static void main(String[] args) {
        Employe employe = new Employe("Emile Paparazzi", "Journalist", "nightHawk@gmail.com", "+77878945600", 55 );
        System.out.println(employe.getAge());
        employe.setAge(59);
        System.out.println(employe.getAge());
        System.out.println(employe.toString());
        Car ford = new Car();
        ford.start();
    }

    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int age;

    public Employe(String fullName, String position, String email, String phoneNumber, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "fullName='" + fullName + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", age=" + age +
                '}';
    }
}

