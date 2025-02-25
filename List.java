
public class List <ContentType> {

    public ListNode last; //letzter Knoten
    public ListNode current; //aktueller Knoten
    public ListNode first; //erster Knoten

    public List() {
        first = null;
        current = null;
        last = null;
    }

    // Überprüft, ob die Liste leer ist (kein Element vorhanden)
    public boolean isEmpty() {
        return first == null; // Die Liste ist leer, wenn "first" null ist
    }
    // Prüft, ob ein aktuelles Element vorhanden ist
    public boolean hasAccess () {
        return current =! null; // "current" ist nicht null, wenn ein Element ausgewählt ist
    }

    // Gibt den Inhalt des aktuellen Elements zurück
    public ContentType getContent() {
        if (hasAccess()) {
            return (ContentType) current.getZeigeAuf();
        }
        return null; // Falls kein aktuelles Element vorhanden ist
    }

    // Setzt den Inhalt des aktuellen Elements
    public void setContent(ContentType pContent) {
        if (hasAccess()) {
            current.setZeigeAuf(pContent);
        }
    }

    // Geht zum ersten Element der Liste
    public void toFirst() {
        current = first;
    }

    // Geht zum letzten Element der Liste
    public void toLast() {
        current = last;
    }

    public ListNode current () {
        return current;
    }

    // Geht zum nächsten Element in der Liste
    public void next() {
        if (hasAccess()) {
            current = current.getNachfolger();// Springt zum nächsten Knoten
        }
    }

    public void append(ContentType pContent) {
        ListNode<ContentType> newNode = new ListNode<ContentType>(pContent);
        if (isEmpty()) {
            // Wenn die Liste leer ist, wird das Element als erstes gesetzt
            first = newNode;
            current = newNode;
            last = newNode;
        } else {
            // Hängt das neue Element ans Ende
            last.setNachfolger(newNode);// Verbindet das aktuelle letzte Element mit dem neuen Knoten
            current = newNode;
            last = newNode;
        }
    }


    // Fügt ein neues Element in die Liste ein
    public void insert(ContentType pContent) {
        ListNode<ContentType> newNode = new ListNode<>(pContent);
        if (isEmpty()) {
            // Falls die Liste leer ist, wird der neue Knoten sowohl "first" als auch "last"
            first = newNode;
            current = newNode;
            last = newNode;
        } else if (hasAccess()) {
            // Neues Element vor dem aktuellen einfügen
            newNode.setNachfolger(current);
            if (current == first) {
                first = newNode; // Falls es das erste Element ist, wird "first" neu gesetzt
            } else {
                // Sucht das Element vor "current", um den Zeiger anzupassen
                ListNode<ContentType> temporaer = current.getNachfolger();
                while (temporaer.getNachfolger() != current) {
                    temporaer = temporaer.getNachfolger();
                temporaer.setNachfolger(newNode.getNachfolger());// Verbindet den vorherigen Knoten mit dem neuen
            }
        }
    }

    // Entfernt das aktuelle Element aus der Liste
    public void remove(){
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
                ListNode<ContentType> temporaer = first;
                // Läuft durch die Liste, um den Knoten vor "current" zu finden
                while (temporaer.getNachfolger() != current) {
                    temporaer = temporaer.getNachfolger();
                }
                temporaer.setNachfolger(current.getNachfolger()); // Der Knoten vor "current" überspringt "current"
                if (current == last) {
                    last = temporaer; // Falls das letzte Element entfernt wird
                }
                current = current.getNachfolger();
            }
        }
    }
}
}