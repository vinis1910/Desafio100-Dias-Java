import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exe_10 {

	public static void main(String[] args) {
		
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Date data = new Date();
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(data);
		
		calendario.add(Calendar.DAY_OF_MONTH, -10);

		for(int i = 1; i <= 10; i++) {
			calendario.add(Calendar.DAY_OF_MONTH, 1);
			data = calendario.getTime();
			System.out.println(format.format(data));
		}
		
		System.out.println("----------");
		System.out.println(format.format(data));
		System.out.println("----------");
		

		for(int i = 1; i <= 10; i++) {
			calendario.add(Calendar.DAY_OF_MONTH, 1);
			data = calendario.getTime();
			System.out.println(format.format(data));
		}



}}
