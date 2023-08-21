package com.bean;

import java.util.ArrayList;
import java.util.List;

public class TakeWhile{
		     public static void main(String[] args) {
		    	 
		    	 List<Integer> list=new ArrayList<>();
		    	 list.add(1);
		    	 list.add(2);
		    	 list.stream().takeWhile(i->i<=1).forEach(System.out::println);
		     }
		     }
