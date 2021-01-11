import java.util.Objects;

public class Bird {
    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatinName() {
        return latinName;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }

    public int getRingingYear() {
        return ringingYear;
    }

    public void setRingingYear(int ringingYear) {
        this.ringingYear = ringingYear;
    }

    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bird)) return false;
        Bird bird = (Bird) o;
        return ringingYear == bird.ringingYear &&
                Objects.equals(latinName, bird.latinName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(latinName, ringingYear);
    }
}