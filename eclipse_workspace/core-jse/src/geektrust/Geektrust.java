package geektrust;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Geektrust {
	
	public static String decode(String cipher, int key) {
		/**
		 * 
		 * cipher = transfered value
		 * key = number of char to reduce
		 * 
		 * Returns decoded string
		 * 
		 * 
		 */
		String decode = ""; 
		
		for(char ch: cipher.toCharArray()) {
			
			int v = (ch-key)-'A';
			if(v < 0)
				v = 26-key; //If a char is in negative index
			if((ch-'A')<key)
				v= 26-(key-(ch-'A')); //If char is less than key int value
			char c = (char)((int)'A'+v); 
			decode = decode+c;
			
		}
		
		return decode;
	}
	
	public static Map<Character, Integer> charCount(String string) {
		/**
		 * Creating Map for characters count
		 */ 
		Map<Character, Integer> map = new TreeMap<>();
		int chars[] = new int[26];
		for(char ch: string.toCharArray()) {
			if((ch-'A') >= 0)
				chars[ch - 'A']++; 
		} 
		for(int i = 0; i<chars.length; i++) {
			char c = (char)((int)'A'+i);
			if(chars[i] > 0) {
				if(map.containsKey(c)) {
					//To increment count into map if exist
					int count = map.get(c); 
					count = count+chars[i];
					map.put(c, count);
				}
				else
				{
					map.put(c, chars[i]);
				}
			}
		} 
		return map;
	}
	
	public static boolean countCharAndCompare(Map<Character, Integer> decode, Map<Character, Integer> emblem) {
		/**
		 * decode = decoded cipher
		 * emblem = actual emblem
		 * 
		 * Compares decode & actual emblem characters count
		 * If count matched in both the Strings means TRUE else FALSE
		 */
		Set<Character> set = emblem.keySet();
		for(char ch: set) {
			if(decode.containsKey(ch)) {
				if(!(decode.get(ch) >= emblem.get(ch)))
					return false;
			}
			else {
				return false;
			}
		}
		
		return true;
	} 
	public static void main(String args[]) {
		
		String filePath = args[0];
		List<String> kingdomOutput = new ArrayList<String>();
		
		//To get input collection from file - KINGDOM, SECRET_MESSAGE
		Map<String, String> inputMap = new LinkedHashMap<>();
		/*inputMap.put("AIR", "ROZO");
		inputMap.put("LAND", "FAIJWJSOOFAMAU");
		inputMap.put("ICE", "STHSTSTVSASOS");*/
		
		//To store kingdom & their emblem 
		Map<String, String> kingdom = new TreeMap<>();
		kingdom.put("SPACE", "Gorilla");
		kingdom.put("LAND", "Panda");
		kingdom.put("WATER", "Octopus");
		kingdom.put("ICE", "Mammoth");
		kingdom.put("AIR", "Owl");
		kingdom.put("FIRE", "Dragon"); 
		
		try {
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "UTF-8"));
			
			String line;
			try {
				while((line=reader.readLine()) != null) {
					if(line != null){
						String splitKingdom[] = line.split(" ");
						String key = "";
						String value = "";
						if(splitKingdom.length>0){
							//Suppose if value is having space
							key = splitKingdom[0];
							if(splitKingdom.length > 2){
								for(int i=1; i<splitKingdom.length; i++){
									value = value+" "+splitKingdom[i].trim();
								}
							}
							else{
								value = splitKingdom[1];
							}
						} 
						inputMap.put(key, value.trim());
					}
				}
			} catch (IOException e) { 
				e.printStackTrace();
			}
			
			
		} catch (UnsupportedEncodingException e) { 
			e.printStackTrace();
		} catch (FileNotFoundException e) { 
			e.printStackTrace();
		} 
		
		//decode input one by one & if decode cipher matches(true) - store in List
		inputMap.forEach((key, value) -> { 
			String actual_emblem = kingdom.get(key).toUpperCase();
			String decode_emblem = decode(value.toUpperCase(), kingdom.get(key).length());
			
			Map<Character, Integer> actual_map = charCount(actual_emblem);
			Map<Character, Integer> decode_map = charCount(decode_emblem); 

			boolean isMatching = countCharAndCompare(decode_map ,actual_map);
			
			if(isMatching)
				kingdomOutput.add(key);
		});
		
		if(kingdomOutput.size()<3) {
			System.out.println("NONE");
		}
		else {
			System.out.print("SPACE ");
			kingdomOutput.forEach(value -> {
				System.out.print(value+" ");
			});
		}
		System.out.println(""); 
	}
} 