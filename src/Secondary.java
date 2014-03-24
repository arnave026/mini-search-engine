import java.io.*;
import java.util.ArrayList;
public class Secondary 
{
	
	public static void first_index() throws IOException
	{
		
		System.out.println("in secondary");

		try
		{
			
			File myFile = new File("outkway.txt");
			FileReader fr = new FileReader(myFile);
			BufferedReader br = new BufferedReader(fr);

			File sec = new File("ternary.txt");
			FileWriter fw = new FileWriter(sec);
			BufferedWriter bw = new BufferedWriter(fw);
			//System.out.println("file created");
			String tmp;
			long location=0;
			
			ArrayList<String> arr = new ArrayList<String>();
			tmp=br.readLine();
			String[] c=tmp.split("-");
			arr.add(c[0] + "-" +location + "\n");
			location+=(tmp.getBytes().length+1);	
			
			
			int count=0;
			while((tmp=br.readLine())!=null)
			{
				//System.out.println("inside");
				if(count==20)
				{
					count=0;
					//System.out.println("inside&&&&&&");
					String[] c1=tmp.split("-");
					arr.add(c1[0] + "-" +location + "\n");
					location+=(tmp.getBytes().length+1);
				}
				else
					location+=(tmp.getBytes().length+1);
				
				if(arr.size()==200)
				{
					//System.out.println("inside write");
					int k=0;
					while(k<arr.size())
						bw.write(arr.get(k++));
					
					arr.clear();
				}
			
				count++;
					
				
			}
			arr.add("zzzzzzzzzzzzzzzzzzzzzzzzz-" + location);

			System.out.println("final add");
			int k=0;
			while(k<arr.size())
				bw.write(arr.get(k++));
			arr.clear();

			bw.flush();
			bw.close();

			
			br.close();
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		/*		long pointer=0,pointer1=0;
		long line_count=1;

		Long l=System.currentTimeMillis();

		
		File fileDir = new File("outkway.txt"); 
		BufferedReader br = new BufferedReader( new InputStreamReader( new FileInputStream(fileDir), "UTF8"));
		
		
	//	BufferedReader br = new BufferedReader(new FileReader());
		File ter_file=new File("ternary.txt");
		Writer ter_out = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(ter_file), "UTF8"));


		try
		{
			

			boolean flag=false,break_bool=false;
			char next_chr='a';
			char a_ist='a';
			int next_int=0;
			String pre_line = null; 
			String line;
			line = br.readLine();
			pointer=pointer+line.length()+1;
			

				line_count=0;
				break_bool=true;
				flag=false;
				
				pointer1=pointer-line.length()-1;
				
				while (line!= null )		
				{
					pre_line=line;
					line=br.readLine();
					line_count++;
					//line.getBytes().length
					if(line!=null)
						pointer=pointer+line.length()+1;
					if((line_count==20)&&(line!=null))
					{
						String word=line.substring(0,line.indexOf('-'));
						pointer1=pointer-line.length()-1;
						ter_out.write(word+"-"+pointer1);
						ter_out.write("\n");
						line_count=0;
						flag=true;	
					}

				}
				if(!flag && pre_line!=null)
				{
					String word=pre_line.substring(0,pre_line.indexOf('-'));
					pointer1=pointer-pre_line.length()-1;
					ter_out.write(word+"-"+pointer1);
					ter_out.write("\n");

				}

			

			
			ter_out.close();
		
		}
		catch(IOException ex) 
		{
			ex.printStackTrace();
		}
		Long l2=System.currentTimeMillis();
		System.out.println("Time : "+(l2-l)/1000.0);
	*/	
	}
//public static void main(String args[]) throws IOException
//{
//	Secondary s1=new Secondary();
//	s1.first_index();//
//}
}