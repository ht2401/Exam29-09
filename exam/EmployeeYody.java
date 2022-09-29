package exam;

import streambuoi2.baitap.StudentAthena;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeYody {
    public Map<Integer, List<Employee>> deviceEmployee(List<Employee> employees) {
        return employees.stream()
                .collect(Collectors.groupingBy(Employee::getTeam,
                        HashMap::new, Collectors.mapping(Function.identity(), Collectors.toList())));
    }

    //y3
    public Map<Integer, List<Employee>> teamEmployee(List<Employee> employees) {
        var athena = employees.stream()
                .limit(2)
                .collect(Collectors.groupingBy(Employee::getTeam,
                        HashMap::new, Collectors.mapping(Function.identity(), Collectors.toList())));

        Map<Integer, List<Employee>> newClass = new HashMap<>();
        athena.forEach((team, employees1) -> {
            newClass.put(team, employees1.stream()
                    .skip(3)
                    .limit(2).collect(Collectors.toList()));
        });
        return newClass;
    }

}


