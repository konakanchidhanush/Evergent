package com.evergent.CoreJAVA.Dhanush.Application4;

import java.util.*;
	abstract class AbstractModule implements Module {
	    protected static int totalCost = 0;
	    protected static int productCost = 0;
	   protected static final Scanner scanner = new Scanner(System.in);
	    protected void addCost(int cost) {
	        totalCost += cost;
	    }
	}


