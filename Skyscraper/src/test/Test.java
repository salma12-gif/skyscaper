package test;





import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the total number of floors in the building");
		Scanner sc = new Scanner(System.in);
		int totalFloors = sc.nextInt();
		System.out.println(totalFloors);
		
		ArrayList<Integer> floorSizes = new ArrayList<>();
		for(int i = 1 ; i <= totalFloors ; i++) {
			System.out.println("Enter the floor size given on day : "+i);
			floorSizes.add(sc.nextInt());
		}
		
		for(int i : floorSizes) {
			System.out.println(i);
		}
		
		arrangeFloors2(floorSizes);
	}
	
	public static void arrangeFloors2(ArrayList<Integer> floorSizes) {
		int largestFloor = floorSizes.size();
		int currentFloor;
		
		System.out.println("floorSizes "+floorSizes);
		
		List<Integer> remainingFloors = new ArrayList<>();
		List<Integer> addedFloors = new ArrayList<>();
		
		System.out.println("The order of constructions is as follows");
		
		for(int i = 0 ; i < floorSizes.size() ; i++) {
			currentFloor = floorSizes.get(i);
			System.out.println("Day: "+(i+1));
			
			if(currentFloor < largestFloor) {
				remainingFloors.add(currentFloor);
			}
			else {
				remainingFloors.add(currentFloor);
				Collections.sort(remainingFloors,Collections.reverseOrder());
				addedFloors.clear();
				while(remainingFloors.contains(largestFloor)) {
					System.out.print(largestFloor);
					System.out.print(" ");
					addedFloors.add(largestFloor);
					largestFloor=largestFloor-1;
				}
				
				for(int floor : addedFloors) {
					remainingFloors.remove(Integer.valueOf(floor));
				}
				
			}	
			
			System.out.println();
			
		}
		
		
		
		
	}

}