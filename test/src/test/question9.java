package test;

import java.util.*;

public class question9 {
	//sends setup request for VCI addresses 
	public static void main(String[] args) {
		int[] router = {1, 2, 3};
		int[] inVCI = new int[3];//Incoming VCI's
		int[] outVCI = new int[3];//outgoing VCI's
		int[] portIn = {1, 1, 2};//incoming port #
		int[] portOut = {3, 2, 3};//outgoing port #
		int vci = 0;
		
		Random gen = new Random();
		
		System.out.println("Sending setup request... ");
		//prints to console
		for (int i = 0; i < inVCI.length; i++) {
			vci = 1 + gen.nextInt(98);
			inVCI[i] = vci;
			}//creates random VCI addresses for incoming packet at each switch
		
		int destination =  1 + gen.nextInt(98);//creates VCI address for destination node 
		outVCI[outVCI.length-1]= destination;
		for (int j=1; j< inVCI.length; j++) {
			outVCI[j-1] = inVCI[j];
			}//sets the outgoing VCI for packet going back to starting node
		
		System.out.println("Setup Acknowledged!"+"\n"+" the table is below"+"\n");
		
		for ( int k =0; k < inVCI.length; k++) {
			System.out.println("At switch "+ router[k]+ " Incoming Port "+portIn[k]+" Incoming VCI "+inVCI[k]+" Outgoing Port " +portOut[k]+ " Outgoing VCI " + outVCI[k]);
			}//prints the table of VCI and ports
		}
	}