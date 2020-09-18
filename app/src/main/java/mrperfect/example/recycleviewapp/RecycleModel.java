package mrperfect.example.recycleviewapp;

class RecycleModel {
    String title;
    String description;


    public String getTitle() {
        return title;
    }

    public RecycleModel(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
