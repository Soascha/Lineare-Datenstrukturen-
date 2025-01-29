public class Warteschlange<T>{
    private Knoten kunde;
    /*
     * Konstruktor
     * Erstellt leere Queue
     */
    public Warteschlange(){
        kunde = null;
    }



    /*
     * Gibt das erste Objekt der Queue zurück
     */
    public T gibErsten(){
        return (T)kunde.getZeigeAuf();
    }
    /*
     * Ertfernt das erste Objekt aus der Queue
     */
    public void getErsten(){
        if( kunde.getNachfolger()!= null){
            kunde = kunde.getNachfolger();
        }
    }
    /*
     * Fügt ein neues Element am Ende der Queue hinzu
     */
    public void queue (T pKunde) {
        Knoten aktuellerKunde = kunde;
        Knoten neuerKunde = new Knoten(pKunde);
        neuerKunde.setNachfolger(null);
        if (kunde == null) {
            kunde = neuerKunde;
        } else {
            while (aktuellerKunde.getNachfolger() != null) {
                aktuellerKunde = aktuellerKunde.getNachfolger();
            }
            aktuellerKunde.setNachfolger(neuerKunde);
        }
    }
    public void dequeue (T pKunde) {
        Knoten aktuellerKunde = kunde;
        if ( kunde != null) {
             kunde = aktuellerKunde.getNachfolger();
        }
    }
}