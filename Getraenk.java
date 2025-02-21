public class Getraenk {

    private String name;
    private int preis;

    public Getraenk(String pName, int pPreis){
        name = pName;
        preis =pPreis;
    }

    public void setName(String pName){
        name = pName;
    }
    public String getName(){
        return name;
    }

    public double getPreis(){
        return 0;
    }
}
