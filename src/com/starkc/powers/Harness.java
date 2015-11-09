package com.starkc.powers;

public class Harness {

	public static void main(String[] args) {
		
		System.out.println( isPowerOfTwo( 2 ) );
		System.out.println( isPowerOfTwo( 10 ) );
		System.out.println( isPowerOfTwo( 1024 ) );
		System.out.println( isPowerOfTwo( 8 ) );
		System.out.println( isPowerOfTwo( 42 ) );

	}

	public static boolean isPowerOfTwo( int x ) {
		Double log2val = Math.log( x ) / Math.log( 2 );
		if( log2val == Math.round( log2val ) ) {
			return true;
		} else {
			return false;	
		}
	}
	
}