package com.kalidas.game;


public class GameScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CalculateScore calculateScore = new CalculateScoreImpl();
		//int[] a = {10, 2,4, 3,5, 3,7, 4,4, 3,2, 4,5, 6,2, 3,4, 5,1};
		//int[] a = {2,3, 4,5, 2,5, 6,3, 7,2, 4,5, 6,2, 7,1, 4,3, 10,10,10};
		//int[] a= {10, 8,2, 1,8, 10, 5,5, 7,2, 8,1, 10, 4,3, 10,7,3};
		//int[] a ={10,10,10,10,10,10,10,10,10,10,10};
		//int[] a = {8,2, 8,2, 8,2, 8,2, 5,5, 6,4, 7,3, 8,2, 9,1, 8,2,10};
		//int[] a = {7,2, 4,6, 8,1, 8,2, 5,2, 7,2, 8,1, 10, 2,1, 10,10,10};
		//int[] a = {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3};
		//int[] array ={10,10,10,10,10,10,10,10,7,3,10};
		//int[] array = {4,3,7,3,6,4,8,2,6,3,4,1,6,2,10,10,10,10,10};

		int[] array = new int[args.length];

		for(int i=0; i< args.length; i++){
			array[i] = Integer.parseInt(args[i]);
		}
		try{
			int result = calculateScore.playerScore(array);
			System.out.println(result);
		} catch(IndexOutOfBoundsException e){
			System.out.println(e.getLocalizedMessage());
			e.printStackTrace();
		}        

		
	}

}
