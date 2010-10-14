package libpomdp.solve.java.vi;

import java.util.ArrayList;

import libpomdp.common.java.Pomdp;
import libpomdp.solve.java.IterationStats;

public class ValueIterationStats extends IterationStats {
	
	public ValueIterationStats(Pomdp pomdp){
		super(pomdp);
		iteration_vector_count=new ArrayList<Integer>();
	}
	
	public int register(long iTime,int nVects) {
		register(iTime);
		iteration_vector_count.add(new Integer(nVects));
		return(iterations);
	}
	
	public String toString(){
		String retval=super.toString();
		retval+=      "last vector count  = ";
		Integer i=iteration_vector_count.get(iteration_vector_count.size()-1);
		retval+=i + "\n";
		return retval;
	}
	
	public ArrayList<Integer> iteration_vector_count;
}
