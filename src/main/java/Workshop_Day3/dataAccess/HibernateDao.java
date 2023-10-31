package Workshop_Day3.dataAccess;

public class HibernateDao implements CarDao {
    @Override
    public String add(int id) {
        return "Hibernate ile eklendi: \n";
    }

    @Override
    public String update(int id) {
        return "Hibernate ile güncellendi. \n";
    }

    @Override
    public String get(String brand) {
        return "Hibernate ile getirildi: \n";
    }

    @Override
    public String delete(int id) {
        return "Hibernate ile silindi: \n";
    }
}
