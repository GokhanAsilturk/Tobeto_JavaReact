package Workshop_Day2.model;



public class Category {

    public Category() {
    }

    public Category(String categoryName) {
        this.categoryName = categoryName;
    }

    private int id;
    private String categoryName;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return
                "categoryName=" + categoryName;
    }
}
