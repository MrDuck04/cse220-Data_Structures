//Assignment Task (must Submit)
// Complete the isBST method
public class Task6 {
    // static private BSTNode check(BSTNode node){
    //     if(node == null)return null;
    //     if(node != null && (node.left.elem > node.elem || node.right.elem < node.elem)){
    //         return null;
    //     }
    //     node.left = check(node.left);
    //     node.right = check(node.right);

    //     return node;
    // }
    //===================================TASK#6======================
    // This method takes only one parameter
    // it is root of the given tree
    // You can use extra helper private static methods as per need
    public static Boolean isBST( BSTNode root ){
        //TO DO
        if(root == null) return false;
        if(root.right.elem == null || (root.left.elem > root.elem || root.right.elem < root.elem)){
            return false;
        }
        if(root.left.elem< root.elem || root.right.elem > root.elem || (root.left.elem == null && root.elem != null) ){
            return true;
        }
        if(root.left.elem < root.elem || root.left.elem ==null){
            return isBST(root.left);
        }if(root.right.elem > root.elem || root.right.elem == null){
            return isBST(root.right);
        }
        return true;
         // remove this line
    }
    //===============================================================


}
