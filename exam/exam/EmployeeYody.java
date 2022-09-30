package exam;

import streambuoi2.baitap.StudentAthena;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeYody {
    public static Map<Integer, List<Employee>> deviceEmployee(List<Employee> employees) {
        return employees.stream()
                .collect(Collectors.groupingBy(Employee::getTeam,
                        HashMap::new, Collectors.mapping(Function.identity(), Collectors.toList())));
    }

    //y3
    public Map<Integer, List<Employee>> teamEmployee(List<Employee> employees) {
        var athena = employees.stream()
                .collect(Collectors.groupingBy(Employee::getTeam,
                        HashMap::new, Collectors.mapping(Function.identity(), Collectors.toList())));

        Map<Integer, List<Employee>> newClass = new HashMap<>();
        athena.forEach((team, employees1) -> {
            employees1.forEach(emp -> {
                emp.setTimekeeping(emp.getTimekeeping().stream().skip(2).limit(2).collect(Collectors.toList()));
            });
            newClass.put(team, employees1);
        });
        return newClass;
    }

    //y4
    public static void workerInDay(List<Employee> employees) {
        System.out.println("Nhap vao ngay :");
        Scanner scanner = new Scanner(System.in);
        LocalDate time = LocalDate.parse(scanner.nextLine());
        List<Employee> employeeList = employees.stream().filter(worker -> worker.getTimekeeping().stream()
                        .filter(time1 -> time1.getYear() == time.getYear())
                        .filter(time1 -> time1.getMonth() == time.getMonth())
                        .anyMatch(time1 -> time1.getDayOfMonth() == time.getDayOfMonth()))
                .toList();
        System.out.println("Danh sach nhan vien lam viec trong ngay " + time);
        employeeList.forEach(System.out::println);
    }

    //y2

    public static Map<Integer, List<Employee>> lateWorker(List<Employee> employees) {
        List<Employee> workerList = employees.stream().filter(worker -> worker.getTimekeeping().stream()
                        .filter(time -> time.getHour() >= 7)
                        .filter(time -> time.getMinute() >= 30)
                        .filter(time -> time.getSecond() > 0)
                        .count() >= 3)
                .collect(Collectors.toList());
        return deviceEmployee(workerList);
    }
}


