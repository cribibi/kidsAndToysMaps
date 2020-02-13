package craciun;

public class Toy {
    protected String name;
    protected String gender;
    protected int minAge;
    protected int maxAge;


    public Toy(String name, String gender, int minAge, int maxAge) {
        this.name = name;
        this.gender = gender;
        this.minAge = minAge;
        this.maxAge = maxAge;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Toy{");
        sb.append("name='").append(name).append('\'');
        sb.append(", gender='").append(gender).append('\'');
        sb.append(", minAge=").append(minAge);
        sb.append(", maxAge=").append(maxAge);
        sb.append('}');
        return sb.toString();
    }
}