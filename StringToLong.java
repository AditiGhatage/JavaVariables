package com.datatypecasting;

public class StringToLong 
{
		//String to Long conversion
	
		public void stringToLongConversion()
		{
			String strnumber= "6787456389";
			long longNumber= Long.parseLong(strnumber);
			
			System.out.println("Value of Long is: " +longNumber);
		}

		//Long to String Conversion
		public void longToStringConversion()
		{
			long longnumber= 3452678765L;
			String strNumber= String.valueOf(longnumber);
			
			System.out.println("Value of String after conversion is: " +strNumber);
		}
		
}
