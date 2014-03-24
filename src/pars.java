
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
 
public class pars {
	Writer fk;
	BufferedWriter bw;
   public void parsi() throws IOException 
   {
	   fk = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("t1.txt")));
		bw = new BufferedWriter(fk);
		
    try {
    	String ln;
    	final Set<String> seti = new HashSet<String>();     
           seti.add("a");
           seti.add("about");
           seti.add("above");
           seti.add("above");
           seti.add("across");
           seti.add("after");
           seti.add("afterwards");
           seti.add("again");
           seti.add("against");
           seti.add("all");
           seti.add("almost");
           seti.add("alone");
           seti.add("along");
           seti.add("already");
           seti.add("also");
           seti.add("although");
           seti.add("always");
           seti.add("am");
           seti.add("among");
           seti.add("amongst");
           seti.add("amoungst");
           seti.add("amount");
           seti.add("an");
           seti.add("and");
           seti.add("another");
           seti.add("any");
           seti.add("anyhow");
           seti.add("anyone");
           seti.add("anything");
           seti.add("anyway");
           seti.add("anywhere");
           seti.add("are");
           seti.add("around");
           seti.add("as");
           seti.add("at");
           seti.add("back");
           seti.add("be");
           seti.add("became");
           seti.add("because");
           seti.add("become");
           seti.add("becomes");
           seti.add("becoming");
           seti.add("been");
           seti.add("before");
           seti.add("beforehand");
           seti.add("behind");
           seti.add("being");
           seti.add("below");
           seti.add("beside");
           seti.add("besides");
           seti.add("between");
           seti.add("beyond");
           seti.add("bill");
           seti.add("both");
           seti.add("bottom");
           seti.add("but");
           seti.add("by");
           seti.add("call");
           seti.add("can");
           seti.add("cannot");
           seti.add("cant");
           seti.add("co");
           seti.add("con");
           seti.add("could");
           seti.add("couldnt");
           seti.add("cry");
           seti.add("de");
           seti.add("describe");
           seti.add("detail");
           seti.add("do");
           seti.add("done");
           seti.add("down");
           seti.add("due");
           seti.add("during");
           seti.add("each");
           seti.add("eg");
           seti.add("eight");
           seti.add("either");
           seti.add("eleven");
           seti.add("else");
           seti.add("elsewhere");
           seti.add("empty");
           seti.add("enough");
           seti.add("etc");
           seti.add("even");
           seti.add("ever");
           seti.add("every");
           seti.add("everyone");
           seti.add("everything");
           seti.add("everywhere");
           seti.add("except");
           seti.add("few");
           seti.add("fifteen");
           seti.add("fify");
           seti.add("fill");
           seti.add("find");
           seti.add("fire");
           seti.add("first");
           seti.add("five");
           seti.add("for");
           seti.add("former");
           seti.add("formerly");
           seti.add("forty");
           seti.add("found");
           seti.add("four");
           seti.add("from");
           seti.add("front");
           seti.add("full");
           seti.add("further");
           seti.add("get");
           seti.add("give");
           seti.add("go");
           seti.add("had");
           seti.add("has");
           seti.add("hasnt");
           seti.add("have");
           seti.add("he");
           seti.add("hence");
           seti.add("her");
           seti.add("here");
           seti.add("hereafter");
           seti.add("hereby");
           seti.add("herein");
           seti.add("hereupon");
           seti.add("hers");
           seti.add("herself");
           seti.add("him");
           seti.add("himself");
           seti.add("his");
           seti.add("how");
           seti.add("however");
           seti.add("hundred");
           seti.add("ie");
           seti.add("if");
           seti.add("in");
           seti.add("inc");
           seti.add("indeed");
           seti.add("interest");
           seti.add("into");
           seti.add("is");
           seti.add("it");
           seti.add("its");
           seti.add("itself");
           seti.add("keep");
           seti.add("last");
           seti.add("latter");
           seti.add("latterly");
           seti.add("least");
           seti.add("less");
           seti.add("ltd");
           seti.add("made");
           seti.add("many");
           seti.add("may");
           seti.add("me");
           seti.add("meanwhile");
           seti.add("might");
           seti.add("mill");
           seti.add("mine");
           seti.add("more");
           seti.add("moreover");
           seti.add("most");
           seti.add("mostly");
           seti.add("move");
           seti.add("much");
           seti.add("must");
           seti.add("my");
           seti.add("myself");
           seti.add("name");
           seti.add("namely");
           seti.add("neither");
           seti.add("never");
           seti.add("nevertheless");
           seti.add("next");
           seti.add("nine");
           seti.add("no");
           seti.add("nobody");
           seti.add("none");
           seti.add("noone");
           seti.add("nor");
           seti.add("not");
           seti.add("nothing");
           seti.add("now");
           seti.add("nowhere");
           seti.add("of");
           seti.add("off");
           seti.add("often");
           seti.add("on");
           seti.add("once");
           seti.add("one");
           seti.add("only");
           seti.add("onto");
           seti.add("or");
           seti.add("other");
           seti.add("others");
           seti.add("otherwise");
           seti.add("our");
           seti.add("ours");
           seti.add("ourselves");
           seti.add("out");
           seti.add("over");
           seti.add("own");
           seti.add("part");
           seti.add("per");
           seti.add("perhaps");
           seti.add("please");
           seti.add("add");
           seti.add("rather");
           seti.add("re");
           seti.add("same");
           seti.add("see");
           seti.add("seem");
           seti.add("seemed");
           seti.add("seeming");
           seti.add("seems");
           seti.add("serious");
           seti.add("several");
           seti.add("she");
           seti.add("should");
           seti.add("show");
           seti.add("side");
           seti.add("since");
           seti.add("sincere");
           seti.add("six");
           seti.add("sixty");
           seti.add("so");
           seti.add("some");
           seti.add("somehow");
           seti.add("someone");
           seti.add("something");
           seti.add("sometime");
           seti.add("sometimes");
           seti.add("somewhere");
           seti.add("still");
           seti.add("such");
           seti.add("system");
           seti.add("take");
           seti.add("ten");
           seti.add("than");
           seti.add("that");
           seti.add("the");
           seti.add("their");
           seti.add("them");
           seti.add("themselves");
           seti.add("then");
           seti.add("thence");
           seti.add("there");
           seti.add("thereafter");
           seti.add("thereby");
           seti.add("therefore");
           seti.add("therein");
           seti.add("thereupon");
           seti.add("these");
           seti.add("they");
           seti.add("thickv");
           seti.add("thin");
           seti.add("third");
           seti.add("this");
           seti.add("those");
           seti.add("though");
           seti.add("three");
           seti.add("through");
           seti.add("throughout");
           seti.add("thru");
           seti.add("thus");
           seti.add("to");
           seti.add("together");
           seti.add("too");
           seti.add("top");
           seti.add("toward");
           seti.add("towards");
           seti.add("twelve");
           seti.add("twenty");
           seti.add("two");
           seti.add("un");
           seti.add("under");
           seti.add("until");
           seti.add("up");
           seti.add("upon");
           seti.add("us");
           seti.add("very");
           seti.add("via");
           seti.add("was");
           seti.add("we");
           seti.add("well");
           seti.add("were");
           seti.add("what");
           seti.add("whatever");
           seti.add("when");
           seti.add("whence");
           seti.add("whenever");
           seti.add("where");
           seti.add("whereafter");
           seti.add("whereas");
           seti.add("whereby");
           seti.add("wherein");
           seti.add("whereupon");
           seti.add("wherever");
           seti.add("whether");
           seti.add("which");
           seti.add("while");
           seti.add("whither");
           seti.add("who");
           seti.add("whoever");
           seti.add("whole");
           seti.add("whom");
           seti.add("whose");
           seti.add("why");
           seti.add("will");
           seti.add("with");
           seti.add("within");
           seti.add("without");
           seti.add("would");
           seti.add("yet");
           seti.add("you");
           seti.add("your");
           seti.add("yours");
           seti.add("yourself");
           seti.add("yourselves");
           seti.add("the");
 
	SAXParserFactory factory = SAXParserFactory.newInstance();
	SAXParser saxParser = factory.newSAXParser();
 
	DefaultHandler handler = new DefaultHandler() {
		int filecount=0;
		boolean titl = false;
		boolean id = false;
		boolean text = false;
		int count_xml=0;
		StringBuilder sb,infob,tit,cat,ext,ref,body;
		int idfl=1,inf=0,reff=0,bodyf=0;
		StringTokenizer st2;
		Stemmer stm=new Stemmer();
		Vector<String> file_nam=new Vector<String>();
		int pagid;
		Map<String,Map<Integer,Vector<Integer>>> treemap = new HashMap<String, Map<Integer,Vector<Integer>>>();
		Map<String,Map<Integer,Vector<Integer>>> struc = new TreeMap<String, Map<Integer,Vector<Integer>>>(treemap);	
		
		
		public void startElement(String uri, String localName,String qName, 
	                Attributes attributes) throws SAXException {
	 
			
	 
			if (qName.equalsIgnoreCase("title")) {
				titl = true;
				idfl=1;
				tit = new StringBuilder();
				count_xml++;
			}
	 
			if (qName.equalsIgnoreCase("id")) {
				if(idfl==1)
				{
				id = true;
				idfl=0;
				}
				}
			if (qName.equalsIgnoreCase("text")) {
				inf=0;
				reff=0;
				bodyf=0;
				infob = new StringBuilder();
				sb = new StringBuilder();	
				cat = new StringBuilder();
				ext = new StringBuilder();
				ref = new StringBuilder();
				body = new StringBuilder();
				text = true;
				
			}
	 
		}
	 
		public void endElement(String uri, String localName,
			String qName) throws SAXException {
			if (qName.equalsIgnoreCase("file")) {
			
				count_xml=0;	
				filecount++;
				file_nam.add("output_"+filecount+".txt");
				writemap wr=new writemap();
				try {
					wr.writ(struc,filecount);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				struc.clear();
				treemap.clear();
				System.out.println("done "+filecount);
				
				mergefile mg=new mergefile();
				try {
					mg.milao(file_nam);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if (qName.equalsIgnoreCase("title")) {
					
			}
			if (qName.equalsIgnoreCase("id")) {
				id = false;
			}
			if (qName.equalsIgnoreCase("text")) {
				text = false;
				
				st2 = new StringTokenizer(tit.toString(), " `~^*_[{=\n|<-/&%$#@!+',\t;\\?.\"!>():|]}0123456789");
				 
				while (st2.hasMoreElements()) {
					String ff=st2.nextElement().toString();
					if(!seti.contains(ff))
					{
		//				System.out.println(ff);
						if(ff.length()>2)
						stm.nikal(ff,struc,0,pagid);
					}
				}	
			
				
			//	System.out.println("sb :" + sb);		
				leftout();
		//		System.out.println("_______________________________________________________________________________________");
		//		System.out.println("infobox :" + infob);		
				st2 = new StringTokenizer(infob.toString(), " `~^*_[{=\n|<-/&%$#@!+',\t;\\?.\"!>():|]}0123456789");
				 
				while (st2.hasMoreElements()) {
					String ff=st2.nextElement().toString();
					if(!seti.contains(ff))
					{
		 		//		System.out.println(ff);
			 			if(ff.length()>2)
						stm.nikal(ff,struc,1,pagid);
			  		}
				}
			//	System.out.println("_______________________________________________________________________________________");
		//		System.out.println("sb :" + sb);
		//				System.out.println("_______________________________________________________________________________________");
			
				int		p=0;
					int	 chk=0,beg=0,end=0,fir=1;
						 while(chk>=0)
						 {
							 chk=sb.indexOf("[[Category:",p);
							 if((fir==1)&&(chk>=0))
							 {
								 beg=chk;
								 fir=0;
							 }
						 if(chk>=0)
						 {
						 p=sb.indexOf("]]",chk);
							 if(p<0)
							 {
								System.out.println("wrong cat"); 
								end=sb.length()-1;
								break;
							 }
							 else
							 {		 
						 end=p;
						 cat.append(sb.substring(chk+11,p)+" ## ");
							 }
						 }
						 }
						 sb.delete(beg, end+2);
							st2 = new StringTokenizer(cat.toString(), " `~^*_[{=\n|<-/&%$#@!+',\t;\\?.\"!>():|]}0123456789");
							 
								while (st2.hasMoreElements()) {
									String ff=st2.nextElement().toString();
									if(!seti.contains(ff))
									{
						//				System.out.println(ff);
										if(ff.length()>2)
							 			stm.nikal(ff,struc,2,pagid);
									}
								}	 		
		/*		System.out.println("category :" + cat);
				System.out.println("_______________________________________________________________________________________");
				System.out.println("sb :" + sb);
				System.out.println("_______________________________________________________________________________________");
			*/	
						p=0;
					 chk=0;
					 beg=0;
					 end=0;
					 fir=1;
					 while(chk>=0)
					 {
						 chk=sb.indexOf("* [http://",p);
						 if((fir==1)&&(chk>=0))
						 {
							 beg=chk;
							 fir=0;
						 }
					 if(chk>=0)
					 {
					 p=sb.indexOf("]",chk);
						 if(p<0)
						 {
							System.out.println("wrong link");
							end=sb.length();
							break;
						 }
						 else
						 {		 
	
						 end=p;
						 ext.append(sb.substring(chk+10,p)+" ## ");
						 }
					 }
					 }
					 sb.delete(beg, end+1);
				
					 st2 = new StringTokenizer(ext.toString(), " `~^*_[{=\n|<-/&%$#@!+',\t;\\?.\"!>():|]}0123456789");
					 
							while (st2.hasMoreElements()) {
								String ff=st2.nextElement().toString();
								if(!seti.contains(ff))
								{
					//				System.out.println(ff);
									if(ff.length()>2)
									stm.nikal(ff,struc,3,pagid);
								}
							}	
				
		/*		System.out.println("external links :" + ext);
				System.out.println("_______________________________________________________________________________________");
				System.out.println("sb :" + sb);
				System.out.println("_______________________________________________________________________________________");
			*/	
					 st2 = new StringTokenizer(sb.toString(), " `~^*_[{=\n|<-/&%$#@!+',;\\?.\t\"!>():|]}0123456789");
					 
							while (st2.hasMoreElements()) {
								String ff=st2.nextElement().toString();
								if(!seti.contains(ff))
								{
				//					System.out.println(ff);
									if(ff.length()>2)
									stm.nikal(ff,struc,4,pagid);
								}
							}
				
		//		System.out.println("body :" + body);
		//		System.out.println("===========================================================================================");

				
			}
		
			if (qName.equalsIgnoreCase("page"))
			{
				
				if(count_xml>5000)
				{
				count_xml=0;	
				filecount++;
				file_nam.add("output_"+filecount+".txt");
				writemap wr=new writemap();
				try {
					wr.writ(struc,filecount);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				struc.clear();
				treemap.clear();
				System.out.println("done "+filecount);
				
				}
				
				
				try {
				bw.write(pagid+": "+tit.toString()+"\n");
				
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
	 
		public void characters(char ch[], int start, int length) throws SAXException {
	 
			if (titl) {
				
//				System.out.println("title : " + new String(ch, start, length));
				tit.append(""+new String(ch, start, length));
				titl = false;
				
			
			}
			if (id) {
				pagid=Integer.parseInt(new String(ch, start, length));
		//		System.out.println("id : " + new String(ch, start, length));
				id=false;
		
			}
			if (text) {
		                sb.append(""+ new String(ch, start, length));		
			}
	 
		}

		 public void leftout()
		 {
			 
			 int infb =sb.indexOf("{{Infobox settlement");
			 if(infb>=0)
			 {	
				int count=1;
			 	int chflag=1;
				int ty=infb;
				int beg=0;
				int end=0;
			 	while(count!=0)
				 {
					 if(chflag==1)
					 {	 beg=infb+20;
						 count=0;
						 chflag=0;
					 }
					 	if(sb.charAt(ty)=='{')
					 	{							
					 		count=count+1;	
					 		ty++;
					 	}
					 	else if(sb.charAt(ty)=='}')
					 	{							
					 		count=count-1;
					 		ty++;
					 		end=ty;
					 	}
					 	if(count==0)
					 	{
			
					 		infob.append(""+sb.substring(beg,end-1));
					 		sb.delete(beg-20, end+1);
					 		break;
					 	}					
				ty++;	
				 if(ty>=sb.length()-1)
				 {
					 System.out.println("Error in info");
					 sb.delete(beg-20,sb.length()-1);
					 break;
				 }
				 }			 
			 }
			 
		 }

	     };
	     
	     File file = new File("sample.xml");
	     InputStream inputStream= new FileInputStream(file);
	     Reader reader = new InputStreamReader(inputStream,"UTF-8"); 
	     InputSource is = new InputSource(reader); is.setEncoding("UTF-8");
	     //saxParser.parse(is, handler)
       saxParser.parse(is, handler);
 
     } catch (Exception e) {
       e.printStackTrace();
     }
    System.out.println("done");	
    bw.close();
	fk.close();
	
	
   }
 
}