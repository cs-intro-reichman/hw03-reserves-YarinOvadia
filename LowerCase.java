/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String s = args[0];
        System.out.println(lowerCase(s));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {
        String strr = "";
		for (int i=0 ; i < s.length () ; i++) {
			if ((s.charAt(i) >= 65) && (s.charAt(i) <= 90)) {
				int n = s.charAt(i) + 32;
				strr += (char)n;
			} else strr += s.charAt(i);
		}
		         return strr;
				
			}
		}
		
		
		
		