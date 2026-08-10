import java.util.EnumSet;

public class _4_EnumSet {
    static void main(String[] args) {
        enum Day {

            MONDAY,
            TUESDAY,
            WEDNESDAY,
            THURSDAY,
            FRIDAY,
            SATURDAY,
            SUNDAY

        }
        EnumSet<Day> workingDays =
                EnumSet.of(
                        Day.MONDAY,
                        Day.TUESDAY,
                        Day.WEDNESDAY,
                        Day.THURSDAY,
                        Day.FRIDAY);
        System.out.println(workingDays);

        //allOf()
        EnumSet<Day> allDays = EnumSet.allOf(Day.class);
        System.out.println(allDays);

        //noneOf()
        EnumSet<Day> days = EnumSet.noneOf(Day.class);
        System.out.println(days);
        days.add(Day.MONDAY);
        System.out.println(days);

        //range()
        EnumSet<Day> d =  EnumSet.range(Day.MONDAY, Day.FRIDAY);
        System.out.println(d);

        //complementOf()  Given set ke opposite enum constants:
        EnumSet<Day> weekends = EnumSet.of(Day.SATURDAY, Day.SUNDAY);
        EnumSet<Day> weekdays = EnumSet.complementOf(weekends);
        System.out.println(weekends);
        System.out.println(weekdays);

        //Common methods
        //containsAll()  Check whether one set contains all elements of another:
        //removeIf()  Predicate ke basis par elements remove:

    }
}
