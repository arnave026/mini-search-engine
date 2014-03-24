
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;
public class chkin {
//	public static String indexFilepath1;
//	public static String indexFilepath2;
	public static void main(String[] args)throws IOException 
	{
	//	indexFilepath1=args[0];
		//indexFilepath2=args[1];
		int sec_count=0;
	 Long l=System.currentTimeMillis();
	//		Map<String,Map<Integer,Vector<Integer>>> treemap = new HashMap<String, Map<Integer,Vector<Integer>>>();
	//		pars p=new pars();
	//		p.parsi();
			
	//		Secondary sc=new Secondary();
	//	sc.first_index();
			
	//	 titl_secc tl=new titl_secc();
	//	 tl.first_index();
		 
			QueryResult q=new QueryResult();
			q.part2();
				Long l2=System.currentTimeMillis();
				System.out.println("Time : "+(l2-l)/1000.0);
			   }
}
