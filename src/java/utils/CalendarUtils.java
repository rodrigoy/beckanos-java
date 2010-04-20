package utils;

import java.util.Calendar;

/**
 * Classe utilitária para lidar com Diárias, Períodos e Etc...
 * @author rodrigoy
 *
 */
public class CalendarUtils {
	
	static final long DIA_MS = 1000 * 60 * 60 * 24;
	
	/**
	 * Retorna os dias que existem entre duas datas
	 * @param start - data inicio
	 * @param end - data fim
	 * @return
	 */
	public static long days(Calendar start, Calendar end) {
		return (end.getTimeInMillis() - start.getTimeInMillis()) / DIA_MS;
	}
	
	public static boolean ehHoje(Calendar data) {
		Calendar hoje = Calendar.getInstance();
		hoje.set(Calendar.HOUR_OF_DAY, 0);
		hoje.set(Calendar.MINUTE, 0);
		hoje.set(Calendar.SECOND, 0);
		hoje.set(Calendar.MILLISECOND, 0);
		
		return data.getTime().equals(hoje.getTime());
	}
}
