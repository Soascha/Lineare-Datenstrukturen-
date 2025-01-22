public class Warteschlange<T>{
    private Knoten erster;
    /*
     * Konstruktor
     * Erstellt leere Queue
     */
    public Warteschlange(){
        erster = null;
    }
    /*
     * Gibt das erste Objekt der Queue zurück
     */
    public T gibErsten(){
        return erster.getZeigeAuf();
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