import java.util.Objects;

public class University {
    public String name;
    public Integer amount_students;
    public int amount_tutors;
    public double ball;

    public University(String name, Integer amount_students, int amount_tutors, double ball) {
        this.name = name;
        this.amount_students = amount_students;
        this.amount_tutors = amount_tutors;
        this.ball = ball;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmount_students() {
        return amount_students;
    }

    public void setAmount_students(Integer amount_students) {
        this.amount_students = amount_students;
    }

    public int getAmount_tutors() {
        return amount_tutors;
    }

    public void setAmount_tutors(int amount_tutors) {
        this.amount_tutors = amount_tutors;
    }

    public double getBall() {
        return ball;
    }

    public void setBall(double ball) {
        this.ball = ball;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        University that = (University) o;
        return amount_students == that.amount_students && amount_tutors == that.amount_tutors && ball == that.ball && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, amount_students, amount_tutors, ball);
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", amount_students=" + amount_students +
                ", amount_tutors=" + amount_tutors +
                ", ball=" + ball +
                '}';
    }
}
