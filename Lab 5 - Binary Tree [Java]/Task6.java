// Complete the levelSum method
//ASSIGNMENT TASK MUST SUBMIT
public class Task6 {
    
    static void levelSumHelper(BTNode root, int level, int[] oddSum, int[] evenSum){
        if(root == null) return;
        if(level % 2 == 0){
            evenSum[0] += (Integer)root.elem;
        } else {
            oddSum[0] += (Integer)root.elem;
        }
        levelSumHelper(root.left, level + 1, oddSum, evenSum);
        levelSumHelper(root.right, level + 1, oddSum, evenSum);
    }
    //===================================TASK#6===================================
    // This method takes only 1 parameter which is root of the given tree
    // This method returns an Integer
    // At times you may need to typeCast root.elem to Integer
    // You can use extra helper private static methods with extra extra params as per need
    public static Integer levelSum( BTNode root ){
        //TO DO
        int[] oddSum = {0};
        int[] evenSum = {0};
        levelSumHelper(root, 0, oddSum, evenSum);
        return oddSum[0] - evenSum[0];
    }
    //============================================================================

}
