public interface IBst {
	void insert(IItem data);
	void inorder();
	void revInorder();
	void ifGreater(int data);
	void ifSmaller(int data);
	void SmallerCal(int data);
	void GreaterCal(int data);
	void revOrdSize(int data);
}