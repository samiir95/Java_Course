package enumeration;

public class LoopingEnumeration {

	public static void main(String[] args) {

		WeekDays[] weekDays = WeekDays.values();

		for (WeekDays weekDay : weekDays) {

			System.out.println(weekDay);
		}

	}
}

