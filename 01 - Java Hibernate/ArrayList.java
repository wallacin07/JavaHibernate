public  class ArrayList<T> implements Collection<T>{
    private T[] data;
    private int size = 0;
    public ArrayList(){
        data = create(10);
    }   

    T[] create (int size){
        Object[] array = new Object[size];
        return (T[])array;
    }

    @Override
    public T get(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public void add(T value) {
      
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return size;
    }
}
