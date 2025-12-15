//Assignment Task (must Submit)
// Complete the rangeSum method
public class Task4 {

    //===================================TASK#4======================
    // This method takes only three parameters
    // first one is the root of the given tree
    // second one the low range and third one is high range
    // You can use extra helper private static methods as per need
    static int sum = 0;
    public static Integer rangeSum( BSTNode root, Integer low, Integer high ){
        //TO DO
        if( root == null){
            return 0;
        }
        if(root.elem <= high){
            sum+=root.elem;
            return sum;
        }
        if(root.elem >= low){
            sum+=root.elem;
            return sum;
        }
        if (low < root.elem || high < root.elem) {
            sum+=root.elem;
            return rangeSum(root.left, low, high);
        }
        if(low > root.elem || high > root.elem){
            sum+=root.elem;
            return rangeSum(root.right, low, high);
        }
        return sum;
    //===============================================================

    }
}
