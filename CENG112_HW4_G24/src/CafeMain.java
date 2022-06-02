import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Scanner;

public class CafeMain{
	
	public static boolean notExistSameTypeRoot (BinaryTree[] roots,String type) {
		for (int i=1 ; i < 5 ; i++) {
			if (roots[i] != null) {
				if (!roots[i].getRoot().getData().itemType().equals(type)){
					return true;
				}
			}// if end
			else {
				return true;
			}
		}//for end
		return false;
	}//function end
	
	public static void main (String[] args) throws IOException{
		File file = new File("CENG112_HW4_CafeMenu.txt");
		String line;
		BinaryTree[] roots = new BinaryTree[5];
		int last;
		BinaryTree allTree = new BinaryTree();
		roots[0] = allTree;
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			while ((line = br.readLine()) != null) {
				String[] my_line = line.split(",");
				String itemType = my_line[0] , itemName = my_line[1];
				int itemPrice = Integer.parseInt(my_line[2]);
				IItem data;
				if (itemType != "Bakery") {
					last = Integer.valueOf(my_line[3].split("o")[0]);
				}//if end
				else {
					last = Integer.parseInt(my_line[3]);
				}//else end
				if (itemType.equals("Coffee")) {
					data = new Coffee(itemName , itemPrice , last);
				}//if end 
				else if (itemType.equals("Tea")) {
					data = new Tea(itemName , itemPrice , last);
				}//else if end
				else if (itemType.equals("Frappuccino")) {
					data = new Frappuccino(itemName , itemPrice , last);
				}//else if end
				else  {
					data = new Bakery(itemName , itemPrice , last);
				}//else if end
				BinaryTree tree= new BinaryTree();
				
				
				if (allTree.getRoot() == null ) {
					allTree.createRoot(data);
				}// if end
				else {
					allTree.insert(data);
				}// else end

				switch (itemType) {
				case "Coffee":
					if (roots[1]==null) {
						tree.createRoot(data);
						roots[1] = tree;
					}
					else{roots[1].insert(data);}
					break;
				case "Tea" :
					if (roots[2]==null) {
						tree.createRoot(data);
						roots[2] = tree;
					}
					else{roots[2].insert(data);}
					break;
				case "Frappuccino" :
					if (roots[3]==null) {
						tree.createRoot(data);
						roots[3] = tree;
					}
					else{roots[3].insert(data);}
					break;
				case "Bakery" :
					if (roots[4]==null) {
						tree.createRoot(data);
						roots[4] = tree;
					}
					else{roots[4].insert(data);}
					break;
				}
				
				
			}//While End
			br.close();
		}//try end
		int decision ;
		Scanner scan = new Scanner (System.in);
		System.out.println("Please write a decision !(Please enter 15 for look to operation menu!):");
		decision = scan.nextInt();
		int input ;
		while (decision != 0) {
			switch (decision) {
				case 1 :
					System.out.println("Max priced coffee:"+roots[1].max().getData().itemName());
					System.out.println("Min priced coffee:"+roots[1].min().getData().itemName());
					break;
				case 2 :
					System.out.println("Max priced tea:"+roots[2].max().getData().itemName());
					System.out.println("Min priced tea:"+roots[2].min().getData().itemName());
					break;
				case 3 :
					System.out.println("Max priced bakery:"+roots[4].max().getData().itemName());
					System.out.println("Min priced bakery:"+roots[4].min().getData().itemName());
					break;
				case 4 :
					roots[0].revInorder();
					break;
				case 5 :
					roots[0].inorder();
					break;
				case 6 :
					roots[1].revInorder();
					break;
				case 7 :
					roots[3].inorder();
					break;
				case 8 :
					roots[2].revInorder();
					break;
				case 9 :
					System.out.println("Please enter a price for the operation(example : '15','17'etc.):");
					input = scan.nextInt();
					roots[0].ifSmaller(input);
					break;
				case 10 :
					System.out.println("Please enter a price for the operation(example : '15','17'etc.):");
					input = scan.nextInt();
					roots[0].ifGreater(input);
					break;
				case 11 :
					System.out.println("Please enter calories for the operation(example : '275','350'etc.):");
					input = scan.nextInt();
					roots[4].SmallerCal(input);
					break;
				case 12 :
					System.out.println("Please enter calories for the operation(example : '275','350'etc.):");
					input = scan.nextInt();
					roots[4].GreaterCal(input);
					break;
				case 13 :
					System.out.println("Please enter size in oz for the operation(example : '12','16'etc.):");
					input = scan.nextInt();
					roots[1].revOrdSize(input);
					break;
				case 14 :
					System.out.println("Please enter size in oz for the operation(example : '12','16'etc.):");
					input = scan.nextInt();
					roots[2].revOrdSize(input);
					break;
				case 15 :
					//OPERATİON MENU
					System.out.println("0. Exit!");
					System.out.println("1. Print the minimum and maximum priced coffee on the menu.");
					System.out.println("2. Print the minimum and maximum priced tea on the menu.");
					System.out.println("3. Print the minimum and maximum priced bakery item on the menu.");
					System.out.println("4. Print all items in descending order in terms of the price." );
					System.out.println("5. Print all items in ascending order in terms of the price.");
					System.out.println("6. Print all coffees in descending order in terms of the price.");
					System.out.println("7. Print all frappuccinos in ascending order in terms of the price.");
					System.out.println("8. Print all teas in descending order in terms of the price.");
					System.out.println("9. Print all items whose prices are less or equal than the amount taken from the console.");
					System.out.println("10. Print all items whose prices are greater than the amount taken from the console." );
					System.out.println("11. Print all bakeries whose calorie is less or equal than the amount taken from the console.");
					System.out.println("12.Print all bakeries whose calorie is greater than than the amount taken from the console.");
					System.out.println("13.Print all coffees in descending order in terms of the price, where coffee size is taken from the console.");
					System.out.println("14.Print all teas in descending order in terms of the price, where tea size is taken from the console.");
					break;
				
			}// switch end
			System.out.println("Please write a decision !(Please enter 15 for look to operation menu!):");
			decision = scan.nextInt();
		}//while end
		scan.close();
	}//void main end
}// class main end
