public class BinaryTree implements IBst{

		/* Class containing left and right child of current node and key value*/
		@SuppressWarnings("hiding")
		class Node<IItem> { 

			Node<IItem> left, right; 
			IItem data;


			public Node(IItem data) { 
				this.data = data; 
		}


			public Node<IItem> getLeft() {
				return left;
			}


			public void setLeft(Node<IItem> left) {
				this.left = left;
			}


			public Node<IItem> getRight() {
				return right;
			}


			public void setRight(Node<IItem> right) {
				this.right = right;
			}


			public IItem getData() {
				return data;
			}


			public void setData(IItem data) {
				this.data = data;
			}} 
		Node<IItem> root; 

		public Node<IItem> getRoot() {
			return root;
		}

		public void setRoot(Node<IItem> root) {
			this.root = root;
		}

		public void createRoot(IItem data) {
			Node<IItem> newroot = new Node<IItem>(data); 
			this.root = newroot;
		}

		BinaryTree() { 
			this.setRoot(null); 
		} 

		public void insert(IItem data) {
			this.setRoot(insertRec(this.getRoot(),data));
		} 
		
		Node<IItem> insertRec(Node<IItem> root, IItem data) { 

			if (root == null) { 
				root = new Node<IItem>(data); 
				return root; 
			} 

			if (data.itemPrice() <= root.getData().itemPrice()) {
				root.setLeft(insertRec(root.getLeft(),data));} 
			else if (data.itemPrice() > root.getData().itemPrice()) { 
				root.setRight(insertRec(root.getRight(),data)); }

			return root; 
		} 
		public void inorder() { 
		inorderRec(this.getRoot()); 
		} 

		void inorderRec(Node<IItem> node) { 
			if (node != null) { 
				inorderRec(node.getLeft()); 
				System.out.println(node.getData().itemName()); 
				inorderRec(node.getRight()); 
			} 
		}
		public void revInorder() { 
			revInorderRec(this.getRoot()); 
			} 

			void revInorderRec(Node<IItem> node) { 
				if (node != null) { 
					revInorderRec(node.getRight()); 
					System.out.println(node.getData().itemName()); 
					revInorderRec(node.getLeft()); 
				} 
			}
		Node<IItem> max() {
			Node<IItem> temp = this.getRoot();
			while(temp.getRight() != null) {
				temp = temp.getRight();
			}
			return temp;
		}
		Node<IItem> min() {
			Node<IItem> temp = this.getRoot();
			while(temp.getLeft() != null) {
				temp = temp.getLeft();
			}
			return temp;
		}
		
		public void ifGreater(int data) {
			ifGreaterRec(this.getRoot(), data);
		}
		void ifGreaterRec(Node<IItem> temp, int data) {
			if(temp!= null && temp.getData().itemPrice()>data) {
				ifGreaterRec(temp.getLeft(),data);
				System.out.println(temp.getData().itemName());
				ifGreaterRec(temp.getRight(), data);
			}
			else if(temp!= null && temp.getData().itemPrice()<=data) {
				ifGreaterRec(temp.getRight(),data);
			}
		}
		
		public void ifSmaller(int data) {
			ifSmallerRec(this.getRoot(),data);
		}
		void ifSmallerRec(Node<IItem> temp, int data) {
			if(temp!= null && temp.getData().itemPrice()<=data) {
				ifSmallerRec(temp.getRight(),data);
				System.out.println(temp.getData().itemName());
				ifSmallerRec(temp.getLeft(), data);
			}
			else if(temp!= null && temp.getData().itemPrice()>data) {
				ifSmallerRec(temp.getLeft(),data);
			}
		}
		public void SmallerCal(int key) {
			SmallerCalRec(this.getRoot(),key);
		}
		
		void SmallerCalRec(Node<IItem> temp, int key) {
			if(temp!= null ) {
				SmallerCalRec(temp.getRight(),key);
				if (temp.getData().getLast() <=key) {
					System.out.println(temp.getData().itemName());
					}
				SmallerCalRec(temp.getLeft(), key);
			}
			
		}
		
		public void GreaterCal(int data) {
			GreaterCalRec(this.getRoot(), data);
		}
		void GreaterCalRec(Node<IItem> temp, int data) {
			if(temp!= null && temp.getData().getLast()>data) {
				GreaterCalRec(temp.getLeft(),data);
				if (temp.getData().getLast() > data) {
					System.out.println(temp.getData().itemName());
					}
				GreaterCalRec(temp.getRight(), data);
			}
		}
		public void revOrdSize(int key) {
			revOrdSizeRec(this.getRoot(),key);
		}
		void revOrdSizeRec(Node<IItem> node,int key) {
			if (node != null) { 
				revOrdSizeRec(node.getRight(),key);
				if(node.getData().getLast() == key) {
					System.out.println(node.getData().itemName());} 
				revOrdSizeRec(node.getLeft(),key); 
			}
		}
		
	}