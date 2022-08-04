import java.util.Scanner;

class Anagram{
public static void main(String[] input){
	String str1, str2;
	int i, j, found=0;
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter First String :");
	str1 = scan.nextLine();
	System.out.print("Enter Second String :");
	str2 = scan.nextLine();

if(str1.length() ==  str2.length()){
	for(i=0; i<str1.length(); i++){
	 for(j=0; j<str1.length(); j++){
	  if(str1.charAt(i) == str2.charAt(j)){
		found = 1;
		break;
			}
		//found = 0;
		//break;
		      }
    		    }
		//found = 0;
		}
	if(found == 0){
	 System.out.print("Strings are not Anagrams");
		}
	else{
	System.out.print("Strings are  Anagrams");
}
}
}
