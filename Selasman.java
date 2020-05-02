package DR7Zad1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Arrays;

public class Selasman {

	public static void main(String[] args) throws IOException {
		Map<String, Engine> allEngine = new HashMap();
		Map<String, Car> allCar = new HashMap();
		System.out.println("********START********");
		Scanner scanner = new Scanner(System.in);
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int numb = scanner.nextInt();
		for (int i = 0; i < numb; i++) {
			String[] slice = new String[10];
			slice = in.readLine().split(" ");
			slice = Arrays.copyOf(slice, 4);
			String model = slice[0];
			int power =Integer.parseInt(slice[1]);
			int displacement = 0;
			char efficiency = 0;
			if (isNumeric(slice[2])) {
				displacement = Integer.parseInt(slice[2]);
				if (slice[3]!=null) {
					efficiency = slice[3].charAt(0);
				}
			}else
				if (slice[2]!=null) {
					efficiency = slice[2].charAt(0);
				}
			allEngine.put(model, new Engine(model, power, displacement, efficiency));
		}
		numb = scanner.nextInt();
		for (int i = 0; i < numb; i++) {
			try {
				String[] slice = new String[10];
				slice = in.readLine().split(" ");
				slice = Arrays.copyOf(slice, 4);
				String model = slice[0];
				String engineModel = slice[1];
				Engine eng = null;
				boolean flag = true;
				for (Map.Entry<String, Engine> engine : allEngine.entrySet()) {
					if(engine.getKey().equals(engineModel)) {	
						eng = engine.getValue();
						flag = false;
						break;
					}
				}
				if (flag) throw new IllegalArgumentException("Incorrect Engine model.");
				int weight = 0;
				String color = "";
				if (isNumeric(slice[2])) {
					weight = Integer.parseInt(slice[2]);
					if (slice[3]!=null) color = slice[3];
				}else if (slice[3]!=null)color = slice[3];
				
				allCar.put(model, new Car(model, eng, weight, color));
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
		for (Map.Entry<String, Car> car : allCar.entrySet()) {
			System.out.println(car.getValue().toString());
		}
	}
	public static boolean isNumeric(final String str) {
        if (str == null || str.length() == 0)  return false;
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
