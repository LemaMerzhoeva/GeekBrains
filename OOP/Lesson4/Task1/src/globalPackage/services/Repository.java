package globalPackage.services;
import globalPackage.Employee;

import java.util.List;

public interface Repository<T, Tid> {

    void add(T employee);
    void edit(T employee);
    void delete(Tid id);

    List<Employee> getAll();

}
