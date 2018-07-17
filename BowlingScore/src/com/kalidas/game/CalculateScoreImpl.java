package com.kalidas.game;

import java.util.Arrays;

public class CalculateScoreImpl implements CalculateScore{
	
	
	public int playerScore(int[] arr) throws IndexOutOfBoundsException{

		int totalScore = 0;

		int i=0;

		int[] perfectScore = {10,10,10,10,10,10,10,10,10,10,10};
		
		if(Arrays.equals(perfectScore,arr)){
			totalScore =300;
			return totalScore;
		}


		while(i<arr.length){
			
			if(arr[i] > 10){
				
				System.err.println("Invalid number of pins:"+arr[i]+" at index: "+i);
			}
			
			if(arr[i] == 10){
				totalScore = totalScore+10;
				if(i < arr.length-3){
					totalScore += arr[i+1] + arr[i+2];
				}
				i++;
			}

			else if((arr[i] + arr[i+1])== 10){
				totalScore += arr[i]+ arr[i+1];
				if(i < arr.length-3){
					totalScore += arr[i+2];
				}
				i += 2;
			}
			
			else{
				if(arr[i]+arr[i+1] > 10){
					System.err.println("Invalid number of pins at indices:"+ i+", "+ i+1);
				} else {
					totalScore += arr[i]+arr[i+1];
					i += 2; 
				}
			}
		}

		return totalScore;

	}

	public void playerScore(Object[] arr) {
		// TODO Auto-generated method stub

	}


}
