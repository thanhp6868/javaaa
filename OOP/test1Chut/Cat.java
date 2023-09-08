public class Cat {
    private String name;
    private String color;
    private String age;

    public void SetProfile(String name, String color, String age)

    {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void showProfile() {
        System.out.println("name: " + name + "\ncolor: " + color + "\nage: " + age + "\n");
    }
}
