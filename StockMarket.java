package com.example.helloworld;

public class StockMarket {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double[] values = new double[] { 55.39, 109.23, 48.29, 81.59, 81.58, 105.53, 94.45, 12.24 };

	    double max = 0, maxDiff = 0, diff = 0;
	    double bottom = values[0];

	    for (int i = 1; i < values.length; i++)
	    {
	        diff += values[i] - values[i - 1];

	        if (diff > maxDiff)
	        {
	            maxDiff = diff;
	            max = values[i];
	        }

	        if (values[i] < bottom)
	        {
	            bottom = values[i];
	            diff = 0;
	        }
	    }

	    System.out.println("Buy at " +  (max - maxDiff) + " Sell at " +  max);
	}

}
