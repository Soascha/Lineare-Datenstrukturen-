public class StackNode<P> {
    private P Inhalt;  //  Inhalt des Knotens
    private StackNode<P> nextNode;  // zeigt aud den nächsten Knoten

    // Inhalt wird angegebe
    public StackNode(P pInhalt) {
        this.Inhalt = pInhalt;
        this.nextNode = null;  // Nachfolgender Knoten ist Null
    }

    // Inhalt wirds zurueckgegeben
    public P getInhalt() {
        return Inhalt;
    }

    //setzt den Inhalt des knoten überhaupzt zusammen
    public void setInhalt(P pInhalt) {
        this.Inhalt = pInhalt;
    }

    // Inhalt des nächsten Knoten qwird zurückgegeben
    public StackNode<P> getNextNode() {
        return nextNode;
    }

    // setzt den Inhalt des nächsten knotejn zusammen
    public void setNextNode(StackNode<P> nextNode) {
        this.nextNode = nextNode;
    }
}