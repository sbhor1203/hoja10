import java.util.*;


public class DirectedMatrix <V, E>{

    protected int size;
    protected Object data[][];
    protected Map<V, Vertex<V>> dict;
    protected List<Integer> freeList;
    protected boolean directed;

    //Constructor
    public DirectedMatrix(int size){
        this.size = size;
        data = new Object[size][size];
        dict = new HashMap<V, Vertex<V>>();
        freeList = new LinkedList<Integer>();

        for(int i = size-1; i>= 0; i--){
            freeList.add(i);
        }
    }


    public Map getMap(){
        
        return dict;
    }

    public void add(V label){
        

        if(dict.containsKey(label)) return;
        int row = freeList.remove(0);
        dict.put(label, new Vertex<V>(label, row));
    }

    public void addEdge(V v1, V v2, E label){
        
        Vertex<V> vtx1, vtx2;
        vtx1 = dict.get(v1);
        vtx2 =  dict.get(v2);

        Edgex<V, E> e = new Edgex<V, E>(vtx1.label(), vtx2.label(), label);
        data[vtx1.index()][vtx2.index()] = e;
    }

    public void removeEdge(V v1, V v2){
        
        Vertex<V> vtx1, vtx2;
        vtx1 = dict.get(v1);
        vtx2 = dict.get(v2);
        data[vtx1.index()][vtx2.index()] = null;
    }

    public V get(V label){  
        return dict.get(label).label();
    }

    public int getIndex(V label){
        return dict.get(label).index();
    }

    public Edgex<V, E> getEdge(V label1, V label2){
        int row = dict.get(label1).index();
        int column = dict.get(label2).index();
        return (Edgex<V, E>) data[row][column];
    }

    public void clear(){
        dict.clear();
        for(int i = 0; i<size; i++){
            for(int j = 0; j<size; j++){
                data[i][j] = null;
            }
        }

        freeList = new LinkedList<Integer>();
        for(int i = size-1; i>=0; i--)
            freeList.add(i);
    }

    public boolean isEmpty(){
        return dict.isEmpty();
    }


    public boolean contains(V label){
        return dict.containsKey(label);
    }

    public Object[][] getData(){
        return data;
    }

    public V getByIndex(int index){
        for(V keys: dict.keySet()){
            if(dict.get(keys).index() == index)
                return dict.get(keys).label();
        }
        return null;
    }
    
}
