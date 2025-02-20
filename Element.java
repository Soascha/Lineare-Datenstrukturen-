public class Element
{
    private String hatName;

    public Element(){

    }

    public Element(String pElement){
        this.hatName = pElement;
    }

    public void setName(String pElement){
        hatName = pElement;
    }

    public String getName(){
        return hatName;
    }
}