package exam;

import java.awt.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>() {
            {
                add(new Employee("1", "thang1", LocalDate.parse("2001-12-12"), "Nghe An", 2, List.of(LocalDateTime.parse("2012-01-12T07:30:20"), LocalDateTime.parse("2012-03-12T07:35:20"), LocalDateTime.parse("2012-04-12T07:35:20"), LocalDateTime.parse("2012-02-12T07:35:20"))));
                add(new Employee("2", "thang2", LocalDate.parse("2001-12-12"), "Nghe An", 1, List.of(LocalDateTime.parse("2012-01-12T07:30:20"), LocalDateTime.parse("2012-02-12T07:35:20"), LocalDateTime.parse("2012-03-12T07:30:20"), LocalDateTime.parse("2012-02-12T07:35:20"))));
                add(new Employee("3", "thang3", LocalDate.parse("2001-12-12"), "Nghe An", 2, List.of(LocalDateTime.parse("2012-01-12T07:30:20"), LocalDateTime.parse("2012-02-12T07:35:20"), LocalDateTime.parse("2012-03-12T07:30:20"), LocalDateTime.parse("2012-02-12T07:35:20"))));
                add(new Employee("4", "thang4", LocalDate.parse("2001-12-12"), "Nghe An", 4, List.of(LocalDateTime.parse("2012-01-12T07:30:20"), LocalDateTime.parse("2012-02-12T07:35:20"), LocalDateTime.parse("2012-01-12T07:30:20"), LocalDateTime.parse("2012-02-12T07:35:20"))));
                add(new Employee("5", "thang5", LocalDate.parse("2001-12-12"), "Nghe An", 8, List.of(LocalDateTime.parse("2012-01-12T07:30:20"), LocalDateTime.parse("2012-02-12T07:35:20"), LocalDateTime.parse("2012-01-12T07:30:20"), LocalDateTime.parse("2012-02-12T07:35:20"))));
                add(new Employee("6", "thang6", LocalDate.parse("2001-12-12"), "Nghe An", 7, List.of(LocalDateTime.parse("2012-01-12T07:30:20"), LocalDateTime.parse("2012-02-12T07:35:20"), LocalDateTime.parse("2012-01-12T07:30:20"), LocalDateTime.parse("2012-02-12T07:35:20"))));
                add(new Employee("7", "thang7", LocalDate.parse("2001-12-12"), "Nghe An", 3, List.of(LocalDateTime.parse("2012-01-12T07:30:20"), LocalDateTime.parse("2012-02-12T07:35:20"), LocalDateTime.parse("2012-01-12T07:30:20"), LocalDateTime.parse("2012-02-12T07:35:20"))));
                add(new Employee("8", "thang8", LocalDate.parse("2001-12-12"), "Nghe An", 5, List.of(LocalDateTime.parse("2012-01-12T07:30:20"), LocalDateTime.parse("2012-02-12T07:35:20"), LocalDateTime.parse("2012-01-12T07:30:20"), LocalDateTime.parse("2012-02-12T07:35:20"))));
                add(new Employee("1", "thang", LocalDate.parse("2001-12-12"), "Nghe An", 10, List.of(LocalDateTime.parse("2012-01-12T07:30:20"), LocalDateTime.parse("2012-02-12T07:35:20"), LocalDateTime.parse("2012-01-12T07:30:20"), LocalDateTime.parse("2012-02-12T07:35:20"))));
                add(new Employee("1", "thang", LocalDate.parse("2001-12-12"), "Nghe An", 6, List.of(LocalDateTime.parse("2012-01-12T07:30:20"), LocalDateTime.parse("2012-02-12T07:35:20"), LocalDateTime.parse("2012-01-12T07:30:20"), LocalDateTime.parse("2012-02-12T07:35:20"))));
                add(new Employee("1", "thang", LocalDate.parse("2001-12-12"), "Nghe An", 2, List.of(LocalDateTime.parse("2012-01-12T07:30:20"), LocalDateTime.parse("2012-02-12T07:35:20"), LocalDateTime.parse("2012-01-12T07:30:20"), LocalDateTime.parse("2012-02-12T07:35:20"))));
                add(new Employee("1", "thang", LocalDate.parse("2001-12-12"), "Nghe An", 9, List.of(LocalDateTime.parse("2012-01-12T07:30:20"), LocalDateTime.parse("2012-02-12T07:35:20"), LocalDateTime.parse("2012-01-12T07:30:20"), LocalDateTime.parse("2012-02-12T07:35:20"))));
                add(new Employee("1", "thang", LocalDate.parse("2001-12-12"), "Nghe An", 2, List.of(LocalDateTime.parse("2012-01-12T07:30:20"), LocalDateTime.parse("2012-02-12T07:35:20"), LocalDateTime.parse("2012-01-12T07:30:20"), LocalDateTime.parse("2012-02-12T07:35:20"))));
            }
        };

        EmployeeYody employeeYody = new EmployeeYody();
        System.out.println("danh sach nhan vien theo to la : ");
        System.out.println(employeeYody.deviceEmployee(employees));

        System.out.println("danh sach nhan vien lay ra 2 log cham cong ke tu ngay thu 3 tro di la : ");
        System.out.println(employeeYody.teamEmployee(employees));

        System.out.println("nhan vien co di lam : " );
        EmployeeYody.workerInDay(employees);

        System.out.println("nhan vien di làm muon 3 ngay : ");
        System.out.println(employeeYody.lateWorker(employees));
    }
}
