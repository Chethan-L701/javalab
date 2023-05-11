package learn.programs;

import java.util.Scanner;

public class ConvertorInter {
    public static void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice : ");
        System.out.println("1. Distance conversion");
        System.out.println("2. Currency conversion");
        System.out.println("3. Time conversion");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter your choice : ");
                System.out.println("1. Meter to Kilometer");
                System.out.println("2. Kilometer to Meter");
                System.out.println("3. Mile to Kilometer");
                System.out.println("4. Kilometer to Mile");
                int choice1 = sc.nextInt();
                switch (choice1) {
                    case 1:
                        System.out.println("Enter the distance in meter : ");
                        double meter = sc.nextDouble();
                        Converter.meterToKilometer(meter);
                        break;
                    case 2:
                        System.out.println("Enter the distance in kilometer : ");
                        double kilometer = sc.nextDouble();
                        Converter.kilometerToMeter(kilometer);
                        break;
                    case 3:
                        System.out.println("Enter the distance in mile : ");
                        double mile = sc.nextDouble();
                        Converter.mileToKilometer(mile);
                        break;
                    case 4:
                        System.out.println("Enter the distance in kilometer : ");
                        double kilometer1 = sc.nextDouble();
                        Converter.kilometerToMile(kilometer1);
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
                break;
            case 2:
                System.out.println("Enter your choice : ");
                System.out.println("1. Dollar to Rupee");
                System.out.println("2. Rupee to Dollar");
                System.out.println("3. Euro to Rupee");
                System.out.println("4. Rupee to Euro");
                System.out.println("5. Yen to Rupee");
                System.out.println("6. Rupee to Yen");
                int choice2 = sc.nextInt();
                switch (choice2) {
                    case 1:
                        System.out.println("Enter the amount in dollar : ");
                        double dollar = sc.nextDouble();
                        Converter.dollarToRupee(dollar);
                        break;
                    case 2:
                        System.out.println("Enter the amount in rupee : ");
                        double rupee = sc.nextDouble();
                        Converter.rupeeToDollar(rupee);
                        break;
                    case 3:
                        System.out.println("Enter the amount in euro : ");
                        double euro = sc.nextDouble();
                        Converter.euroToRupee(euro);
                        break;
                    case 4:
                        System.out.println("Enter the amount in rupee : ");
                        double rupee1 = sc.nextDouble();
                        Converter.rupeeToEuro(rupee1);
                        break;
                    case 5:
                        System.out.println("Enter the amount in rupee : ");
                        double rupee2 = sc.nextDouble();
                        Converter.rupeeToYen(rupee2);
                        break;
                    case 6:
                        System.out.println("Enter the amount in rupee : ");
                        double rupee3 = sc.nextDouble();
                        Converter.rupeeToDollar(rupee3);
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
                break;
            case 3:
                System.out.println("Enter your choice : ");
                System.out.println("1. Minutes to Hours");
                System.out.println("2. Hours to Minutes");
                System.out.println("3. Minutes to Seconds");
                System.out.println("4. Seconds to Minutes");
                System.out.println("5. Seconds to Hours");
                System.out.println("6. Hours to Seconds");
                int choice3 = sc.nextInt();
                switch (choice3) {
                    case 1:
                        System.out.println("Enter the time in minutes : ");
                        double minutes = sc.nextDouble();
                        Converter.minuteToHour(minutes);
                        break;
                    case 2:
                        System.out.println("Enter the time in hours : ");
                        double hours = sc.nextDouble();
                        Converter.hourToMinute(hours);
                        break;
                    case 3:
                        System.out.println("Enter the time in minutes : ");
                        double minutes1 = sc.nextDouble();
                        Converter.minuteToSecond(minutes1);
                        break;
                    case 4:
                        System.out.println("Enter the time in seconds : ");
                        double seconds = sc.nextDouble();
                        Converter.secondToMinute(seconds);
                        break;
                    case 5:
                        System.out.println("Enter the time in seconds : ");
                        double seconds1 = sc.nextDouble();
                        Converter.secondToHour(seconds1);
                        break;
                    case 6:
                        System.out.println("Enter the time in hours : ");
                        double hours1 = sc.nextDouble();
                        Converter.hourToSecond(hours1);
                        break;
                }
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
