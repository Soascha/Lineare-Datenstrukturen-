public class Warteschlange<T>{
    private Node erster;
    private Node letzter;
    /*
     * Konstruktor
     * Erstellt leere Queue
     */
    public Warteschlange(){
        erster = null;
    }

    private Node gibLetzten(){
        return letzter;
    }

    /*
     * Gibt das erste Objekt der Queue zurück
     */
    public T gibErsten(){
        return (T)erster.getZeigeAuf();
    }
    /*
     * Ertfernt das erste Objekt aus der Queue
     */
    public void getErsten(){
        if( erster.getNachfolger()!= null){
            erster = erster.getNachfolger();
        }
    }
    /*
     * Fügt ein neues Element am Ende der Queue hinzu
     */
    public void queue (T pInhalt) {
        Node akutellesElement = erster;
        Node neuesElement = new Node(pInhalt);
        neuesElement.setNachfolger(null);
        if (erster == null) {
            erster = neuesElement;
        } else {
            while (akutellesElement.getNachfolger() != null) {
                akutellesElement = akutellesElement.getNachfolger();
            }
            akutellesElement.setNachfolger(neuesElement);
        }
    }
    public void enqueue (T pElement) {
        Node neuerNode = new Node(pElement);
        neuerNode.setNachfolger(null);
        if (letzter != null) {
            letzter.setNachfolger(neuerNode);
            letzter = neuerNode;

        } else {
            erster = neuerNode;
            letzter = neuerNode;
        }
    }

    public void dequeue() {
        Node aktuellesElement = erster;
        if ( erster != null) {
            erster = aktuellesElement.getNachfolger();
        }
    }
}