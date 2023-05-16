public class Edgex <V, E>{

    protected V here;
    protected V there;
    protected E label;

    //Constructor
    public Edgex(V vtx1, V vtx2, E label) {
        here = vtx1;
        there = vtx2;
        this.label = label;
    }

    public V here() {
        return here;
    }

    public V there() {
        return there;
    }

    public void setLabel(E label) {
        this.label = label;
    }

    public E label() {
        return label;
    }


    public boolean equals(Object o) {
        Edgex<?,?> e = (Edgex<?,?>)o;
        return ((here().equals(e.here()) &&
                there().equals(e.there())));
    }
    
}
