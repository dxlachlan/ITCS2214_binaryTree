/* 
* Date: 17 November 2013
* Programmer: Amanda Gonya
* Name: Program 2
* Professor: Dr. Jugan
* Class: ITCS 2214-002
* Program: Implements a binary tree and searches the nodes for random determined string value.
*/



   
public class TreeNode {
    String num;        // The data in this node.
    TreeNode left;   // Pointer to the left subtree.
    TreeNode right;  // Pointer to the right subtree.
    int frequent;


	
	public TreeNode(String n){
		num = n;
		left = null;
		right = null;
      frequent = 1;
	}  
   
   
	public void add(String value) {

		if (left == null) {
		
			left = new TreeNode(value);
		
		} else if( right == null){
		
			right = new TreeNode(value);
		} else {
         if(countChildren(left) <= countChildren(right)){
            left.add(value);
         }else{
            right.add(value);
         }
      }
	}
   public void increaseFreq()
   {
  frequent++;
   }
   public int updateFreq(int f)
   {
   f = frequent++;
   return f;
   }
   
   public int countChildren(TreeNode node){
      int count = 0;
      
      if(node != null){
         count = 1 + countChildren(node.getLeft())+countChildren(node.getRight());    
      }
      
      return count;
   }
	
	public TreeNode getLeft(){
		return left;
	}
	
	public TreeNode getRight(){
		return right;
	}
	
	public String getNum(){
		return num;
	}
   
   public int getFreq()
   { return frequent;
   }
	
}