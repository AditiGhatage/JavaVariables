package com.localvar;

public class SwapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intnumb;
		int intnumber;
		intnumb = 29;
		intnumber = 38;
		

        System.out.println("--Before swap--");
        System.out.println("First number = " + intnumb);
        System.out.println("Second number = " + intnumber);
		
        int temp = intnumb;
        intnumb = intnumber;
        intnumber = temp;
        
        System.out.println("--After swap--");
        System.out.println("First number = " + intnumb);
        System.out.println("Second number = " + intnumber);
        

	}

}
