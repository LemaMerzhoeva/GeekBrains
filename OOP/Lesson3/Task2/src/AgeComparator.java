import java.util.Comparator;

public class AgeComparator implements Comparator<Employee> {

    private SortType sortType;

    public AgeComparator(SortType sortType) {
        this.sortType = sortType;
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        if (sortType == SortType.Ascennding){
            return Integer.compare(o1.age, o2.age);
        }
        else {
            return Integer.compare(o2.age, o1.age);
        }
    }
}
