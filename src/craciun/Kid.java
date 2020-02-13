package craciun;

public class Kid {
    protected String lastName;
    protected String firstName;
    protected String gender;
    protected int age;
    protected boolean good;

    public Kid(String lastName, String firstName, String gender, int age, boolean good) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.gender = gender;
        this.age = age;
        this.good = good;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Kid{");
        sb.append("lastName='").append(lastName).append('\'');
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", gender='").append(gender).append('\'');
        sb.append(", age=").append(age);
        sb.append(", good=").append(good);
        sb.append('}');
        return sb.toString();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGood() {
        return good;
    }

    public void setGood(boolean good) {
        this.good = good;
    }
}

