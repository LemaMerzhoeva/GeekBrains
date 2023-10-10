package globalPackage.services;
import globalPackage.Employee;

import java.util.List;

public interface Repository<T, Tid> {

    void add(T item);
    void edit(T item);
    void delete(Tid id);

    List<Employee> getAll();

}
