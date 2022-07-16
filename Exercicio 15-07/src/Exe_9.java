import java.util.Random;

public class Exe_9 {
	public static void main(String[] args) {
		int tam = 100, count = 0, nmrs = 6;
		int[] arr = new int[tam];
		int[] nums = new int[nmrs + 1];
		Random random = new Random();
		
		for(int k = 0; k < tam; k++) {
			arr[k] = random.nextInt(6) + 1;
		}
		
		for(int i = 1; i <=6; i++) {
			count = 0;
			nums[i] = i;
			System.out.print(nums[i] + "º Numero: ");
			for(int j = 0; j < arr.length; j++) {
				if(nums[i] == arr[j]){
					count = count + 1;
				}
			}
			System.out.println(count);
		}
	}
}

