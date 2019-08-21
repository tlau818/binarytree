// added new comments - tlau 8/20/2019

public class BinaryTree {
	
	private Node root;
	
	class Node{
		private Node left;
		private Node right;
		
		private int data;
		private String name;
		
		public Node(int data, String str){
			this.data = data;
			this.name = str;
		}
		
		public String toString(){
			return "data: " + this.data + "name: " + this.name;
		}
	}
	
	public void addNode(int data, String name){
		Node newNode = new Node(data, name);
		if (root == null){
			root = newNode;
			return;
		}else{
			Node focusNode = root;
			Node parent;
			while(true){
				parent = focusNode;
				// left child
				if (data < focusNode.data){
					focusNode = focusNode.left;
					if (focusNode == null){
						parent.left = newNode;
						return;
					}
				}else{
					focusNode = focusNode.right;
					if (focusNode == null){
						parent.right = newNode;
						return;
					}
				}
				
			}
			
		}
		
	}
	
	public void inOrderTraversalTree(Node focusNode){
	
		if (focusNode != null){
			inOrderTraversalTree(focusNode.left);
			System.out.println(focusNode);
			inOrderTraversalTree(focusNode.right);
		}
	}
}
