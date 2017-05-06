package br.imd.model;

import java.lang.Math;
/**
 * 
 * @author gisleude, claranobre
 * Class to define a Node of the Tree
 */
public class TreeABB {
	/**
	 * Node root of tree
	 */
	private NodeABB root;
	
	private int left = 0;
	private int right = 0;
	/**
	 * Function to get root of tree
	 * @return get the root of tree
	 */
	public NodeABB getRoot() {
		return root;
	}

	/**
	 * Constructor of the class TreeABB
	 * @param root root of the tree
	 */
	public TreeABB(NodeABB root){
		this.root = root;
	}
	
	/**
	 * Function to insert a node in the tree
	 * @param node Node to be inserted in the tree
	 * @param root Node root of the tree
	 * @return the node inserted in the tree
	 */
	public NodeABB insert(int key, NodeABB root){
		if(root == null){
			NodeABB new_node = new NodeABB(key);
			root = new_node;
		}
		if(key < root.getKey()){
			root.setNodes_left(root.getNodes_left()+1);
			root.setLeft(this.insert(key, root.getLeft()));
		}
		else if(key > root.getKey()){
			root.setNodes_right(root.getNodes_right()+1);
			root.setRight(this.insert(key, root.getRight()));
		}
		
		return root;
	}
	
	/**
	 * Function to search a node in the tree
	 * @param key Node to be inserted in the tree
	 * @param root Node root of the tree
	 * @return the fetched node
	 */
	public NodeABB search(int key, NodeABB root){
		if(root == null || root.getKey() == key){
			return root;
		}
		else if(key < root.getKey()){
			return this.search(key, root.getLeft());
		}
		else{
			return this.search(key, root.getRight());
		}
	}
	

	/**
	 * Function to catch the median of the tree
	 * @param root node root of the tree
	 * @return the median of the tree
	 */
	public int median(NodeABB root){
		if(this.left == this.right || this.left-1 == this.right){
			this.left = 0;
			this.right = 0;
			return root.getKey();
		}
		else if(this.left > this.right){
			this.left = this.left - (1+root.getLeft().getNodes_right());
			this.right = this.right +(1+root.getRight().getNodes_right());
			return median(root.getLeft());
		}
		else{
			this.left = this.left + (1+root.getRight().getNodes_left());
			this.right = this.right -(1+root.getRight().getNodes_left());
			return median(root.getRight());
		}
	}
	
	/**
	 * Function to return the height of the tree
	 * @param root Node root of the tree
	 * @return the height of the tree
	 */
	public int treeHeight(NodeABB root){
		int left, right;
		
		if(root == null){
			return 0;
		}
		left = this.treeHeight(root.getLeft());
		right = this.treeHeight(root.getRight());
		
		if(left > right){
			return left+1;
		}
		else{
			return right+1;
		}
	}
	
	public String toString(NodeABB root){
		String v = "";
		NodeABB queue[] = null;
		
		queue[0] = root;
		int x,y;
		x = 0;
		y = 1;
		
		while(y > x){
			root = queue[x+1];
			v = v + root.getKey();
			
			if(root.getLeft() != null){
				y = y + 1;
				queue[y] = root.getLeft();
			}
			if(root.getRight() != null){
				y = y + 1;
				queue[y] = root.getRight();
			}
		}
		
		return v;
	}
	
	/**
	 * The function that says if the tree is full or not
	 * @param root
	 * @return true if tree is full and false if tree is not full
	 */
	public boolean isFull(NodeABB root){
		int n_nodes = root.getNodes_left() + root.getNodes_right() + 1;
		if(n_nodes == Math.pow(2, this.treeHeight(root))-1){
			return true;
		}
		else{
			return false;
		}
	}
	
	/**
	 * Function that says if the tree is complete or not
	 * @param root
	 * @return true if tree is complete and false if tree is not complete
	 */
	public boolean isComplete(NodeABB root){
		int n_nodes = root.getNodes_left() + root.getNodes_right() + 1;
		if(n_nodes > Math.pow(2, this.treeHeight(root)-1) && n_nodes <= (Math.pow(2, this.treeHeight(root))-1)){
			return true;
		}
		else{
			return false;
		}
	}
	
	/**
	 * Function that says what is the n element on the tree
	 * @param root node root of the tree
	 * @param n n element on the tree
	 * @return the n element on the tree
	 */
	public int nElement(NodeABB root, int n){
		int x = 0;
		
		if(root.getLeft() != null){
			x = nElement(root.getLeft(), n);
			if(x != 0){
				return x;
			}
		}
		
		n = n-1;
		
		if(n == 0){
			return root.getKey();
		}
		if(root.getRight() != null){
			x = nElement(root.getRight(), n);
			if(x != 0){
				return x;
			}
		}
		
		return 0;
	}
	
}
