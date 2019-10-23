package com.basic.hillel;

public class Main {

    public static void main(String[] agrs) {
        // 2.Convert Fahrenheit to Celsius
        double inFahrenheits = 10;
        double celcius = (5.0/9) * (inFahrenheits - 32);
        System.out.println("convertFahrenheitToCelsius inFahrenheits = " + inFahrenheits + "  calculated Celsius = " + celcius);
        System.out.println();

        // 1.Convert Celsius to Fahrenheit
        double celcius1 = -12.221;
        double fahrenheit = celcius1 * 9.0/5.0 + 32;
        System.out.println("convertCelciusToFahrenheit celsius = " + celcius1 + " calculated Fahrenheit =" + fahrenheit);
        System.out.println();

        // 3. Convert Celsius to Kelvin
        double celcius2 = 100;
        double kelvin = celcius2 + 273.16;
        System.out.println("convertcelciustokelvin = " + celcius2 + " calculated kelvin = " + kelvin);
        System.out.println();

        // 4.Convert meters to inches.
        double meter = 10;
        double inche = meter * 39.37;
        System.out.println("convertmetertoinches = " + meter + " calculated inches = " + inche);
        //reverse
        double inche1 = 10;
        double meter1 = inche1 / 39.37;
        System.out.println("convertinchestometer = " + inche1 + " calculated meters = " + meter1);
        System.out.println();

        //5.Convert miles to kilometres.
        double mile = 3.5;
        double km = mile * 1.609;
        System.out.println("convertMilesToKilometers = " + mile + " calculated  kms = " + km);
        //reverse
        double km1 = 10;
        double mile1 = km1 / 1.609;
        System.out.println("convertKilometersToMiles = " + km1 + "  calculated miles = " + mile1);
        System.out.println();

        //6. Convert kilograms to pounds.
        double kg = 3.5;
        double pound = kg * 2.2046;
        System.out.println("convert kg to ponds = " + kg + "  calculated pounds = " + pound);
        //reverse
        double pound1 = 10;
        double kg1 = pound1 / 1.609;
        System.out.println("convert pounds to kgs = " + pound1 + "  calculated kgs = " + kg1);
        System.out.println();

        //7. Convert speed km/hr to mi/hr.
        double kmhr = 3;
        double mihr = kmhr * 0.6214;
        System.out.println("convert speed km/hr to mi/hr = " + kmhr + "  calculated speed mi/hr = " + mihr);
        //reverse
        double mihr1 = 10.0;
        double kmhr1 = mihr1 / 0.6214;
        System.out.println("convert speed mi/hr to km/hr = " + mihr1 + "  calculated speed km/hr = " + kmhr1);
        System.out.println();

        //1. Time calculations
        int sec = 1000000;
        int days = sec / (60 * 60 * 24);
        int hours = sec / (60 * 60) - days * 24;
        int mins = sec / 60 - hours * 60 - days * 24 * 60;
        int secs = sec - mins * 60 - hours * 60 * 60 - days * 24 * 60 * 60;
        System.out.println(sec + " sec = " + days + " days " + hours + " hours " + mins + " min " + secs + " secs");

        days = 7;
        hours = 23;
        mins = 12;
        secs = 40;
        sec = days * 24 * 60 * 60 + hours * 60 * 60 + mins * 60 + secs;
        System.out.println(days + " days " + hours + " hours " + mins + " min " + secs + " secs = " + sec + " secs");
        System.out.println();

        //2.  Marks conversions
        int total = 11;
        int marked = 8;
        int percent = marked * 100 / total;
        System.out.println("Results = " + percent + "%" );
        System.out.println();

        //  Multiple choice test score
        int total1 = 10;
        int passed = 3;
        int percent1 = passed * 100 / total1;
        int percent2 = 100 - percent1;
        System.out.println("Results: passed = " + percent1 + "%, failed = " + percent2 + "%");
        System.out.println();

//        Mathematic
        // 26.
        double x26 = 2;
        double y26 = Math.log(Math.abs(Math.sin(x26))) + 2 * Math.pow(Math.E,x26) + 2 * Math.cos(Math.abs(x26))+ 2;
        System.out.println("Ex. 26: y = " + y26 + "  for x = " + x26);
        System.out.println();

        // 23.
        double x23 = 2;
        double y23 = Math.acos(Math.tan(5 * x23 / Math.PI)) + Math.pow(x23, 5.7) / 23.0;
        System.out.println("Ex. 23: y = " + y23 + "  for x = " + x23);
        System.out.println();

        //9.
        double x9 = 2;
        double y9 = 1.1 * Math.pow(Math.E,-x9) + Math.abs(Math.cos(Math.sqrt(Math.PI * x9))) - 3.0 / 8.0;
        System.out.println("Ex. 9: y = " + y9 + "  for x = " + x9);
        System.out.println();

        // 19.
        double x19 = 2;
        double y19 = Math.acos(Math.tan(5 * x19 / Math.PI)) + Math.pow(x19, 3.2) / 28.0;
        System.out.println("Ex. 19: y = " + y19 + "  for x = " + x19);
        System.out.println();

        // 21.
        double x21 = 0.1;
        double y21 = (Math.pow(Math.log10(x21), 0.25) + Math.acos(x21 + 3)) / Math.abs(x21 + 2 * x21 * x21);
        System.out.println("Ex. 21: y = " + y21 + "  for x = " + x21);
        System.out.println();


    }
}
