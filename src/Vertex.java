  /**
 * @author Audrey Bhor, Ximena LLarena
 *  
 */

public class Vertex <V>{
    protected int index;
    protected V label;

    //Constructor
    public Vertex(V label, int index) {
        this.label = label;
        this.index = index;
    }


    
    /** 
     * @return V
     */
    public V label() {
        
        return label;
    }

/// vertices iguales
    public boolean equals(Object o) {
        
        Vertex<V> vertex = (Vertex<V>) o;
        return label.equals(vertex.label());
    }

    public int index(){
        
        return index;
    }

}
