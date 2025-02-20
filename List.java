
public class List <A> {

    public ListNode last; //letzter Knoten
    public ListNode current; //aktueller Knoten
    public ListNode first; //erster Knoten

    public List() {
        first = null;
        current = null;
        last = null;
    }

    public void append(A pContent) {
        ListNode<A> newNode = new ListNode<>(pContent);
        if (isEmpty()) {
            // Wenn die Liste leer ist, wird das Element als erstes gesetzt
            first = newNode;
            last = newNode;
        } else {
            // Hängt das neue Element ans Ende
            last.setNachfolger(newNode);// Verbindet das aktuelle letzte Element mit dem neuen Knoten
            last = newNode;
        }
    }


    // Geht zum nächsten Element in der Liste
    public void next() {
        if (hasAccess()) {
            current = current.getNachfolger();// Springt zum nächsten Knoten
        }
    }

    // Fügt ein neues Element in die Liste ein
    public void insert(A pContent) {
        ListNode<A> newNode = new ListNode<>(pContent);
        if (isEmpty()) {
            // Falls die Liste leer ist, wird der neue Knoten sowohl "first" als auch "last"
            first = newNode;
            last = newNode;
        } else if (hasAccess()) {
            // Neues Element vor dem aktuellen einfügen
            newNode.setNachfolger(current);
            if (current == first) {
                first = newNode; // Falls es das erste Element ist, wird "first" neu gesetzt
            } else {
                // Sucht das Element vor "current", um den Zeiger anzupassen
                ListNode<A> hilfe = first;
                while (hilfe.getNachfolger() != current) {
                    hilfe = hilfe.getNachfolger();
                }
                hilfe.setNachfolger(newNode.getNachfolger());// Verbindet den vorherigen Knoten mit dem neuen
            }
        }
    }
    // Geht zum ersten Element der Liste
    public void toFirst() {
        current = first;
    }
    public ListNode current () {
        return current;
    }
    // Geht zum letzten Element der Liste
    public void toLast() {
        current = last;
    }
    // Entfernt das aktuelle Element aus der Liste
    public void remove() {
        if (hasAccess()) {
            if (current == first) {
                // Falls das erste Element entfernt wird
                first = first.getNachfolger();  // "first" zeigt auf das zweite Element
                current = first;
                if (first == null) {
                    last = null; // Falls die Liste leer ist, wird auch "last" null
                }
            } else {
                // Element mitten in der Liste entfernen
                ListNode<A> hilfe = first;
                // Läuft durch die Liste, um den Knoten vor "current" zu finden
                while (hilfe.getNachfolger() != current) {
                    hilfe = hilfe.getNachfolger();
                }
                hilfe.setNachfolger(current.getNachfolger()); // Der Knoten vor "current" überspringt "current"
                if (current == last) {
                    last = hilfe; // Falls das letzte Element entfernt wird
                }
                current = current.getNachfolger();
            }
        }
    }

    // Prüft, ob ein aktuelles Element vorhanden ist
    public boolean hasAccess () {

        return current =! null; // "current" ist nicht null, wenn ein Element ausgewählt ist
    }
    // Gibt den Inhalt des aktuellen Elements zurück
    public A getContent() {
        if (hasAccess()) {
            return (A) current.getZeigeAuf();
        }
        return null; // Falls kein aktuelles Element vorhanden ist
    }

    // Setzt den Inhalt des aktuellen Elements
    public void setContent(A pContent) {
        if (hasAccess()) {
            current.setZeigeAuf(pContent);
        }
    }
    // Überprüft, ob die Liste leer ist (kein Element vorhanden)
    public boolean isEmpty() {

        return first == null; // Die Liste ist leer, wenn "first" null ist
    }
}