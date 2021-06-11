package info.twinklesu.javaConfig;

public class Company {
    private String name;

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        System.out.println(name);
        return name;
    }
}
