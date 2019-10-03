package com.example.howtodoinjava.springbootsoapclient;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.howtodoinjava.schemas.kareo.UpdateScore;
import com.example.howtodoinjava.schemas.kareo.UpdateScoreResponse;

@SpringBootApplication
public class SpringBootSoapClientApplication {

	public static void main(String[] args) {
		// SpringApplication.run(SpringBootSoapClientApplication.class, args);
		maxSubString("banana");
	}

	@Bean
	CommandLineRunner lookup(SOAPConnector soapConnector) {
		return args -> {
			String name = "Sajal";// Default Name
			if (args.length > 0) {
				name = args[0];
			}
			UpdateScore request = new UpdateScore();
			// StudentDetailsRequest request = new StudentDetailsRequest();
			// request.arg1 = 1;
			// request.arg2 = 2;
			// request.arg0 = 0;

			UpdateScoreResponse response = (UpdateScoreResponse) soapConnector

					.callWebService("http://localhost:8080/Soapservices/ScoreService", request);
			System.out.println("Got Response As below ========= : ");
			System.out.println("Name : " + response.getReturn());
			/// System.out.println("Standard : "+response.getStudent().wins);
			// System.out.println("Address : "+response.getStudent().ties);
		};
	}

	public static String reverse(String s1) {
		String s = "";
		System.out.println(s1);
		for (int i = s1.length() - 1; i >= 0; i--) {
			s = s + s1.charAt(i);
		}

		return s;
	}

	public static String maxSubString(String s) {
		HashMap<String, Integer> map = new HashMap<>();
		// ArrayList<String> arrayList=new ArrayList<>();
		int max = 0;
		String maxvalue = "";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				if (map.containsKey(s.substring(i, j + 1))) {
					int value = map.get(s.substring(i, j + 1));
					map.put(s.substring(i, j + 1), value + 1);
				} else {
					map.put(s.substring(i, j + 1), 1);
				}
			}
		}
		TreeMap<String, Integer> tm = new TreeMap<>(map);
		Set<Entry<String, Integer>> keys = tm.entrySet();

		for (Entry<String, Integer> object : keys) {
			String key = object.getKey();
			int value = object.getValue();
			if (tm.containsKey(reverse(key))) {
				key = reverse(key);
				tm.put(reverse(key), tm.get(reverse(key)) + 1);
			}

			if ((key.length() > maxvalue.length()) && (max < value)) {
				max = value;
				maxvalue = key;
			}

		}
		return null;
	}
}
