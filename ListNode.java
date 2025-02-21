
public class ListNode<ContentType> {
    private ContentType zeigeAuf; // Speichert das Objekt auf welches der Knoten zeigt
    private ListNode<ContentType> nachfolger; // Speichert den nachfolgenden Knoten

    public ListNode(ContentType pZeigeAuf) {
        this.zeigeAuf = pZeigeAuf;
        this.nachfolger = null;
    }

    public ListNode<ContentType> getNachfolger() {
        return nachfolger;
    }

    public void setNachfolger(ListNode<ContentType> pNachfolger) {
        this.nachfolger = pNachfolger;
    }

    public ContentType getZeigeAuf() {
        return zeigeAuf;
    }

    public void setZeigeAuf(ContentType pZeigeAuf) {
        this.zeigeAuf = pZeigeAuf;
    }
}