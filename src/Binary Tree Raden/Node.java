
package praktikum1;
/**
 * # nim : 2031710121 
 * # Kelas : MI-1E
 * # nama : Raden Dimas Erlangga
 */
public class Node {
    int data;
    Node left;
    Node right;
    
    public Node(){      
    }
    public Node (int data){
        this.left = null;
        this.data = data;
        this.right = null;
    }
}
