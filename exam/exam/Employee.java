package exam;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Employee {
    private String id;
    private String name;
    private LocalDate dateOfBirth;
    private String nativeLand;
    private int team;
    private List<LocalDateTime> timekeeping;

    public Employee() {
    }

    public Employee(String id, String name, LocalDate dateOfBirth, String nativeLand, int team, List<LocalDateTime> timekeeping) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.nativeLand = nativeLand;
        this.team = team;
        this.timekeeping = timekeeping;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNativeLand() {
        return nativeLand;
    }

    public void setNativeLand(String nativeLand) {
        this.nativeLand = nativeLand;
    }

    public int getTeam() {
        return team;
    }

    public void setTeam(int team) {
        this.team = team;
    }

    public List<LocalDateTime> getTimekeeping() {
        return timekeeping;
    }

    public void setTimekeeping(List<LocalDateTime> timekeeping) {
        this.timekeeping = timekeeping;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", nativeLand='" + nativeLand + '\'' +
                ", team=" + team +
                ", timekeeping=" + timekeeping +
                '}';
    }
}
