package classWork21DB;

public class Category {

    int caregoryID;
    String categoryName;
    String description;

    public Category(int caregoryID, String categoryName, String description) {
        this.caregoryID = caregoryID;
        this.categoryName = categoryName;
        this.description = description;
    }

    public int getCaregoryID() {
        return caregoryID;
    }

    public void setCaregoryID(int caregoryID) {
        this.caregoryID = caregoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Category{" +
                "caregoryID=" + caregoryID +
                ", categoryName='" + categoryName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

}
