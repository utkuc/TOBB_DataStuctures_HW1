package project.utku;

public class Demo {

	public static void main(String[] args) {
		SLList favList = new SLList();
		Node fav1 = new Node("Samsung" , "Galaxy" , 2005);
		Node fav2 = new Node("Apple", "iPhone" , 2007);
		Node fav3 = new Node("Blackberry" , "bbBold" , 2009);
		favList.addLast(fav1);
		favList.addLast(fav2);
		favList.addLast(fav3);
		Node my1 = new Node("Samsung" ,"Galaxy S3" , 2009);
		Node my2 = new Node("Samsung" , "Galaxy S5", 2014);
		Node my3 = new Node("Uber" , "Zerox" , 2022 );
		SLList myList = new SLList();
		myList.addFirst(my1);
		myList.addLast(my2);
		myList.addLast(my3);
		System.out.println("Original Lists:");
		System.out.println(favList.toString());
		System.out.println(myList.toString());
		favList.removeFirst();
		favList.removeFirst();
		favList.removeFirst();
		myList.addLast(fav1);
		myList.addLast(fav2);
		myList.addLast(fav3);
		System.out.println("After Deleting/Adding");
		System.out.println(myList.toString());
		System.out.println(favList.toString());

		

	}

}
