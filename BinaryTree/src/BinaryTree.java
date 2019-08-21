// https://www.youtube.com/watch?v=M6lYob8STMI


public class BinaryTree {

	Node root;
	public static void main(String[] args){
		
		BinaryTree bt = new BinaryTree();
		bt.addNode(50, "CEO");
		bt.addNode(25, "President");
		bt.addNode(15, "VP Sales");
		bt.addNode(30, "Director");
		bt.addNode(75, "Sales 1");
		bt.addNode(85, "Sales 2");
	
		bt.postOrderTraversalTree(bt.root);
	}
	
	public void addNode(int key, String name){
		
		Node newNode = new Node(key, name);
		if (root == null){
			root = newNode;
		}else{
			// traverse tree
			Node focusNode = root;
			Node parent;
			
			while(true){
				parent = focusNode;
				// left child
				if (key < focusNode.key){
					// traverse the left node
					focusNode = focusNode.leftChild;
					if (focusNode == null){
						// left child is empty, add the newNode
						parent.leftChild = newNode;
						return;
					}
				}else {
					focusNode = focusNode.rightChild;
					if (focusNode == null){
						parent.rightChild = newNode;
						return;
					}
				}
			}
			
		}
		
	}
	
	public void inOrderTraversalTree(Node focusNode){
		
		if (focusNode != null){
			// traverse the left nodes
			inOrderTraversalTree(focusNode.leftChild);
			System.out.println(focusNode);
			// traverse the right nodes
			inOrderTraversalTree(focusNode.rightChild);
		}
		
	}
	public void preOrderTraversalTree(Node focusNode){
		
		if (focusNode != null){
			System.out.println(focusNode);
			// traverse the left nodes
			preOrderTraversalTree(focusNode.leftChild);

			// traverse the right nodes
			preOrderTraversalTree(focusNode.rightChild);
		}
		
	}

    public void postOrderTraversalTree(Node focusNode){
	
	if (focusNode != null){
		
		// traverse the left nodes
		postOrderTraversalTree(focusNode.leftChild);

		// traverse the right nodes
		postOrderTraversalTree(focusNode.rightChild);
		System.out.println(focusNode);
	}
	
}
	
}

class Node{
	
	int key;
	String name;
	
	Node leftChild;
	Node rightChild;
	
	Node(int key, String name){
		this.key = key;
		this.name = name;
		
	}
	public String toString(){
		return this.name + " has a " + this.key;
	}
	
}

