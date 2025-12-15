//Before starting to work on this design the Tree in the Tester code 
// Complete the sumOfLeaves method
public class Task2 {
    
    // private static boolean search(BSTNode node, Integer key){
    //     Integer[] arr = new Integer[10];
    //     int i = 0;
    //     if(node == null)return false;
    //     if(node.elem == key) {
    //         arr[i++] = node.elem;
    //         return true;
    //     }
    //     if(key < node.elem) return search(node.left, key);
    //     if(key > node.elem) return search(node.right, key);
    //     return false;
    // }
    //===================================TASK#2===================================
    // This method takes only 2 parameters
    // 1st one is root
    // 2nd one is an Integer
    // You'll need to find the path from the root to a node containing the Integer
    // return the path as a String
    static String path = "";
    public static String findPath( BSTNode root, Integer key ){
        // TO DO               
        if(root == null) return "No Path Found";//remove this line       
        if(root.elem == key) {
            path += root.elem.toString();
            return path;
        }
        if(key < root.elem){
            path +=root.elem.toString() + " ";
            return findPath(root.left, key);
        }
        if(key > root.elem){
            path += root.elem.toString() + " ";
            return findPath(root.right, key);
        }
        return "No Path Found";
    }
    //============================================================================

}
