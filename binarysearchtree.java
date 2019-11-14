import java.util.*;

import assignmentupgrad.lordering.Node;
 class binarysearchtree {
	class Node
	{
		int d;
		Node left,right;
		public Node(int d)
		{
			this.d=d;
			left=right=null;
		}
		
	}
	public binarysearchtree()
	{
		root=null;
		
	}
	Node root;
	void insert(int d)
	{
		root = insertrec(root,d);
	}
	Node insertrec(Node root,int d)
	{
		if(root==null)
		{
			return root;
		}
		else {
			if(d<root.d)
			{
				root.right=insertrec(root.right,d);
			}
			else if(d>root.d)
			{
				root.left=insertrec(root.left,d);
			}
		}
		return root;
	}
	void inorder()
	{
		inrec(root);
	}
	Node inrec(Node root)
	{
		if(root!=null)
		{
			inrec(root.left);
			System.out.println(root.d+" ");
			inrec(root.right);
		}
		return root;
	}
	void preorder()
	{
		prerec(root);
	}
	Node prerec(Node root)
	{
		if(root!=null)
		{
			System.out.println(root.d+" ");
			inrec(root.left);
			inrec(root.right);
		}
		return root;
	}
	void postorder()
	{
		postrec(root);
	}
	Node postrec(Node root)
	{
		if(root!=null)
		{
			inrec(root.left);
			inrec(root.right);
			System.out.println(root.d+" ");
		}
		return root;
	}
	public void print(Node root) {
		Queue<Node> q = new LinkedList<Node>();
		Stack<Node> s = new Stack<Node>();
		q.add(root);
		while (!q.isEmpty()) {
			Node n = q.remove();
			if (n.left != null) {
				q.add(n.left);
			}
			if (n.right != null) {
				q.add(n.right);
			}
			s.add(n);
		}
		while (s.isEmpty() == false) {
			System.out.print(s.pop().d + " ");
		}
	}
	public static void main(String[] args)
	{
		binarysearchtree tree=new binarysearchtree();
		tree.insert(4);
		tree.insert(6);
		tree.insert(1);
		tree.insert(7);
		tree.insert(8);
		tree.insert(5);
		tree.inorder();
		tree.preorder();
		tree.postorder();
		tree.print(root);
	}

}
