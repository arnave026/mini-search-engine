import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

public class datastruct 
{
public void fun(String wd,Map<String,Map<Integer,Vector<Integer>>> struc,int cat_id,int doc_id)
{
	
	Map<Integer,Vector<Integer>> symb = new HashMap <Integer,Vector<Integer>>();
	Map<Integer,Vector<Integer>> tmp = new TreeMap<Integer,Vector<Integer>>(symb);
	if(!struc.containsKey(wd))
	{
	Vector<Integer> catg=new Vector<Integer>(6);
	for(int i=0;i<6;i++)
	catg.add(0);
	catg.set(cat_id,1);
	tmp.put(doc_id,catg);
    struc.put(wd,tmp);
	}
	else
	{
			tmp=struc.get(wd);
			if(tmp.containsKey(doc_id))
			{
				Vector<Integer> tempvec=new Vector<Integer>(6);
				tempvec=tmp.get(doc_id);
				tempvec.set(cat_id,tempvec.elementAt(cat_id)+1);
			}
			else
			{
				Vector<Integer> catg=new Vector<Integer>(6);
				for(int i=0;i<6;i++)
					catg.add(0);
				catg.set(cat_id,1);
				tmp.put(doc_id,catg);
		  
			}
		
	}
	}
}
