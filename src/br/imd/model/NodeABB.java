package br.imd.model;


/**
 * 
 * @author gisleude, claranobre
 * Class to define a Node of the Tree
 */
public class NodeABB {
	/**
	 * Variable to define key of node 
	 */
	private int key;
	
	/**
	 * Variable to define son of the left of node
	 */
	private NodeABB left;
	
	/**
	 * Variable to define son of the right of node
	 */
	private NodeABB right;
	
	/**
	 * Variable to define the quantity of left nodes
	 */
	private int nodes_left;
	
	/**
	 * Variable to define the quantity of right nodes
	 */
	private int nodes_right;
	/**
	 * Constructor of class NodeABB
	 * @param key key of the node
	 * @param value value of the node
	 */
	public NodeABB(int key){
		this.key = key;
		this.left = null;
		this.right = null;
		nodes_left = 0;
		nodes_right = 0;
	}
	/**
	 * Function to get key of node
	 * @return key of node
	 */
	public int getKey() {
		return key;
	}
	
	public int getNodes_left() {
		return nodes_left;
	}
	public void setNodes_left(int nodes_left) {
		this.nodes_left = nodes_left;
	}
	public int getNodes_right() {
		return nodes_right;
	}
	public void setNodes_right(int nodes_right) {
		this.nodes_right = nodes_right;
	}
	/**
	 * 
	 * @param key value to set key of node
	 */
	public void setKey(int key) {
		this.key = key;
	}

	/**
	 * Function to get left son of node
	 * @return the left son of node
	 */
	public NodeABB getLeft() {
		return left;
	}
	
	/**
	 * Function to set a node as left son of node
	 * @param left node to set left son of node
	 */
	public void setLeft(NodeABB left) {
		this.left = left;
	}
	
	/**
	 * Function to get right son of node
	 * @return the right son of node
	 */
	public NodeABB getRight() {
		return right;
	}
	
	/**
	 * Function to set a node as right son of node
	 * @param right node to set right son of node
	 */
	public void setRight(NodeABB right) {
		this.right = right;
	}
}
