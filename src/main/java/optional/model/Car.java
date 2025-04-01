package optional.model;

public class Car {
    int id;
    String category;
    CrashReport crashReport;

    public Car(int id, String category, CrashReport crashReport) {
        this.id = id;
        this.category = category;
        this.crashReport = crashReport;
    }

    public CrashReport getCrashReport() {
        return crashReport;
    }

    public void setCrashReport(CrashReport crashReport) {
        this.crashReport = crashReport;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
