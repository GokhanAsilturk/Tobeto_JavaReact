package Workshop_Day3.dataAccess;

public class JdbcCarDao implements CarDao{
    @Override
    public String add(int id) {
        return "JDBC ile eklendi: \n";
    }

    @Override
    public String update(int id) {
        return "JDBC ile güncellendi: \n";
    }

    @Override
    public String get(String brand) {
        return "JDBC ile getirildi: \n";
    }

    @Override
    public String delete(int id) {
        return "JDBC ile silindi: \n";
    }
}
