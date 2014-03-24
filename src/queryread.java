import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
/*public class queryread {
	public void rt(String pp) {
		StringBuilder sb = new StringBuilder();
		String ad[]=pp.split("[^a-zA-Z]");
		int p=ad.length;
		for(int y=0;y<p;y++)		
		sb.append(ad[y]);
		
		String kj=sb.toString();
		Stemmer stm=new Stemmer();
		String stemmed=stm.query(kj);
		String fin=stemmed+":";
		BufferedReader brq = null;
		try {
			String sCurrentLine;
			brq = new BufferedReader(new FileReader(new File(fina.indexFilepath,"output.txt"))); 
				while ((sCurrentLine = brq.readLine()) != null) {
				int lk=sCurrentLine.indexOf(fin);
				int sd;
					if(lk==0)
					{
						sd=sCurrentLine.indexOf(":");
						System.out.println(sCurrentLine.substring(sd+1));
					}	
				}
			brq.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}*/