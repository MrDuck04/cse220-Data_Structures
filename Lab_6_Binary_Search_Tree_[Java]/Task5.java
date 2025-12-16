//Assignment Task (must Submit)
// Complete the sumOfLeaves method
public class Task5 {
    private static Integer mirrorAssist(BSTNode leftSubtree, BSTNode rightSubtree){
        if(leftSubtree == null || rightSubtree == null) return 0;

        int pairSum = leftSubtree.elem + rightSubtree.elem;
        int outer = mirrorAssist(leftSubtree.left, rightSubtree.right);
        int inner = mirrorAssist(leftSubtree.right, rightSubtree.left);

        return pairSum + outer + inner;
    }
    //===================================TASK#5======================
    // This method takes only one parameter
    // it is root of the given tree
    // You can use extra helper private static methods as per need
    public static Integer mirrorSum( BSTNode root ){
        if(root == null) return 0;
        return mirrorAssist(root.left, root.right);
    }
    //===============================================================


}
