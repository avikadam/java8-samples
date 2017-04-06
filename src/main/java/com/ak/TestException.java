package com.ak;

public class TestException {
	public static void main(String[] args){
		try{
			throw new Exception("S");
		}catch(Exception e){
			System.out.println("Catch"); 
		}finally{
			System.out.println("Finally");
		}
		System.out.println("Out");
	}
}
