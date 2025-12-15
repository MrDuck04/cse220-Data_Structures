//Assignment Task (must Submit)
// Complete the sumOfLeaves method

public class Task5 {
    static private void inPrint(BSTNode node){
        if(node == null)return;
        inPrint(node.left);
        System.out.println(node.elem);
        inPrint(node.right);

    }
   static private void ms(BSTNode nodel, BSTNode noder){
    if(nodel.left == null && noder.right ==null) return;

    ms(nodel.left, noder.right);
    System.out.println(nodel.left.elem + " " + noder.right.elem);
    ms(nodel.right, noder.left);
   }
    //===================================TASK#5======================
    // This method takes only one parameter
    // it is root of the given tree
    // You can use extra helper private static methods as per need
    
    public static Integer mirrorSum( BSTNode root ){
        //TO DO
        if(root == null) return 0;        
        BSTNode rootleft = root.left;        
        BSTNode rootRight = root.right;
        ms(rootleft, rootRight);
        return 0;
        // remove this line
    }
    //===============================================================


}
