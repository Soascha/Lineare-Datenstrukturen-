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
    public void queue (T pKunde) {
        Node aktuellerKunde = erster;
        Node neuerKunde = new Node(pKunde);
        neuerKunde.setNachfolger(null);
        if (erster == null) {
            erster = neuerKunde;
        } else {
            while (aktuellerKunde.getNachfolger() != null) {
                aktuellerKunde = aktuellerKunde.getNachfolger();
            }
            aktuellerKunde.setNachfolger(neuerKunde);
        }
    }
    public void enqueue (T pKunde) {
        Node neuerKnoten = new Node(pKunde);
        neuerKnoten.setNachfolger(null);
        if (letzter != null) {
            letzter.setNachfolger(neuerKnoten);
            letzter = neuerKnoten;

        } else {
            erster = neuerKnoten;
            letzter = neuerKnoten;
        }
    }

    public void dequeue() {
        Node aktuellerKunde = erster;
        if ( erster != null) {
            erster = aktuellerKunde.getNachfolger();
        }
    }
}