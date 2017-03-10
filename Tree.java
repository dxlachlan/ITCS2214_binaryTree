/* 
* Date: 17 November 2013
* Programmer: Amanda Gonya
* Name: Program 2
* Professor: Dr. Jugan
* Class: ITCS 2214-002
* Program: Implements a binary tree and searches the nodes for random determined string value.
*/

public class Tree {
	
	private TreeNode root;
	
	public Tree(){
		root = null;
	}
	public boolean isEmpty(){
		return root == null;
	}
	public void insert(String value){
		if(isEmpty()){
			root = new TreeNode(value);
		}else{
			if (frequency(value,root) == false)
         {         
         root.add(value);
         }	
		}
      setFreq(value, count(value));
	}
//**needs tweeked


public void search(String key)
    {
        System.out.println(key + " found " + count(key) + " times.");
    }
    
public void find (String key,TreeNode node)
{ if (node.num.equals(key))
{ System.out.println(key + node.getFreq());
// method and updates the frequency 

}
if(node.left != null) {
find(key, node.left);
}
if(node.right != null) {
find(key, node.right);
}
}
public boolean frequency (String key,TreeNode node)
{ if (node.num.equals(key))
{ node.increaseFreq();
return true;
// method and updates the frequency 

}
else if(node.left != null && frequency(key, node.left) == true)
{return true;
}
else if(node.right != null && frequency(key, node.right) == true)
{ return true;
}
else
{return false;
}
}


//traverses the tree and returns the number of nodes matching key
public int count(String key)
    {
        return countString(key, root);
    }
    public int countString(String key, TreeNode node)
    {
        int count = 0;
        if(node != null){
            if(node.getNum().equals(key)){
                count++;
            }
            if(node.getLeft() != null){
                count += countString(key, node.getLeft());
            }
            if(node.getRight() != null){
                count += countString(key, node.getRight());
            }
        }
        return count;
    } 
//traverses the tree and sets the value of all nodes matching key to the appropriate value
    public void setFreq(String key, int f){
        freqUpdate(key, f, root);
    }
    public void freqUpdate(String key, int f, TreeNode node)
    {
        if(node != null){
            if(node.getNum().equals(key)){
                node.updateFreq(f);
            }
            if(node.getLeft() != null){
                freqUpdate(key, f, node.getLeft());
            }
            if(node.getRight() != null){
                freqUpdate(key, f, node.getRight());
            }
        }
    }


public void printPreOrder()
{
preOrder(root);
}

public void preOrder(TreeNode root)
{
if(root ==null)
{
return;
}
System.out.print(root.num + "' ");
preOrder(root.left);
preOrder(root.right);

}
public void printPostOrder()
{postOrder(root);
}

public void postOrder(TreeNode root)
{ if(root.left != null)
{ postOrder(root.left);
}
if(root.right != null)
{
postOrder (root.right);
}
System.out.print(root.num + ", ");

}
public void printInOrder()
{inOrder(root);
}
public void inOrder(TreeNode root)
{
if (root ==null)
{ return;
}
inOrder(root.left);
System.out.print(root.num + ", ");
inOrder(root.right);

}


  public TreeNode getRoot(){
	return root;
	
}
}