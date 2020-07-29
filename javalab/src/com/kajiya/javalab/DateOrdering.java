package com.kajiya.javalab;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DateOrdering {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date data1 = sdf.parse("01/01/2000");
			Date data2 = sdf.parse("01/01/2001");
			Date data3 = sdf.parse("01/01/2002");
			Date data4 = sdf.parse("01/01/2003");
			Date data5 = sdf.parse("01/01/2004");

			List<Date> dateList = new ArrayList<>();
			dateList.add(data4);
			dateList.add(data3);
			dateList.add(data5);
			dateList.add(data2);
			dateList.add(data1);
			dateList.stream().forEach(d -> System.out.println(sdf.format(d)));

			dateList.stream().filter(v -> {
				try {
					return v.before(sdf.parse("03/01/2001"));
				} catch (ParseException e) {					
					return false;
				}
			}).forEach(d -> System.out.println(sdf.format(d)));

			System.out.println(sdf.format(dateList.stream().min((v1, v2) -> v1.compareTo(v2)).get()));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
}
