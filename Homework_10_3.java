package Homework;

import static java.lang.System.out;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Homework_10_3 {
	public static void main(String[] args) throws ParseException {
		String option;
		String inputDate;
		Date date;
		//↓年月日 正規表示法
		String dateRegex = 
		"(\\d{4})((0([1-9]))|(1[0-2]))(([0-2]([1-9]))|([12]0)|(3[01]))";
		
		Scanner sc = new Scanner(System.in);
		out.print("請輸入日期(年月日，例如:20110131): ");
		while(true){
			inputDate = sc.next();
			if(inputDate.matches(dateRegex)) {
				date = new SimpleDateFormat("yyyyMMdd").parse(inputDate);
				break;
			} else {
				out.println("日期格式不正確，請再輸入一次!");
				sc = new Scanner(System.in);
			}	
		}
		System.out.print("欲格式化成(1)年/月/日(2)月/日/年(3)日/月/年: ");
		while(true){
			option = sc.next();
			if(option.matches("[123]")) {
				break;
			} else {
				out.println("格式不正確，請再輸入一次!(1)年/月/日(2)月/日/年(3)日/月/年:");
				sc = new Scanner(System.in);
			}
		}
		sc.close();
		switch (option) {
		case "1":
			//out.printf("%tY/%<tm/%<td %n", date);
			out.println(new SimpleDateFormat("yyyy/MM/dd").format(date));
			break;
		case "2":
			//out.printf("%tm/%<td/%<tY %n", date);
			out.println(new SimpleDateFormat("MM/dd/yyyy").format(date));
			break;
		case "3":
			//out.printf("%td/%<tm/%<tY %n", date);
			out.println(new SimpleDateFormat("dd/MM/yyyy").format(date));
			break;
		}
	}
}
