package id.ac.poliban.mi.cahyo.listmakanan;

public class Makanan {
    private String flag;
    private String makananName;
    private String makananDesc;

    public Makanan(String flag, String makananName, String makananDesc) {
        this.flag = flag;
        this.makananName = makananName;
        this.makananDesc = makananDesc;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getMakananName() {
        return makananName;
    }

    public void setMakananName(String makananName) {
        this.makananName = makananName;
    }

    public String getMakananDesc() {
        return makananDesc;
    }

    public void setMakananDesc(String makananDesc) {
        this.makananDesc = makananDesc;
    }

    @Override
    public String toString() {
        return String.format("%30s\n\n%s", getMakananName(), getMakananDesc());
    }
}


