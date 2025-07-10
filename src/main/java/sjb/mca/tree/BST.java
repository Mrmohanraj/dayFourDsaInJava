package sjb.mca.tree;

public class BST {
	TreeNode root;
	void insert(int value) {
		root=insertNode(root,value);
	}

	 TreeNode insertNode(TreeNode node, int value) {
		if(node==null) {
			node=new TreeNode(value);
			return node;
		}
		if(value<node.data) {
			node.left=insertNode(node.left, value);
		}
		else if (value>node.data)
		{
			node.right=insertNode(node.right, value);
		}
		return node;
	}
	
	
	
	void preorder() {
		preorderNode(root);
	}

	  void preorderNode(TreeNode node) {
		// TODO Auto-generated method stub
		  if(node!=null)
			 {
				
			  System.out.println(node.data);
				 preorderNode(node.left);
				 preorderNode(node.right);
				 
			 }
		  
		  
		
	}
	  void postorder() {
		  postorderNode(root);
			  
		  
	  }

	  void postorderNode(TreeNode node) {
		// TODO Auto-generated method stub
		  
			 postorderNode(node.left);
			 postorderNode(node.right);
			 System.out.println(node.data);
	}
	  void inorder() {
			inorderNode(root);
		}

	 void inorderNode(TreeNode node) {
		// TODO Auto-generated method stub
		 
		 if(node!=null)
		 {
			 inorderNode(node.left);
			 System.out.println(node.data);
			 inorderNode(node.right);
		 }
		
	}

	public static void main(String[] args) {
		
		BST b = new BST();
		b.insert(10);
		b.insert(45);
		b.insert(5);
		b.inorder();
		

	}

}
