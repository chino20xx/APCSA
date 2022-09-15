
public class FirstLastVowel {
   public String go( String a ) {
  
String vowels = "AEIOUaeiou";
  String first = a.substring(0,1);
     String last = a.substring(a.length()-1);

     if (vowels.contains(first) || vowels.contains(last)) {
       return "yes";
     }
     else {
       return "no";
     }




     
	}
}