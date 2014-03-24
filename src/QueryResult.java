import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;


public class QueryResult {

	/**
	 * @param args
	 */
	public static String indexFilepath;
	static HashMap<Long, Integer> h= new HashMap<Long, Integer>();
	static Map<String,Long> second_map=new HashMap<String,Long >();
	static  HashMap<String, Long> hm = new HashMap();
	static Vector<String> word=new Vector<String>();
	static Map<Integer,String> t_map=new HashMap<Integer,String>();
	 static Vector<Integer> word_t=new Vector<Integer>();
	public void part2() throws IOException {
		// TODO Auto-generated method stub
	//	indexFilepath=args[0];
long one=1;
		System.out.println("queryResult");
		hm.put("a",one);
		hm.put("about",one);
		hm.put("above",one);
		hm.put("above",one);
		hm.put("across",one);
		hm.put("after",one);
		hm.put("afterwards",one);
		hm.put("again",one);
		hm.put("against",one);
		hm.put("all",one);
		hm.put("almost",one);
		hm.put("alone",one);
		hm.put("along",one);
		hm.put("already",one);
		hm.put("also",one);
		hm.put("although",one);
		hm.put("always",one);
		hm.put("am",one);
		hm.put("among",one);
		hm.put("amongst",one);
		hm.put("amoungst",one);
		hm.put("amount",one);
		hm.put("an",one);
		hm.put("and",one);
		hm.put("another",one);
		hm.put("any",one);
		hm.put("anyhow",one);
		hm.put("anyone",one);
		hm.put("anything",one);
		hm.put("anyway",one);
		hm.put("anywhere",one);
		hm.put("are",one);
		hm.put("around",one);
		hm.put("as",one);
		hm.put("at",one);
		hm.put("back",one);
		hm.put("be",one);
		hm.put("became",one);
		hm.put("because",one);
		hm.put("become",one);
		hm.put("becomes",one);
		hm.put("becoming",one);
		hm.put("been",one);
		hm.put("before",one);
		hm.put("beforehand",one);
		hm.put("behind",one);
		hm.put("being",one);
		hm.put("below",one);
		hm.put("beside",one);
		hm.put("besides",one);
		hm.put("between",one);
		hm.put("beyond",one);
		hm.put("bill",one);
		hm.put("both",one);
		hm.put("bottom",one);
		hm.put("but",one);
		hm.put("by",one);
		hm.put("call",one);
		hm.put("can",one);
		hm.put("cannot",one);
		hm.put("cant",one);
		hm.put("co",one);
		hm.put("con",one);
		hm.put("could",one);
		hm.put("couldnt",one);
		hm.put("cry",one);
		hm.put("de",one);
		hm.put("describe",one);
		hm.put("detail",one);
		hm.put("do",one);
		hm.put("done",one);
		hm.put("down",one);
		hm.put("due",one);
		hm.put("during",one);
		hm.put("each",one);
		hm.put("eg",one);
		hm.put("eight",one);
		hm.put("either",one);
		hm.put("eleven",one);
		hm.put("else",one);
		hm.put("elsewhere",one);
		hm.put("empty",one);
		hm.put("enough",one);
		hm.put("etc",one);
		hm.put("even",one);
		hm.put("ever",one);
		hm.put("every",one);
		hm.put("everyone",one);
		hm.put("everything",one);
		hm.put("everywhere",one);
		hm.put("except",one);
		hm.put("few",one);
		hm.put("fifteen",one);
		hm.put("fify",one);
		hm.put("fill",one);
		hm.put("find",one);
		hm.put("fire",one);
		hm.put("first",one);
		hm.put("five",one);
		hm.put("for",one);
		hm.put("former",one);
		hm.put("formerly",one);
		hm.put("forty",one);
		hm.put("found",one);
		hm.put("four",one);
		hm.put("from",one);
		hm.put("front",one);
		hm.put("full",one);
		hm.put("further",one);
		hm.put("get",one);
		hm.put("give",one);
		hm.put("go",one);
		hm.put("had",one);
		hm.put("has",one);
		hm.put("hasnt",one);
		hm.put("have",one);
		hm.put("he",one);
		hm.put("hence",one);
		hm.put("her",one);
		hm.put("here",one);
		hm.put("hereafter",one);
		hm.put("hereby",one);
		hm.put("herein",one);
		hm.put("hereupon",one);
		hm.put("hers",one);
		hm.put("herself",one);
		hm.put("him",one);
		hm.put("himself",one);
		hm.put("his",one);
		hm.put("how",one);
		hm.put("however",one);
		hm.put("hundred",one);
		hm.put("ie",one);
		hm.put("if",one);
		hm.put("in",one);
		hm.put("inc",one);
		hm.put("indeed",one);
		hm.put("interest",one);
		hm.put("into",one);
		hm.put("is",one);
		hm.put("it",one);
		hm.put("its",one);
		hm.put("itself",one);
		hm.put("keep",one);
		hm.put("last",one);
		hm.put("latter",one);
		hm.put("latterly",one);
		hm.put("least",one);
		hm.put("less",one);
		hm.put("ltd",one);
		hm.put("made",one);
		hm.put("many",one);
		hm.put("may",one);
		hm.put("me",one);
		hm.put("meanwhile",one);
		hm.put("might",one);
		hm.put("mill",one);
		hm.put("mine",one);
		hm.put("more",one);
		hm.put("moreover",one);
		hm.put("most",one);
		hm.put("mostly",one);
		hm.put("move",one);
		hm.put("much",one);
		hm.put("must",one);
		hm.put("my",one);
		hm.put("myself",one);
		hm.put("name",one);
		hm.put("namely",one);
		hm.put("neither",one);
		hm.put("never",one);
		hm.put("nevertheless",one);
		hm.put("next",one);
		hm.put("nine",one);
		hm.put("no",one);
		hm.put("nobody",one);
		hm.put("none",one);
		hm.put("noone",one);
		hm.put("nor",one);
		hm.put("not",one);
		hm.put("nothing",one);
		hm.put("now",one);
		hm.put("nowhere",one);
		hm.put("of",one);
		hm.put("off",one);
		hm.put("often",one);
		hm.put("on",one);
		hm.put("once",one);
		hm.put("one",one);
		hm.put("only",one);
		hm.put("onto",one);
		hm.put("or",one);
		hm.put("other",one);
		hm.put("others",one);
		hm.put("otherwise",one);
		hm.put("our",one);
		hm.put("ours",one);
		hm.put("ourselves",one);
		hm.put("out",one);
		hm.put("over",one);
		hm.put("own",one);
		hm.put("part",one);
		hm.put("per",one);
		hm.put("perhaps",one);
		hm.put("please",one);
		hm.put("put",one);
		hm.put("rather",one);
		hm.put("re",one);
		hm.put("same",one);
		hm.put("see",one);
		hm.put("seem",one);
		hm.put("seemed",one);
		hm.put("seeming",one);
		hm.put("seems",one);
		hm.put("serious",one);
		hm.put("several",one);
		hm.put("she",one);
		hm.put("should",one);
		hm.put("show",one);
		hm.put("side",one);
		hm.put("since",one);
		hm.put("sincere",one);
		hm.put("six",one);
		hm.put("sixty",one);
		hm.put("so",one);
		hm.put("some",one);
		hm.put("somehow",one);
		hm.put("someone",one);
		hm.put("something",one);
		hm.put("sometime",one);
		hm.put("sometimes",one);
		hm.put("somewhere",one);
		hm.put("still",one);
		hm.put("such",one);
		hm.put("system",one);
		hm.put("take",one);
		hm.put("ten",one);
		hm.put("than",one);
		hm.put("that",one);
		hm.put("the",one);
		hm.put("their",one);
		hm.put("them",one);
		hm.put("themselves",one);
		hm.put("then",one);
		hm.put("thence",one);
		hm.put("there",one);
		hm.put("thereafter",one);
		hm.put("thereby",one);
		hm.put("therefore",one);
		hm.put("therein",one);
		hm.put("thereupon",one);
		hm.put("these",one);
		hm.put("they",one);
		hm.put("thickv",one);
		hm.put("thin",one);
		hm.put("third",one);
		hm.put("this",one);
		hm.put("those",one);
		hm.put("though",one);
		hm.put("three",one);
		hm.put("through",one);
		hm.put("throughout",one);
		hm.put("thru",one);
		hm.put("thus",one);
		hm.put("to",one);
		hm.put("together",one);
		hm.put("too",one);
		hm.put("top",one);
		hm.put("toward",one);
		hm.put("towards",one);
		hm.put("twelve",one);
		hm.put("twenty",one);
		hm.put("two",one);
		hm.put("un",one);
		hm.put("under",one);
		hm.put("until",one);
		hm.put("up",one);
		hm.put("upon",one);
		hm.put("us",one);
		hm.put("very",one);
		hm.put("via",one);
		hm.put("was",one);
		hm.put("we",one);
		hm.put("well",one);
		hm.put("were",one);
		hm.put("what",one);
		hm.put("whatever",one);
		hm.put("when",one);
		hm.put("whence",one);
		hm.put("whenever",one);
		hm.put("where",one);
		hm.put("whereafter",one);
		hm.put("whereas",one);
		hm.put("whereby",one);
		hm.put("wherein",one);
		hm.put("whereupon",one);
		hm.put("wherever",one);
		hm.put("whether",one);
		hm.put("which",one);
		hm.put("while",one);
		hm.put("whither",one);
		hm.put("who",one);
		hm.put("whoever",one);
		hm.put("whole",one);
		hm.put("whom",one);
		hm.put("whose",one);
		hm.put("why",one);
		hm.put("will",one);
		hm.put("with",one);
		hm.put("within",one);
		hm.put("without",one);
		hm.put("would",one);
		hm.put("yet",one);
		hm.put("you",one);
		hm.put("your",one);
		hm.put("yours",one);
		hm.put("yourself",one);
		hm.put("yourselves",one);
		hm.put("the",one);
		
		
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br_in=new BufferedReader(isr);
		/*Store st=new Store();
		String word;
		Scanner cin=new Scanner(System.in);
			String y=cin.nextLine();
			for(int j=0;j<Integer.parseInt(y);j++)
			{
				word = cin.nextLine();
				//System.out.println("inside query"+word);
				st.query_fetch(word);
			}
}*/
		Bsearch bch=new Bsearch();
		FileReader fis11 = null;
	//	BufferedReader br11;
		//fis11 = new FileReader("ternary.txt");
		
		File fileDir = new File("ternary.txt"); 
		BufferedReader br11 = new BufferedReader( new InputStreamReader( new FileInputStream(fileDir), "UTF8"));
		
		// br11 = new BufferedReader(fis11);
		 String line=br11.readLine();
		 RandomAccessFile raf2 = new RandomAccessFile("outkway.txt","r");
		
		 while(line!=null)
		{
			// System.out.println(line);
		String wrd=line.substring(0,line.indexOf('-'));
		//System.out.println(line.substring(line.indexOf(':')+1));
	long id=Long.parseLong(line.substring(line.indexOf('-')+1));
		//System.out.println(word.size());
		word.add(wrd);
		second_map.put(wrd,id);
		line=br11.readLine();
			
		}
		
		//-----------------------------------------------------------------for secondary title----------------------------
	//	System.out.println("gggggggggggggg");
		fis11 = new FileReader("pri_title.txt");
		 br11 = new BufferedReader(fis11);
		 String line1=br11.readLine();
	//	 System.out.println("***"+line1);
		RandomAccessFile raf3 = new RandomAccessFile("t1.txt","r");
		
		while(line1!=null)
		{
		String offset =line1.substring(line1.indexOf('-')+1);
		//System.out.println(line1.substring(0,line1.indexOf(':')));
	String id =line1.substring(0,line1.indexOf('-')).trim();
	//	System.out.println(id+" ***"+offset);
		//word.add(wrd);
		
		t_map.put(Integer.parseInt(id),offset);
		word_t.add(Integer.parseInt(id));
		line1=br11.readLine();
			
		}
		 
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("enter test case");
		ParseString.alag.put("t",8);
		ParseString.alag.put("i",6);
		ParseString.alag.put("e",2);
		ParseString.alag.put("c",4);
		ParseString.alag.put("b",1);
		Scanner cin=new Scanner(System.in);
		int testcases=Integer.parseInt(br_in.readLine());
		Stemmer stm=new Stemmer();
		System.out.println("-------------------------------------------");
		char ty[]=new char[5];
		ty[0]='t';
		ty[1]='c';
		ty[2]='e';
		ty[3]='b';
		ty[4]='i';
		for(int y=0;y<testcases;y++)
		{
			System.out.println("enter word");
			String qry=br_in.readLine();
			String ary[]=qry.split(" ");
			for(int q=0;q<ary.length;q++)
			{
				String str=ary[q].toLowerCase();
				int j=str.indexOf(":");
				char c=str.charAt(0);
				String sp;
				if(j>0)
				{
					for(int i=0;i<5;i++)
					{
						if(c!=ty[i])
						{
							ParseString.alag.put(ty[i]+"",0);
						}
					}
					sp=str.substring(0,1);
					str=str.substring(2);
				}
				
				String line_iD="";
				if(!hm.containsKey(str))
				{
					//stmr.add(s1.toCharArray(),len);
					if(str.length()>2)
					{
					stm.add(str.toCharArray(),str.length());
					stm.stem();
					String word_qury=stm.toString();
					
					System.out.println("wrd after stem--"+word_qury);
					long offset=second_map.get(word.elementAt(bch.bsearch(word,word_qury)));
					
					raf2.seek(offset);
					 BufferedReader inp = new BufferedReader (new InputStreamReader(new FileInputStream(raf2.getFD())));
					System.out.println("offset :"+offset);
					int loop=20;
					while(loop>0)
					{	
						//System.out.println("");
						String read_line=inp.readLine();
					//	System.out.println(""+read_line);
						String word=read_line.substring(0,read_line.indexOf("-"));
					//	System.out.println(""+word);
						if(word.equals(word_qury))
						{
						//	System.out.println(""+read_line);
							line_iD=read_line;
							//System.out.println(line_iD);
							ParseString pg=new ParseString();
							h=pg.ParseIdx(read_line);
						loop=0;	
						}
						loop--;
					}
					
					
					
					
				}
				}
			
				ParseString.alag.put("t",8);
				ParseString.alag.put("i",6);
				ParseString.alag.put("e",2);
				ParseString.alag.put("c",4);
				ParseString.alag.put("b",1);
				
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
	        int count=0;
	        for (Map.Entry e : a) {
	        	count++;
	            vp.add(e.getKey());
	            if(count==10) break;
	           // System.out.println(e.getKey() + " " + e.getValue());
	        }
	      // System.out.println("size"+vp.size());
	      
	        int limit=vp.size();
	        if(vp.size()>11)
	        	limit=11;
	        
	     //   for(int i=0;i<limit;i++)
	      //  {
	       // 	System.out.println(vp.elementAt(i));
	        	
	      //  }
	        System.out.println("----------------------------------------");
	        for(int i=0;i<limit;i++)
	        {
	        	//System.out.println(vp.elementAt(i));
	        	 long vctr_id=(long) vp.elementAt(i);
		          //System.out.println(t_map.size());
		         // System.out.println(vctr_id);
		          //System.out.println(word_t.elementAt(bch.bsearch(word_t,(int)vctr_id)));
		         // System.out.println(t_map.containsKey("57567"));
	        //	 System.out.println(vctr_id);
	        	 
	        	 
	        	 int lk=bch.bsearch(word_t,(int)vctr_id);
	        //	 if(vctr_id==113296)
	        //	 System.out.println("searching :--------- "+lk);
	        	// int ghj=word_t.elementAt(lk);
	        	// String vv=lk.toString();
	        //	 System.out.println("size :-->"+t_map.containsKey(lk));
		    long id_to_seek=Integer.parseInt(t_map.get(lk).toString());
		        // long id_to_seek=	Integer.parseInt(title_map.get(57567+""));
			        
		          raf3.seek(id_to_seek);
		        BufferedReader inp2 = new BufferedReader (new InputStreamReader(new FileInputStream(raf3.getFD())));
		        int loop_title=0;
		        while(loop_title<20)
		        {
		        	String title_line=inp2.readLine();
		        //	if(vctr_id==113296)
		        //	System.out.println("-----------"+title_line);
		        		
		        	
		       // 	System.out.println(title_line);
		        	int ti_id=Integer.parseInt(title_line.substring(0,title_line.indexOf(':')));
		        	if(ti_id==vctr_id)
		        	{
		        		loop_title=20;
		        		System.out.println(title_line);
		        	}
		        	loop_title++;
		        }
	        }
		h.clear();
		}
		
		
		
	}
}