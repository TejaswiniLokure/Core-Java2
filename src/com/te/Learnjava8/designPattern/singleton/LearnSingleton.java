package com.te.Learnjava8.designPattern.singleton;

public class LearnSingleton {
	public static void main(String[] args) {
		          Virat virat = Virat.getVirat();
		          virat.getVirat();
		          System.out.println(virat);
	               Virat virat1 = Virat.getVirat();
	               virat1.getVirat();

		          System.out.println(virat1);
//		          System.out.println(virat==virat1);
//		          System.out.println(virat.equals(virat1));
	}

}
