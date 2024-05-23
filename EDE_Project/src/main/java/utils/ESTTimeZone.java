package utils;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class ESTTimeZone {
	
	

	public static boolean CompareDate(String getDate) throws ParseException {
		boolean isLess = false;
		String[] str = getDate.split(" ");
		System.out.println(str.length);
		String day = str[0];
		String month = str[1];
		String year = str[3];
		System.out.println("day : " + day);
		System.out.println("day : " + month);
		System.out.println("day : " + year);
		str = str[2].split(",");

		getDate = day + ", " + str[0] + " " + month + " " + year;

		System.out.println(getDate);

		SimpleDateFormat dateFormat = new SimpleDateFormat("E, dd MMM yyyy");
		dateFormat.setTimeZone(TimeZone.getTimeZone("US/Eastern"));
		Date d1 = dateFormat.parse(getDate);
		Date date = new Date();
		String TodayDate = dateFormat.format(date);

		Date d2 = dateFormat.parse(TodayDate);

		if (d1.compareTo(d2) > 0) {
			// When Date d1 > Date d2
			isLess = false;
		}

		else if (d1.compareTo(d2) < 0) {

			// When Date d1 < Date d2
			System.out.println("Date1 is before Date2");
			isLess = true;
		}

		else if (d1.compareTo(d2) == 0) {

			// When Date d1 = Date d2
			System.out.println("Date1 is equal to Date2");
			isLess = true;
			;
		}

		return isLess;

	}

	

public static String DateFormateForLineItem(int days) throws ParseException{
		
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		dateFormat.setTimeZone(TimeZone.getTimeZone("US/Eastern"));
		Date date = new Date();
		String DF = dateFormat.format(date);

		Calendar c = Calendar.getInstance();
		c.setTime(dateFormat.parse(DF));
		c.add(Calendar.DATE, days);
		String selectDate = dateFormat.format(c.getTime());
		return selectDate;
	}

	public static String GetDate111(String Time_Zone, String Format) throws ParseException {

		DateFormat dateFormat = new SimpleDateFormat(Format);
		dateFormat.setTimeZone(TimeZone.getTimeZone(Time_Zone));
		Date date = new Date();
		String DF = dateFormat.format(date);

		Calendar c = Calendar.getInstance();
		c.setTime(dateFormat.parse(DF));
		String arrivalDate = dateFormat.format(c.getTime());

		System.out.println("date : " + arrivalDate);
		return arrivalDate;

	}
	 public static String getCalculatedDate(int year, int month, int day, boolean calcDOB) {
	        LocalDate now = null, dob = null;
	        int dobYear = year;
	        int dobMonth = month;
	        int dobDay = day;
	        String calculatedDOB = null;
	        now = LocalDate.now();
	        if(calcDOB) {
	            dob = now.minusYears(dobYear)
	                    .minusMonths(dobMonth)
	                    .minusDays(dobDay);   
	        }else {
	            dob = now.plusYears(dobYear)
	                    .plusMonths(dobMonth)
	                    .plusDays(dobDay);
	        }
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
	        calculatedDOB = dob.format(formatter);
	        return calculatedDOB;
	    }
	 public static String getDobFromAge(String age) {
		 int dobMonth =1;
		 int dobDay = Integer.parseInt(Utility.GenerateRandomDate());
		 int totalAge=Integer.parseInt(age);

		 LocalDate now = LocalDate.now();
		 LocalDate dob = now.minusYears(totalAge)
		         .minusMonths(dobMonth)
		         .minusDays(dobDay);

		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		 return dob.format(formatter);
	 }
	 public static String getDobFromAgeLow(String age) {
		 int dobMonth =4;
		 int dobDay = Integer.parseInt(Utility.GenerateRandomDate());
		 int totalAge=Integer.parseInt(age);

		 LocalDate now = LocalDate.now();
		 LocalDate dob = now.minusYears(totalAge)
		         .minusMonths(dobMonth)
		         .minusDays(dobDay);

		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		 return dob.format(formatter);
	 }
	 public static String getPreviousDate(String days, String formate) {
	 	int day = Integer.parseInt(days);
		LocalDate today = LocalDate.now();
		LocalDate date = today.minusDays(day);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formate);
		return date.format(formatter);
	 }
	 /*
	 public static String getPreviousDate(String days, String formate) throws Exception {
		 String[] date1, date2;
		 String finalDate;
		 int day = Integer.parseInt(days);
		 LocalDate today = LocalDate.now();
		 LocalDate date = today.minusDays(day);
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formate);
		 date1 = date.format(formatter).split(",");
//		 System.out.println("164: " + date1[0] + " - " + date1[1]);
		 date1[1] = date1[1].trim();
		 date2 = date1[0].split(" ");
		 finalDate = date2[0] + "/" + date2[1] + "/" + date1[1];
//		 System.out.println("169: " + finalDate);
		 return finalDate;
	 }
	 */
	 public static String getAdvanceDate(String days,String formate) {
		 int day = Integer.parseInt(days);
		 LocalDate today = LocalDate.now();
		 LocalDate date = today.plusDays(day);
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formate);
		 return date.format(formatter);
	 }
	 public static String getCurrentDate(String formate) {
		 LocalDateTime today =LocalDateTime.now();
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formate);
		 return today.format(formatter);
	 }
	 public static String getCurrentYear() throws IOException {
		 String applcationYear=Utility.getValue("applcationYear");
//		 int currentYear=0;
//		 Date d=new Date();  
//	        @SuppressWarnings("deprecation")
//			int year=d.getYear();
//	        if(applcationYear.equalsIgnoreCase("2021")) {
//	        currentYear=year+1900;
//	        }
//	        else if(applcationYear.equalsIgnoreCase("2022")) {
//	        	currentYear=year+1901;
//	        }
//	        String yearCurrent=String.valueOf(currentYear);
		 	applcationYear = "2024";
	        return applcationYear;
	        }  
	 
	 public static String getStartOfNextMonth(String format) {
		 LocalDate date= LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth());
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
			 return date.format(formatter);
	    }
	 public static String getLastMonthLastDate(String formate) {
		 DateFormat df = new SimpleDateFormat(formate);
	        Calendar calendar = Calendar.getInstance();
	        calendar.add(Calendar.MONTH, -1);

	        int max = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
	        calendar.set(Calendar.DAY_OF_MONTH, max);

	        return df.format(calendar.getTime()) ;
	    }
	 

		 public static String getRandomDate(int start, int end) {
	        GregorianCalendar gc = new GregorianCalendar();

	        int year = randBetween(start, end);

	        gc.set(gc.YEAR, year);

	        int dayOfYear = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));

	        gc.set(gc.DAY_OF_YEAR, dayOfYear);

	        return gc.get(gc.YEAR) + "-" + (gc.get(gc.MONTH) + 1) + "-" + gc.get(gc.DAY_OF_MONTH);
	        
		 }

	    

	    public static int randBetween(int start, int end) {
	        return start + (int)Math.round(Math.random() * (end - start));
	    }
	
}
