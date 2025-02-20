public class Kunde {

    private String Name;
    private boolean getraenkErhalten;
    private int Geld;
    private String wunschGetraenk;

public Kunde(){}

public Kunde( String pName,String Wunschgetraenk){}

    public void setName(String name) {
        Name = name;
    }
    public Getraenk getGetraenk(){
        return null;
    }
    public Rechnung getRechnung(){
        return null;
    }
    public void setGetraenk(Getraenk pGetraenk){

    }
    public void setRechnung(Rechnung pRechnung){

    }
    public void setGetraenkErhalten(boolean pErhalten){

    }

    public boolean getGetraenkErhalten(){
        return false;
    }

    public void setGeld(int pGeld){

    }

    public int getGeld(){
        return 0;
    }

    public String getWunschGetraenk(){
        return "";
    }
}
