package telaphon;

public class HashTable {

    private int size;
    private SimpleLinkedlist[] x;

    public HashTable(int size) {
        this.size = size;
        this.x = new SimpleLinkedlist[size];
    }

    private int hash(int data) {
        return data % size;
    }

    public void add(int data) {
        int position = this.hash(data);
        if (x[position] == null) {
            x[position] = new SimpleLinkedlist();
        }
        x[position].insert(data);
    }

    public SimpleNode search(int data) {
        int position = this.hash(data);
        System.out.println("Ex table posi : " + position);
        SimpleNode n = x[position].search(data);
        return n;
    }

    public String toString() {
        String op = "";
        SimpleNode n;
        for (int i = 0; i < size; i++) {
            op += i + ">>";
            if (x[i] != null) {
                n = x[i].head;
            } else {
                n = null;
            }
            while (n != null) {
                op += n + " ";
                n = n.next;
            }
            op += "\n";
        }
        return op;
    }

    public static void main(String[] args){
        HashTable ht = new HashTable(7);
        int[] d = {1,2,5,9,4,6,8};
        SimpleNode n;
        System.out.println("Data : ");
        
        for(int i = 0;i<d.length;i++){
            System.out.print(d[i]+" ");
        }System.out.println("");
        
        for(int i=0;i<d.length;i++){
            ht.add(d[i]);
        }
        System.out.println("HashTable :");
        System.out.println(ht.toString());
        System.out.println("9");
        n = ht.search(2);
        System.out.print("N : "+n);
        System.out.println("");
    }
}
