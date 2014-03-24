import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;


public class writemap {

	public static void writ(final Map<String,Map<Integer,Vector<Integer>>> struc,int count) throws IOException 
	{
		Map<Integer, Vector<Integer>> vectem=new HashMap<Integer, Vector<Integer>>();
		Vector<Integer> vt=new Vector<Integer>();
		FileWriter f = null;
		String output="output_"+count+".txt";
		File file = new File(output);
		if (!file.exists()) 
		{
			try
			{
				file.createNewFile();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}

		 try 
		 {
			f = new FileWriter(file.getAbsoluteFile(),true);
		} 
		 catch (IOException e1) 
		 {
			e1.printStackTrace();
		}
		 
		
	
		
		Writer fk=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file),"UTF8"));
		 BufferedWriter br = new BufferedWriter(fk);
		 
//			InputStreamReader isr=new InputStreamReader(System.in);
//		BufferedReader br=new BufferedReader(isr);
//		String inpu=br.readLine();
	//	 Map<Long,Vector<Integer>> tick=struc.get("indiana");
	//	   System.out.println(tick.size());
		   Set set=struc.entrySet();
		 java.util.Iterator i=set.iterator();
		 while(i.hasNext())
		 {
			 Map.Entry me=(Map.Entry)i.next();			 
			// System.out.print(me.getKey()+"\t\t");
			 br.write(me.getKey()+"-");
			 
			 vectem=struc.get(me.getKey());
			 Set set2=vectem.entrySet();
			 java.util.Iterator i2=set2.iterator();
			 boolean cum=false;
			 int vl=0;
			 while(i2.hasNext())
			 {
				 Map.Entry me2=(Map.Entry)i2.next();
		//		System.out.print(me2.getKey()+":");
				if(cum==true)
				{
					int cg=(int) me2.getKey();
					 br.write(cg-vl+":");
					 vl=cg;
				}
				else
				{
				vl=(int) me2.getKey();
				 br.write(vl+":");
				}
				String stri="";
				 vt=vectem.get(me2.getKey());
				 int a1=vt.elementAt(0);
				 if(a1!=0)
					stri=stri+"t"+a1;
				 int a2=vt.elementAt(1);
				 if(a2!=0)
						stri=stri+"i"+a2;
				 int a3=vt.elementAt(2);
				 if(a3!=0)
						stri=stri+"c"+a3;
				 int a4=vt.elementAt(3);
				 if(a4!=0)
						stri=stri+"e"+a4;
				 int a5=vt.elementAt(4);
				 if(a5!=0)
						stri=stri+"b"+a5;
				 //	 int a6=a1+a2+a3+a4+a5;
				
				 // System.out.print("t"+a1+" i"+a2+" c"+a3+" e"+a4+" b"+a5+" s"+a6+" , ");
				 br.write(stri+",");
				 cum=true;
			 }
		//	System.out.println();
			br.write("\n");			
		 }
		 br.close();
		 fk.close();
		 f.close();
	}

}
