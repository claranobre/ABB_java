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
	 * Variable to define value of node
	 */
	private int value;

	/**
	 * Variable to define height of node
	 */
	private int height;
	
	/**
	 * Variable to define son of the left of node
	 */
	private NodeABB left;
	
	/**
	 * Variable to define son of the right of node
	 */
	private NodeABB right;
	
	
	/**
	 * Constructor of class NodeABB
	 * @param key key of the node
	 * @param value value of the node
	 */
	public NodeABB(int key, int value){
		this.key = key;
		this.value = value;
		this.left = null;
		this.right = null;
		
	}
	/**
	 * Function to get key of node
	 * @return key of node
	 */
	public int getKey() {
		return key;
	}
	
	/**
	 * 
	 * @param key value to set key of node
	 */
	public void setKey(int key) {
		this.key = key;
	}
	
	/**
	 * Function to get value of node
	 * @return value of node
	 */
	public int getValue() {
		return value;
	}
	
	/**
	 * Function to set value of node
	 * @param value value to set value of node
	 */
	public void setValue(int value) {
		this.value = value;
	}
	
	/**
	 * Function to get height of node
	 * @return the height of node
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * Function to set height of node
	 * @param height value to set height of node
	 */
	public void setHeight(int height) {
		this.height = height;
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
