package javaprogram;

public class RevesreString {

	public static void main(String[] args) {

				String s = "hello , how are you";
				String [] str= s.split(" ");
				for (int i=0; i<s.length()-1 ; i++) {
					String ch=str[i];
					for(int j=ch.length()-1; j>=0;j--) {
						System.out.print(ch.charAt(j));
					}
					
				}
				
			}
		}


	


