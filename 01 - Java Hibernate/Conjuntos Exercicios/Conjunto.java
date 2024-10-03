import java.util.ArrayList;

public class Conjunto<T> {
    private ArrayList<T> data;
    
    public Conjunto(ArrayList<T> data)
    {
        this.data = data;
    }
    
    public void add(T value)
    {
        data.add(value);
    }
    
    public T get(int index)
    {
        return data.get(index);
    }
    
    public ArrayList<T> interseccao(Conjunto<T> conjunto)
    {
        ArrayList<T> inter = new ArrayList<T>();

        for (T i : data) {
            for (T j : conjunto.data) {
                if(i.equals(j))
                {
                    inter.add(i);
                }
            }       
        }
        return inter;
    }

    public boolean igual(Conjunto<T> conjunto)
    {
        return this.interseccao(conjunto) == this.data;
    }
}