import java.util.Vector;


public class Bsearch {

	
	public int bsearch(Vector<Integer> v, int s) {
     //   System.out.println("hellooo"+v.size());
//	int i=0;
//		while(v.elementAt(i)!=null)
	//	{
//			System.out.println(v.elementAt(i));
		//	i++;
//		}
		
		int left, right;
        left = 0;
        right = v.size()-1;
       // v.add(0, 0);
        int end_del, start_del;
        while (left != right - 1&& left<right) {
      //  	System.out.println(left+" "+right);
            int m = (right + left) / 2;
            if (v.elementAt(m) < s) {
                left = m; // Move left to the middle.
            } else if (v.elementAt(m) > s) {
                right = m; // Move right to the middle.
            } else {
               // v.remove(0);
                return v.elementAt(m);
            }
        }
      //  v.remove(0);
        return v.elementAt(right-1);

    }
	
	
	
	public int bsearch(Vector<String> v, String s) 
	{
		
        int left, right;
        left = 0;
        right = v.size()-1;
        //v.add(0, 0);
        
        int end_del, start_del;
        while (left != right-1) 
        {
            int m = (right + left) / 2;
           // System.out.println(v.elementAt(m));
            if (v.elementAt(m).compareTo(s)<0) {
                left = m; // Move left to the middle.
            } else if (v.elementAt(m).compareTo(s)>0) {
                right = m; // Move right to the middle.
            } 
            else
            {
            	return m;
            }
            if(left==(right-1)&&v.elementAt(right).compareTo(s)<=0)
            {
            	left++;
            	right++;
            	//return right;
            }
        }
        //v.remove(0);
        return right-1;

    }
}
