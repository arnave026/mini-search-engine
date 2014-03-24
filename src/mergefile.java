import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.Vector;


public class mergefile {

	public void milao(Vector<String> file_nam) throws IOException 
	{
		int count=0;
		Writer fk=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("outkway.txt"),"UTF8"));
		BufferedWriter bw = new BufferedWriter(fk);
		
		
		System.out.println(file_nam.size());
	 		BufferedReader in[]=new BufferedReader[file_nam.size()];
	 		String buf[]=new String[file_nam.size()];
			String buf_key[]=new String[file_nam.size()];
			Integer endoffile[]=new Integer[file_nam.size()];
	 		Map<String,String> word = new HashMap<String,String>();
			Map<String,String> wordtree = new TreeMap<String,String>(word);

			
			Map<String,Integer> filmap = new HashMap<String,Integer>();
			Map<String,Integer> filmaptree = new TreeMap<String,Integer>(filmap);

			
			
 	for(int i=0;i<file_nam.size();i++)
	{
 		endoffile[i]=0;
 		in[i] = new BufferedReader(new FileReader(new File(file_nam.get(i)))); 		
	}
 	
 	boolean fir=true;
 	boolean check=false;
 	while (check!=true)
 	{
 		if(fir)
 		{
 			fir=false;
 			Stack<Integer> as=new Stack<Integer>();
 			for(int i=0;i<file_nam.size();i++)
				{
 				if(endoffile[i]!=1)
 				{
 					buf[i]=in[i].readLine();
 					if(buf[i]==null)
 					{
 						count++;
 						in[i].close();
 						endoffile[i]=1;
 					}
 				} 
 				String wor=buf[i].substring(0,buf[i].indexOf("-"));	
					 if(wordtree.containsKey(wor))
					 {	
						 String in_lef=buf[i].substring(buf[i].indexOf("-")+1);					
						 String map_lef=wordtree.get(wor);
						 String ne=map_lef+"&"+in_lef;				 
						 wordtree.put(wor,ne);
						 as.push(i);
					 }
					 else
					 {						 
						 filmaptree.put(wor,i);
						 String in_lef=buf[i].substring(buf[i].indexOf("-")+1);
						 wordtree.put(wor,in_lef);
						 
					 }
				}
 			while(as.isEmpty()!=true)
 			{
 				int i=as.pop();
 				if(endoffile[i]!=1)
 				{
 					buf[i]=in[i].readLine();
 					if(buf[i]==null)
 					{
 						count++;
 						in[i].close();
 						endoffile[i]=1;
 					}
 				}				
 				String wor=buf[i].substring(0,buf[i].indexOf("-"));	
				 if(wordtree.containsKey(wor))
				 {	
					 String in_lef=buf[i].substring(buf[i].indexOf("-")+1);					
					 String map_lef=wordtree.get(wor);
					 String ne=map_lef+"&"+in_lef;				 
					 wordtree.put(wor,ne);
					 as.push(i);
				 }
				 else
				 {						 
					 filmaptree.put(wor,i);
					 String in_lef=buf[i].substring(buf[i].indexOf("-")+1);
					 wordtree.put(wor,in_lef);
				 }
 				
 			}
 			
 		}
 		
	 	  Set set=wordtree.entrySet();
			 java.util.Iterator i=set.iterator();
			 String wr_key="",wr_val = null;
			 while(i.hasNext())
			 {
				 Map.Entry me=(Map.Entry)i.next();			 
				 wr_key=me.getKey().toString();
				  wr_val="-"+wordtree.get(me.getKey());
				 String written=wr_key+wr_val;
				 bw.write(written+"\n");		// write dis to new file
				 break;	 	
			 }
			 wordtree.remove(wr_key);
		/*	 System.out.println(wr_key+"123"+wr_val);
			 System.out.println("chk"+filmaptree.containsKey(wr_key));
			 Set setr=filmaptree.entrySet();
			 java.util.Iterator ij=setr.iterator();
			 while(ij.hasNext())
			 {
				 Map.Entry me=(Map.Entry)ij.next();
				 System.out.println(me.getKey()+" "+me.getValue());
			 }
			 */
			 int loc=filmaptree.get(wr_key);
			 filmaptree.remove(wr_key);
	//		 System.out.println(" --------"+loc);

			 Stack<Integer> as=new Stack<Integer>();
	 		as.push(loc);	
			 while(as.isEmpty()!=true)
	 			{
	 				int it=as.pop();
	 				if(endoffile[it]!=1)
	 				{
	 					buf[it]=in[it].readLine();
	 					if(buf[it]==null)
	 					{
	 						count++;
	 						in[it].close();
	 						endoffile[it]=1;
	 					}
	 				}
	 				if(buf[it]!=null)
	 				{
					 String wor=buf[it].substring(0,buf[it].indexOf("-"));	
					 if(wordtree.containsKey(wor))
					 {	
						 String in_lef=buf[it].substring(buf[it].indexOf("-")+1);					
						 String map_lef=wordtree.get(wor);
						 String ne=map_lef+"&"+in_lef;				 
						 wordtree.put(wor,ne);
						 as.push(it);
					 }
					 else
					 {						 
						 filmaptree.put(wor,it);
						 String in_lef=buf[it].substring(buf[it].indexOf("-")+1);
						 wordtree.put(wor,in_lef);
					 }
	 				}
	 				
	 			}
	 	if(count==file_nam.size())
	 	{
	 		check=true;
	 	}
 	}
 	
 	bw.close();
	fk.close();
 	
 	
			 
