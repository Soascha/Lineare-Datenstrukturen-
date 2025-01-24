public class Warteschlange<T>{
    private Knoten erster;
    /*
     * Konstruktor
     * Erstellt leere Queue
     */
    public Warteschlange(){
        erster = null;
    }
    public T gibNächsten(){
        return (T)

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
    public void einfuegen(T pKunde) {
        Knoten aktuellerKunde = erster;
        Knoten neuerKunde = new Knoten(pKunde);
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
}