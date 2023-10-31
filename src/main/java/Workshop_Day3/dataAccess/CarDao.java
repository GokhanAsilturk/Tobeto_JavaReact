package Workshop_Day3.dataAccess;

public interface CarDao {

    String add(int id);

    String update(int id);

    String get(String brand);

    String delete(int id);
}
