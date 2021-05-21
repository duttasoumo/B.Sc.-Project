package itemSet;


import java.util.ArrayList;
import java.util.Collections;


public class ItemSet_2 {

	String st;

	public ItemSet_2(String st) {
		this.st = st;
	}
	
	public String[] combi() {
		Integer item[]=sort();
		int n=item.length;
		int sz=n*(n-1)/2;
		String ar[]=new String[sz];
		for(int i=0,c=0;i<n-1;i++)
			for(int j=i+1;j<n;j++,c++){
				ar[c]=item[i]+","+item[j];
			}
		return ar;
	}
	

	Integer [] sort() {
		ArrayList<Integer> ar=new ArrayList<Integer>();
		String s[]=this.st.split(",");
		for(String x:s)
			ar.add(Integer.valueOf(x));
		Collections.sort(ar);
		int i=0;
		while(i<ar.size()-1){
			if(ar.get(i).equals(ar.get(i+1)))
				ar.remove(i);
			else i++;
		}
		return ar.toArray(new Integer[ar.size()]);
	}
	
}
