package orgn.optional.model;

public class CrashReport {
    String result;
    int rating;

    Comapny comapny;

    public Comapny getComapny() {
        return comapny;
    }

    public void setComapny(Comapny comapny) {
        this.comapny = comapny;
    }

    public CrashReport(String result, int rating, Comapny comapny) {
        this.result = result;
        this.rating = rating;
        this.comapny = comapny;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
