import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.io.Writer;
public class titl_secc 
{
	
	public static void first_index() throws IOException
	{
		
		System.out.println("in secondary of title");
	
		try{
			//please create a title file first :)
			File myFile = new File("t1.txt");
			RandomAccessFile r = new RandomAccessFile(myFile,"r");
			//create a secondary index on the title file
			File myFile1 = new File("pri_title.txt");
			FileWriter fw = new FileWriter(myFile1);
			BufferedWriter bw = new BufferedWriter(fw);
			r.seek(0);
			int count =0;
			long location=0;
			String tmp;
			boolean flag=true;
			while((tmp=r.readLine())!=null)
			{
				String[]  splitDoc=tmp.split(":",2);
				if(count==10)
				{
					if(flag)
					{
						flag=false;
						String put=splitDoc[0]+"-"+Long.toString(location);
						bw.write(put);
					}
					else
					{
						bw.newLine();
						String put=splitDoc[0]+"-"+Long.toString(location);
						bw.write(put);	
						
					}
					count=0;
				}
				else
				{
					location=r.getFilePointer();
				}
				count++;
			}
			bw.flush();
			bw.close();
			r.close();
		}
		catch(Exception e){
			System.out.println("Exception : "+e);
		}
		/*	long pointer=0,pointer1=0;
		long line_count=1;

		Long l=System.currentTimeMillis();

		
		File fileDir = new File("t1.txt"); 
		BufferedReader br = new BufferedReader( new InputStreamReader( new FileInputStream(fileDir), "UTF8"));
		
		
	//	BufferedReader br = new BufferedReader(new FileReader());
		File ter_file=new File("pri_title.txt");
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
					if(line!=null)
						pointer=pointer+line.length()+1;
					if((line_count==20)&&(line!=null))
					{
						String word=line.substring(0,line.indexOf(':'));
						pointer1=pointer-line.length()-1;
						ter_out.write(word+"-"+pointer1);
						ter_out.write("\n");
						line_count=0;
						flag=true;	
					}

				}
				
				if(!flag && pre_line!=null)
				{
					String word=pre_line.substring(0,pre_line.indexOf(':'));
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