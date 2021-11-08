package com.example.demo.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlogpressUtil {

	private static Logger logger = LoggerFactory.getLogger(BlogpressUtil.class);
	
	private static String elasticDateFormat = "MM-dd-yyyy'T'HH:mm:ss";
	private static String displayDateFormat = "MMMMM dd yyyy h:mm:ss a";
	private static final String ALPHA_NUMERIC_STRING = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz0123456789";
	private static int randomNoLength=10;
	
	private BlogpressUtil() {
		
	}
	
	/**
	 * Este metodo formateara la fecha indicada en el formato indicado
	 * @param inputDate
	 * @param dtFormat
	 * @return
	 */
	private static String getFormattedDate(Date inputDate, DateFormat dtFormat) {
		if (inputDate != null) {
			return dtFormat.format(inputDate);
		} else {
			return "";
		}
	}
	
	/**
	 * Este metodo retornara un objeto DateFormat desde el patron indicado
	 * @param dateFormatPattern
	 * @return
	 */
	public static DateFormat getDateFormatObj(String dateFormatPattern) {
		DateFormat dtFormat = new SimpleDateFormat(dateFormatPattern);
		return dtFormat;
	}
	
	/**
	 * Este metodo retornara una fecha formateada por Elastic Search
	 * @param inputDate
	 * @return
	 */
	public static String getFormattedDateForElasticSearch(Date inputDate) {
		return getFormattedDate(inputDate, getDateFormatObj(elasticDateFormat));
	}

	
	/**
	 * Este metodo retornara la fehca formateada para mostrar en la web
	 * @param inputDate
	 * @return
	 */
	public static String getFormattedDateForDisplayOnPage(Date inputDate) {
		return getFormattedDate(inputDate, getDateFormatObj(displayDateFormat));
	}
	
	/**
	 * Este metodo genera un numero aleatorio con un valor real de objeto Date
	 * @param currentDate
	 * @return
	 */
	public static String RandonmNumber(Date currentDate) {
		int count = randomNoLength;
		StringBuilder builder = new StringBuilder();
		while (count-- != 0) {
			int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
			builder.append(ALPHA_NUMERIC_STRING.charAt(character));
		}
		
		Date date = currentDate;
		if (date == null) {
			currentDate = new Date();
		}
		return builder.append(currentDate.getTime()).toString();
	}
	
	public static int parseInteger(String intStr) {
		int returnValue = 0;
		try {
			returnValue = Integer.parseInt(intStr);
		} catch (NumberFormatException e) {
			logger.error("error mientras convertiamos a entero"+intStr, e.getMessage(), e);
		}
		return returnValue;
	}
}
