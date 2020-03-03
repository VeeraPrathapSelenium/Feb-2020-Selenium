package com.Strings;

import java.util.HashMap;
import java.util.Map;

public class GetDuplicateFromStrings {
	public static void main(String[] args) {
		
		String str="welcome to java training";
		
		Map<Character,Integer> allchars=new HashMap<>();
		
		char[] charArray=str.toCharArray();
		
		for (char c : charArray) {
			
			if(allchars.containsKey(c))
			{
			allchars.put(c, allchars.get(c)+1);
			}else
			{
				allchars.put(c, 1);
			}
			
			
		}
		
for(Map.Entry<Character, Integer> allkeys:allchars.entrySet() )
{
	if(allkeys.getValue()>1)
	{
		System.out.println(allkeys.getKey()+"----"+allkeys.getValue());
	}
}
		
		
		
	}

}
