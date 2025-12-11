// Complete the subtractSummation method
//ASSIGNMENT TASK MUST SUBMIT
public class Task5 {
    
    private static Integer sumTree(BTNode root){
        if(root == null)return 0;
        return ((Integer)root.elem + (sumTree(root.left) + sumTree(root.right)));
    }

    private static Integer leftSubtreeSum(BTNode root){
        if(root == null || root.left == null)return 0;
        return sumTree(root.left);
    }
    
    private static Integer rightSubtreeSum(BTNode root){
        if(root == null || root.right == null)return 0;
        return sumTree(root.right);
    }
    
    //===================================TASK#5===================================
    // This method takes only 1 parameter which is root of the given tree
    // This method returns an Integer
    // At times you may need to typeCast root.elem to Integer
    // You can use extra helper private static methods with extra extra params as per need
    public static Integer subtractSummation( BTNode root ){
        //TO DO
        return (leftSubtreeSum(root) - rightSubtreeSum( root )); //remove this line
    }
    //============================================================================

}
