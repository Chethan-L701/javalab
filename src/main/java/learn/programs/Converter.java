package learn.programs;

public class Converter {
    // Distance conversion
    public static void meterToKilometer(double meter) {
        System.out.println(meter + " meters is equal to " + meter * 1000 + " kilometers");
    }

    public static void kilometerToMeter(double kilometer) {
        System.out.println(kilometer + " kilometers is equal to " + kilometer / 1000 + " meters");
    }

    public static void mileToKilometer(double mile) {
        System.out.println(mile + " miles is equal to " + mile * 1.60934 + " kilometers");
    }

    public static void kilometerToMile(double kilometer) {
        System.out.println(kilometer + " kilometers is equal to " + kilometer / 1.60934 + " miles");
    }

    // Currency conversion
    public static void dollarToRupee(double dollar) {
        System.out.println(dollar + " dollars is equal to " + dollar * 75.00 + " rupees");
    }

    public static void rupeeToDollar(double rupee) {
        System.out.println(rupee + " rupees is equal to " + rupee / 75.00 + " dollars");
    }

    public static void euroToRupee(double euro) {
        System.out.println(euro + " euros is equal to " + euro * 85.00 + " rupees");
    }

    public static void rupeeToEuro(double rupee) {
        System.out.println(rupee + " rupees is equal to " + rupee / 85.00 + " euros");
    }

    public static void yenToRupee(double yen) {
        System.out.println(yen + " yen is equal to " + yen * 65.00 + " rupees");
    }

    public static void rupeeToYen(double rupee) {
        System.out.println(rupee + " rupees is equal to " + rupee / 65.00 + " yen");
    }

    // Time conversion
    public static void minuteToHour(double minute) {
        System.out.println(minute + " minutes is equal to " + minute / 60 + " hours");
    }

    public static void hourToMinute(double hour) {
        System.out.println(hour + " hours is equal to " + hour * 60 + " minutes");
    }

    public static void secondToMinute(double second) {
        System.out.println(second + " seconds is equal to " + second / 60 + " minutes");
    }

    public static void minuteToSecond(double minute) {
        System.out.println(minute + " minutes is equal to " + minute * 60 + " seconds");
    }

    public static void secondToHour(double second) {
        System.out.println(second + " seconds is equal to " + second / 3600 + " hours");
    }

    public static void hourToSecond(double hour) {
        System.out.println(hour + " hours is equal to " + hour * 3600 + " seconds");
    }
}
