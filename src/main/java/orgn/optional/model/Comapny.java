package orgn.optional.model;

public class Comapny {
    String name;
    int gst;
    String location;

    public Comapny(String name, int gst, String location) {
        this.name = name;
        this.gst = gst;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGst() {
        return gst;
    }

    public void setGst(int gst) {
        this.gst = gst;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
