public class User {
    private String name;
    private int age;
    private boolean isActive;
    private String email;

    public User(String name, int age, boolean isActive) {
        this.name = name;
        this.age = age;
        this.isActive = isActive;
    }

    public User(String name, int age, boolean isActive, String email) {
        this(name, age, isActive);
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        if (age < 17) {
            System.out.println("this is not correct age!");
        }
        this.age = age;
    }

    public void printUserInformation() {
        System.out.println("name is " + name);
        System.out.println("Age is " + age);
        System.out.println("is active? " + isActive);
    }

    public boolean canBuyProduct() {
        if (age > 17) {
            return true;
        } else {
            return false;
        }
    }

    public void sendEmail(String body) {
        System.out.println("send email with body " + body + "on email address:" + email);
    }


}
