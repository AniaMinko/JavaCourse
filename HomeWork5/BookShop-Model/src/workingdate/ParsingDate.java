package workingdate;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class ParsingDate {

	public static SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
	public static Date parse(String string) throws ParseException{
		return date.parse(string);
	}
	public static String format(Date date1){
		return date.format(date1);
	}
}
