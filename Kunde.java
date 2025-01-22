public class Kunde
{
    private String hatName;

    public Kunde(){

    }

    public Kunde(String pName){
        this.hatName = pName;
    }

    public void setName(String pName){
        hatName = pName;
    }

    public String getName(){
        return hatName;
    }
}