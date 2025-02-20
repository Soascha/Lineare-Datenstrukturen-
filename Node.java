public class Node<T>{

    private T zeigeAuf;                             //Speichert das Objekt auf welches der Knoten zeigt
    private Node nachfolger;                      //Speichert den nachfolgenden Knoten

    public Node(T pZeigeAuf) {
        zeigeAuf = pZeigeAuf;
    }
    public Node getNachfolger() {
        return nachfolger;
    }
    public void setNachfolger(Node pNachfolger) {
        this.nachfolger = pNachfolger;
    }
    public T getZeigeAuf() {
        return zeigeAuf;
    }
}