
public class ListNode<A> {
    private A zeigeAuf; // Speichert das Objekt auf welches der Knoten zeigt
    private ListNode<A> nachfolger; // Speichert den nachfolgenden Knoten

    public ListNode(A pZeigeAuf) {
        this.zeigeAuf = pZeigeAuf;
        this.nachfolger = null;
    }

    public ListNode<A> getNachfolger() {
        return nachfolger;
    }

    public void setNachfolger(ListNode<A> pNachfolger) {
        this.nachfolger = pNachfolger;
    }

    public A getZeigeAuf() {
        return zeigeAuf;
    }

    public void setZeigeAuf(A pZeigeAuf) {
        this.zeigeAuf = pZeigeAuf;
    }
}