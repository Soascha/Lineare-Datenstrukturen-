public class Kunde {

    private String name;
    private boolean getraenkErhalten;
    private int geld;
    private String wunschGetraenk;
    private Rechnung rechnung;
    private Getraenk getraenk;

public Kunde(){}

public Kunde( String pName,String Wunschgetraenk){}

    public void setName(String pName) {
        name = pName;
    }
    public String getName() {
        return name;
    }
    public void setRechnung(Rechnung pRechnung){
        rechnung = pRechnung;
    }
    public Rechnung getRechnung(){
        return rechnung;
    }
    public void setGetraenk(Getraenk pGetraenk){
        getraenk = pGetraenk;
    }
    public Getraenk getGetraenk(){
        return getraenk;
    }

    public void setGetraenkErhalten(boolean pErhalten){
        getraenkErhalten = pErhalten;
    }

    public boolean getGetraenkErhalten(){
        return getraenkErhalten;
    }

    public void setGeld(int pGeld){
        geld = pGeld;
    }

    public int getGeld(){
        return geld;
    }
    public void setWunschGetraenk(String pWunschGetraenk) {
        wunschGetraenk = pWunschGetraenk;
    }
    public String getWunschGetraenk(){
        return wunschGetraenk;
    }
}