/*			String out="out_"+count+".txt";
			boolean flag=true;
			BufferedReader br1	= new BufferedReader(new FileReader(new File(file_nam.elementAt(0)))); 
		//	System.out.println("first file :"+file_nam.elementAt(0));
			while(file_nam.size()!=count)
			{	
				if(flag==false)
				{
			//		System.out.println("first file :"+"out_"+(count-1)+".txt");
					br1	= new BufferedReader(new FileReader(new File("out_"+(count-1)+".txt"))); 
				}
				flag=false;
				BufferedReader br2	= new BufferedReader(new FileReader(new File(file_nam.elementAt(count)))); 
			//	System.out.println("second file :"+file_nam.elementAt(count));
			//	System.out.println("write to :"+out);
				Writer fk=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(out),"UTF8"));
				BufferedWriter bw = new BufferedWriter(fk);
				count++;
				out="out_"+count+".txt";
				String str1=br1.readLine();
				String str2=br2.readLine();
			//	System.out.println(str1);
			//	System.out.println(str2);
				while((str1!=null)&&(str2!=null))
				{
					
					String s1=str1.substring(0,str1.indexOf("-"));
					String s2=str2.substring(0,str2.indexOf("-"));
					
					if(s1.compareTo(s2)<0)
					{
			//			System.out.println("hii 1");
						bw.write(str1+"\n");
						str1=br1.readLine();
						 	
					}
					else if(s1.compareTo(s2)>0)
					{
		//				System.out.println("hii 2");
						bw.write(str2+"\n");						
						str2=br2.readLine();
						 
					}
					else
					{				
		//				System.out.println("hii 3");
						String as=str1+"&"+str2.substring(str2.indexOf("-")+1);
						bw.write(as+"\n");		
						 str1=br1.readLine();
						 str2=br2.readLine();
				
					}
					}
				if(str1==null)
				{
					while(str2!=null)
					{
		//				System.out.println("hii 5");
						bw.write(str2+"\n");
						 str2=br2.readLine();				
					}
				}
				else if(str2==null)
				{
					while(str1!=null)
					{
	//					System.out.println("hii 6");
						bw.write(str1+"\n");
						 str1=br1.readLine();				
					}
				}				
				br1.close();
				br2.close();
				bw.close();
				fk.close();
			}
*/
	
	//while ((sCurrentLine = brq.readLine()) != null) {
		
	}

}
