package tutor;
import java.util.Date;
import java.text.*;

public class DateDemo {
	public static void main(String []args){
		Date date = new Date();
		System.out.println(date.toString());

		// Formatting example.
		SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd G 'at' hh:mm:ss a zzz");
		System.out.println("Current date reformatted is " + ft.format(date));

		// Or you can do it this way.
		String str = String.format("Current Date/Time : %tc\n", date );
		System.out.printf(str);
	
		// Or yet another way (space Month DayofMonth Year).
		System.out.printf("%1$s %2$tB %2$td, %2$tY\n", "Due date:", date);

		// Or even this way ( "<" means use same arg as preceding format specifier).
		System.out.printf("%s %tB %<te, %<tY\n", "Due date:", date);

		// Parse a string.
		SimpleDateFormat ft2 = new SimpleDateFormat ("yyyy-MM-dd"); 
		String input = args.length == 0 ? "1970-11-21" : args[0]; 

		System.out.print(input + " Parses as ");
		Date t;
		try {
			t = ft2.parse(input); 
			System.out.println(t); 
		}catch (ParseException e) { 
			System.out.println("Unparseable using " + ft2); 
		}
	}
}
