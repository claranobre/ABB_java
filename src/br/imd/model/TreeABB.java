package br.imd.model;

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
	/**
	 * Node mother of current node
	 */
	//private NodeABB mother;
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
	public NodeABB insert(NodeABB node, NodeABB root){
		if(node.getKey() > root.getKey()){
			if(root.getRight() != null){
				return this.insert(node, root.getRight());
			}
			else{
				root.setRight(node);
				System.out.println("Nó de key "+node.getKey()+" inserido na arvore.");
				return node;
			}
		}
		else if(node.getKey() < root.getKey()){
			if(root.getLeft() != null){
				return this.insert(node, root.getLeft());
			}
			else{
				root.setLeft(node);
				System.out.println("Nó de key "+node.getKey()+" inserido na arvore.");
				return node;
			}
		}
		else{
			System.out.println("Nó de key "+node.getKey()+" já está na arvore.");
			return root;
		}
	}
	
	/**
	 * Function to search a node in the tree
	 * @param key Node to be inserted in the tree
	 * @param root Node root of the tree
	 * @return the node of the search
	 */
	public NodeABB search(int key, NodeABB root){
		if(key > root.getKey()){
			if(root.getRight() != null){
				return this.search(key, root.getRight());
			}
			else{
				System.out.println("Nó de key "+key+" não foi encontrado na arvore");
				return null;
			}
		}
		else if(key < root.getKey()){
			if(root.getLeft() != null){
				return this.search(key, root.getLeft());
			}
			else{
				System.out.println("Nó de key "+key+" não foi encontrado na arvore");
				return null;
			}
		}
		else{
			System.out.println("Nó de key "+root.getKey()+" foi encontrado na arvore");
			return root;
		}
	}
	
}
