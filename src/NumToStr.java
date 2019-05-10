import java.util.Scanner;

public class NumToStr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to read:");
        int number = scanner.nextInt();
        String str1 = "";
        String str2 = "";
        String str3 = "";
        if (number >= 0 && number < 10) {
            switch (number) {
                case 0:
                    str1 = "Zero";
                    break;
                case 1:
                    str1 = "One";
                    break;
                case 2:
                    str1 = "Two";
                    break;
                case 3:
                    str1 = "Three";
                    break;
                case 4:
                    str1 = "Four";
                    break;
                case 5:
                    str1 = "Five";
                    break;
                case 6:
                    str1 = "Six";
                    break;
                case 7:
                    str1 = "Seven";
                    break;
                case 8:
                    str1 = "Eight";
                    break;
                case 9:
                    str1 = "Nine";
                    break;
            }
        } else if (number >= 10 && number < 20) {
            switch (number % 10) {
                case 0:
                    str1 = "ten";
                    break;
                case 1:
                    str1 = "eleven";
                    break;
                case 2:
                    str1 = "twelve";
                    break;
                case 3:
                    str1 = "thirteen";
                    break;
                case 4:
                    str1 = "fourteen";
                    break;
                case 5:
                    str1 = "fifteen";
                    break;
                case 6:
                    str1 = "sixteen";
                    break;
                case 7:
                    str1 = "seventeen";
                    break;
                case 8:
                    str1 = "eighteen";
                    break;
                case 9:
                    str1 = "nineteen";
                    break;
            }
        } else if (number >= 20 && number < 100) {
            double tens = Math.floor(number / 10);
            int ones = number % 10;
            if (tens == 2.0) {
                str2 = "twenty";
            } else if (tens == 3.0) {
                str2 = "thirty";
            } else if (tens == 4.0) {
                str2 = "fourty";
            } else if (tens == 5.0) {
                str2 = "fifty";
            } else if (tens == 6.0) {
                str2 = "sixty";
            } else if (tens == 7.0) {
                str2 = "seventy";
            } else if (tens == 8.0) {
                str2 = "eighty";
            } else if (tens == 9.0) {
                str2 = "ninety";
            }
            switch (ones) {
                case 0:
                    str1 = "";
                    break;
                case 1:
                    str1 = " one";
                    break;
                case 2:
                    str1 = " two";
                    break;
                case 3:
                    str1 = " three";
                    break;
                case 4:
                    str1 = " four";
                    break;
                case 5:
                    str1 = " five";
                    break;
                case 6:
                    str1 = " six";
                    break;
                case 7:
                    str1 = " seven";
                    break;
                case 8:
                    str1 = " eight";
                    break;
                case 9:
                    str1 = " nine";
                    break;
            }
        } else if (number > 100 && number < 1000) {
            double hundred = Math.floor(number / 100);
            double tens = Math.floor((number - hundred * 100) / 10);
            int ones = number % 10;
            if (hundred == 1.0) {
                str3 = "one hundred and";
            } else if (hundred == 2.0) {
                str3 = "two hundred and";
            } else if (hundred == 3.0) {
                str3 = "three hundred and";
            } else if (hundred == 4.0) {
                str3 = "four hundred and";
            } else if (hundred == 5.0) {
                str3 = "five hundred and";
            } else if (hundred == 6.0) {
                str3 = "six hundred and";
            } else if (hundred == 7.0) {
                str3 = "seven hundred and";
            } else if (hundred == 8.0) {
                str3 = "eight hundred and";
            } else if (hundred == 9.0) {
                str3 = "nine hundred and";
            }
            if (tens == 1.0) {
                int spec = number % 100;
                switch (spec){
                    case 10:
                        str1 = " ten";
                        ones = 10;
                        break;
                    case 11:
                        str1 = " eleven";
                        ones = 10;
                        break;
                    case 12:
                        str1 = " twelve";
                        ones = 10;
                        break;
                    case 13:
                        str1 = " thirteen";
                        ones = 10;
                        break;
                    case 14:
                        str1 = " fourteen";
                        ones = 10;
                        break;
                    case 15:
                        str1 = " fifteen";
                        ones = 10;
                        break;
                    case 16:
                        str1 = " sixteen";
                        ones = 10;
                        break;
                    case 17:
                        str1 = " seventeen";
                        ones = 10;
                        break;
                    case 18:
                        str1 = " eighteen";
                        ones = 10;
                        break;
                    case 19:
                        str1 = " nineteen";
                        ones = 10;
                        break;
                }
            } else if (tens == 2.0) {
                str2 = " twenty";
            } else if (tens == 3.0) {
                str2 = " thirty";
            } else if (tens == 4.0) {
                str2 = " fourty";
            } else if (tens == 5.0) {
                str2 = " fifty";
            } else if (tens == 6.0) {
                str2 = " sixty";
            } else if (tens == 7.0) {
                str2 = " seventy";
            } else if (tens == 8.0) {
                str2 = " eighty";
            } else if (tens == 9.0) {
                str2 = " ninety";
            }


            switch (ones) {
                case 0:
                    str1 = "";
                    break;
                case 1:
                    str1 = " one";
                    break;
                case 2:
                    str1 = " two";
                    break;
                case 3:
                    str1 = " three";
                    break;
                case 4:
                    str1 = " four";
                    break;
                case 5:
                    str1 = " five";
                    break;
                case 6:
                    str1 = " six";
                    break;
                case 7:
                    str1 = " seven";
                    break;
                case 8:
                    str1 = " eight";
                    break;
                case 9:
                    str1 = " nine";
                    break;


            }

        }
        System.out.println(str3+str2+str1);
    }
}









