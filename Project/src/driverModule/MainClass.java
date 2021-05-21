package driverModule;

import itemSetTable.ResultSetTable;
import tableLen1.TableC1;
import tableLen1.ViewL1;
import tableLen2.TableH2;
import tableLen2.ViewL2;
import tableLen3.TableH3;
import tableLen3.ViewL3;
import transactionTable.TransactionClass;

import java.io.*;
import java.sql.*;


	public class MainClass {
			 
	 public static void main(String[] args) throws SQLException, NumberFormatException, IOException {
		/*
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 
		 String trans = "";int a1;
		 do{
			 System.out.println(" Items : \n 1.Lux \n 2.Margo \n 3.Fiama DeWills \n 4.Nevea \n 5.Jhonsons Baby\n 6. Mysore \n 7. detol \n 8. Patanjali\n 9. DOve\n10. Pears");
			 int item=Integer.parseInt(br.readLine());
			 System.out.println(" The item you choose : ");
			 System.out.println(" Your action : \n 1.Select \n 2.Buy Now ");
		 a1=Integer.parseInt(br.readLine());
		switch(a1)
		 {
		 case 1:
			  if(ViewL1.isL1(item)==true){
				  ResultSetTable res=new ResultSetTable();
				  res.insert(item);
			   System.out.println("Enter choice : ");
			   String s=br.readLine();
			   trans+=s+",";
			   System.out.println("Items to buy : "+trans);
			   break;
			  }
		 case 2:trans+=item+",";
		 		System.out.println("Item to buy : "+trans);
		 		break;
		 
		 }
		 System.out.println("Continue to check out..(y/n)");
		 }while((char)br.readLine().charAt(0)=='n');
		 
		 trans=trans.substring(0,trans.lastIndexOf(','));
		//*/String trans=args[0];
											
		TransactionClass obT=new TransactionClass();
		int x=obT.transaction(trans);
		System.out.println(x);
		  
		
		TableC1 ob1=new TableC1();
		x=ob1.insert(trans);
		System.out.println(x);
		
		ViewL1 ob2=new ViewL1();
		int y=ViewL1.avg();
		x=ob2.insert(y);
		
		System.out.println(x+" "+y);
		
		TableH2 ob3=new TableH2();
		x=ob3.insert(trans);
		System.out.println(x);
		
		ViewL2 obl2=new ViewL2(); 
		 y=ViewL2.avg();
		x=obl2.insert(y);
		System.out.println(x+" "+y);
		
		TableH3 ob4=new TableH3();
		x=ob4.insert(trans);
		System.out.println(x);
		
		ViewL3 obl3=new ViewL3();
		 y=ViewL3.avg();
		x=obl3.insert(y);
		System.out.println(x+" "+y);
		
		System.out.println(" Thank you....visit again");
		}

}
