package com.company;

public class NumberToWords {

    public static StringBuilder numberToWords(int number) {
        if (number < 0) {
            System.out.println("invalid parameters!");
        }

        int reverseNumber = reverseNumber(number);
        int lastZeros = getDigitCount(number) - getDigitCount(reverseNumber);

        StringBuilder word = new StringBuilder();
        while (reverseNumber > 0) {
            int firsDigit = reverseNumber % 10;
            switch (firsDigit) {
                case 0:
                    word.append("zero ");
                    break;
                case 1:
                    word.append("one ");
                    break;
                case 2:
                    word.append("two ");
                    break;
                case 3:
                    word.append("three ");
                    break;
                case 4:
                    word.append("four ");
                    break;
                case 5:
                    word.append("five ");
                    break;
                case 6:
                    word.append("six ");
                    break;
                case 7:
                    word.append("seven ");
                    break;
                case 8:
                    word.append("eight ");
                    break;
                case 9:
                    word.append("nine");
                    break;
            }
            reverseNumber /= 10;
        }
        //word.append("zero ".repeat(Math.max(0, lastZeros)));
        for (int i = 0; i < lastZeros; i++) {
            word.append("zero ");
        }
        return word;
    }

    public static int reverseNumber(int number) {
        if (number < 0) {
            return -1;
        }

        int reverseNumber = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            number /= 10;
        }

        return reverseNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        int count = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit == 0) {
                count++;
            }
            number /= 10;
        }
        return count;
    }


}
