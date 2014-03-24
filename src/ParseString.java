import java.awt.List;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;
import java.util.Vector;

//aan:118385-b1|116-b2|27-t1b20|8-b6|8-b1|3-b2|3-b1|4-t1b27|59-b2|10-t1b23|21-b1|21-b1|8-b8l1|53-b1|$120117-b2|1-b1|7-b2|3-b1|44-b2|3-b5|7-b1|3-b1|17-b1|1-b3|81-b7|$121088-b1|4-t1b40|13-b2|2-b3|3-t1b26|24-b1|1-b16|3-t1b26|15-b3|1-b2|3-b3|4-t1b23|3-b5|4-b1|4-b1|6-b1|3-b2|14-b1|1-b1|












class time_comp implements Comparator<Detail>
{

    @Override
    public int compare(Detail o1, Detail o2)
    {
        if(o1.getWt() < o2.getWt())
        {
            return 1;
        }
        else if(o1.getWt() >= o2.getWt())
        {
            return -1;
        }
        else
            return 0;
    }


}








public class ParseString {
	static HashMap<Long, Integer> h= new HashMap<Long, Integer>();
	static Map<String,Integer> alag=new HashMap<String,Integer>();
	
	@SuppressWarnings("unchecked")
	public  HashMap<Long, Integer> ParseIdx(String line) {
		int col=line.indexOf('-');
		int strt=line.indexOf(':');
		
		TreeSet<Detail> Id_wt = new TreeSet<Detail>(new time_comp());
		//int doc_id=Integer.parseInt(line.substring(col+1, strt));
		//int end_pip=line.indexOf('|');
		String doc_line=line.substring(col+1);
		//System.out.println(doc_line);
		//String []arr=doc_line.split("[|]");
	String []arr=doc_line.split(",");
		
		//System.out.println("lrvv"+arr.length);
		//System.out.println(doc_line);
	    //char[] chars = doc_line.toCharArray();
		
		Map<String,Integer> alag1=new HashMap<String,Integer>();
		alag1.put("1",8);
		alag1.put("2",6);
		alag1.put("3",2);
		alag1.put("4",4);
		alag1.put("5",1);
		alag1.put("6",8);
		alag1.put("7",6);
		alag1.put("8",2);
		alag1.put("9",4);
		alag1.put("0",1);
		long pre=0;
		long dct_id=0;
		for(int j=0;j<arr.length;j++)
		{
			//System.out.println(arr[j]);
	    String count="";
	    int weight=0;
	    String data="";
	    String doc_id="";
	    if(arr[j].charAt(0)=='&')
	    {
	    //	System.out.println("bn"+arr[j].indexOf('-'));
	    	 doc_id=arr[j].substring(1, arr[j].indexOf(':'));	
	    	 pre=0;
	    }
	    else
	    {
	    	//System.out.println("bn"+arr[j].indexOf('-'));
	  doc_id=arr[j].substring(0, arr[j].indexOf(':'));
	    }
	      dct_id=Integer.parseInt(doc_id);
	    dct_id+=pre;
	    pre=dct_id;
	    data=arr[j].substring(arr[j].indexOf(':')+1);
	 //   System.out.print(pre+" "+data+" ");
	    char temp=data.charAt(0);
	    //data=data+" ";
	   for(int i=1;i<data.length();i++)
		{
		    char c=data.charAt(i);
	    	if (alag1.containsKey(c+""))
	    	{
	             count=count+c;
	        }
	    	else
	    	{
	    		if(temp!=c)
    			{
		    		//System.out.println("****"+temp);

    			weight=weight+(alag.get(temp+"")*Integer.parseInt(count.trim()));
    			temp=c;
    			count="";
    			//System.out.print(weight+"+");

    			}
	    	
	    	}
	    	
	    	
		}
	//	System.out.print(weight+"+");

	   weight=weight+(alag.get(temp+"")*Integer.parseInt(count.trim()));
//		System.out.println(" = "+weight);
	  
	  
	 //System.out.println("----"+weight+" ****"+dct_id);
	  // Detail e=new Detail();
	  // e.id=dct_id;
	  // e.wt=weight;
	  // Id_wt.add(e);
	   weight=(int) ((int)weight*Math.log(1000000/arr.length));
	   if(h.containsKey(dct_id))
	   {   
		   int x=h.get(dct_id);
	   h.put(dct_id, weight*x);
	   }
	   else
		   h.put(dct_id,weight);
	    }
		
		return h;
	}
	/*public static void main(String []args){
		ParseString p=new ParseString();
		String words="aaa aaaa pron";
		String s[]=words.split(" ");
		p.final_idSet(s);
	
	}
	
	
	public void final_idSet(String s[])
	{
		long startTime = System.currentTimeMillis();
		ParseString p=new ParseString();
		TreeSet<Detail> Id_wt_final1 = new TreeSet<Detail>(new time_comp());
		String test1="aac:116848-b1|$119930-b1|$123391-b15|746-b1|931-b1|11-b1|163-b1|$125412-b1|195-b1|7-b1";
		String test2="aanenson:120921-b1|$121590-b4|$123391-b1|746-b1|931-b1|11-b1|163-b1";
		String test3="aan:118385-b1|116-b2|27-t1b20|8-b6|8-b1|3-b2|3-b1|4-t1b27|59-b2|10-t1b23|21-b1|21-b1|8-b8l1|53-b1|$123391-b1|746-b1|931-b1|11-b1|163-b1|$120117-b2|1-b1|7-b2|3-b1|44-b2";
		//TreeSet<Detail> Id_wt_final=p.ParseIdx(test1);
		p.ParseIdx(test1);
		String x="";
		for(int i=2;i<=3;i++)
		{
			if(i==2)
				 x=test2;
			else
				x=test3;
		//TreeSet<Detail> Id_wt1=	p.ParseIdx(x);
			p.ParseIdx(x);
			
		}
		ArrayList<Map.Entry> a = new ArrayList<Map.Entry>(h.entrySet());
		Collections.sort(a,
		         new Comparator() {
		             public int compare(Object o1, Object o2) {
		                 Map.Entry e1 = (Map.Entry) o1;
		                 Map.Entry e2 = (Map.Entry) o2;
		                 return ((Comparable) e2.getValue()).compareTo(e1.getValue());
		             }
		         });
		Vector vp=new Vector();
		for (Map.Entry e : a) {
			vp.add(e.getKey());
	        System.out.println(e.getKey() + " " + e.getValue());
		}
		/*for(int i=vp.size()-1;i>vp.size()-11;i--)
		{
			System.out.println(vp.elementAt(i));
		}
	        long endTime  = System.currentTimeMillis();
			   NumberFormat formatter = new DecimalFormat("#0.00000");
			   System.out.print("Execution time is " + formatter.format((endTime - startTime) / 1000d) + " seconds\n");
			//h.keySet().retainAll(h1.keySet());
		//Id_wt_final.retainAll(Id_wt1);
		
		/*Iterator<Detail> itr=Id_wt1.iterator();
        while(itr.hasNext())
        {
            Detail o=itr.next();
            System.out.println(o.id+" "+o.wt);

        }
        //Id_wt_final.toArray(a);
       // Id_wt_final.retainAll(Id_wt1);
		
	}*/
	
}

class Detail
{
	int id;
	int wt;


public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getWt() {
		return wt;
	}

	public void setWt(int wt) {
		this.wt = wt;
	}

}

/*HashMap<String, Integer> h = new HashMap<String, Integer>();
h.put("z",30);
h.put("e",10);
h.put("b",20);
h.put("c",20);
List<Map.Entry> a = new ArrayList<Map.Entry>(h.entrySet());
Collections.sort(a,
         new Comparator() {
             public int compare(Object o1, Object o2) {
                 Map.Entry e1 = (Map.Entry) o1;
                 Map.Entry e2 = (Map.Entry) o2;
                 return ((Comparable) e1.getValue()).compareTo(e2.getValue());
             }
         });

for (Map.Entry e : a) {
        System.out.println(e.getKey() + " " + e.getValue());
}*/