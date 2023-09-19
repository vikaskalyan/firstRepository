public class FactorialValue {

//    public static void main(String[] args) {
//        int no = 5;
//        int fact = 1;
//        for(int i = 1; i <= no; i++){
//            fact = fact*i;
//        }
//        System.out.println(fact);
//    }

//    public static void main(String[] args) {
//        String st = "Programmer";
//        char[] array = st.toCharArray();
//        for(int i = array.length -1; i >= 0; i--){    // Reverse the array
//            System.out.println(array[i]);
//        }
//        String str = array.toString();
//        System.out.println(str);
//    }

    //    public static void main(String[] args) {  // Compare String by sum of character
//        String s1 = "Programmer";
//        String s2 = "Detailsert";
//        char[] ch1 = s1.toCharArray();
//        char[] ch2 = s2.toCharArray();
//        int count1 = 0;
//        int count2 = 0;
//        for(int i = 0; i < ch1.length; i++){
//            count1++;
//        }
//        for(int i = 0; i< ch2.length; i++){
//            count2++;
//        }
//        if(count1 == count2){
//            System.out.println("True");
//        } else {
//            System.out.println("False");
//        }
//    }
//    public static void main(String[] args) {
//        int[] array = {12, 14, 15, 6, 8, 2};
//        int smallestNumber = array[0];
//        for (int number : array) {
//            if (smallestNumber > number) {       // find the smallest number in array
//                smallestNumber = number;
//            }
//        }
//        System.out.println(smallestNumber);
//    }

    //    public static void main(String[] args) {     // find the character occurence in a string
//        char instance = 'a';
//        int charCount = 0;
//        String st = "This is a nice Day";
//        char[] array = st.toCharArray();
//        for(char word : array){
//            if(instance == word){
//                charCount++;
//            }
//        }
//        System.out.println("Number of instance character occurence " + instance +" "+ "is" + " "+charCount);
//    }

//    public static void main(String[] args) {
//        int[] numArray = {12, 15, 16, 5, -7, 2, 9};   // smallest number in array
//        int smallestNum = 0;
//        for(int num : numArray) {
//            if (smallestNum > num) {
//                smallestNum = num;
//            }
//        }
//        System.out.println(smallestNum);
//    }

//    public static void main(String[] args) {
//        int[] prices = {15, 3, 3, 1, 8, 11, 12, 11, 1};  // Stock buying and selling
//        int buying = prices[0];
//        int selling = prices[0];
//        for(int i = 0; i < prices.length; i++){
//            if (buying < prices[i]){
//                buying = prices[i];
//            } else if(selling > prices[i]){
//                selling = prices[i];
//            }
//        }
//        System.out.println(buying);
//        System.out.println(selling);
//        System.out.println(buying - selling);
//    }

//    public static void main(String[] args) {    // fizz buzz number
//        int input = 4;
//        if(input % 3 == 0) {
//            System.out.println("Fizz");
//        } else if (input % 5 == 0) {
//            System.out.println("Buzz");
//        } else if(input % 15 == 0) {
//            System.out.println("FizzBuzz");
//        } else {
//            System.out.println("not");
//        }
//    }

//    public static void main(String[] args) {    //Factorial number
//        int num = 5;
//        int fact = 1;
//        for(int i = 1; i <= num; i++){
//            fact = fact * i;
//        }
//        System.out.println(fact);
//    }

//    public static void main(String[] args) {
//        String st = ("rotavator");
//        char[] ch = st.toCharArray();
//        for (int i = 0; i < ch.length / 2; i++) {
//            if (ch[i] == ch[ch.length-1-i]) {
//                System.out.println("Palindrome");
//            } else {
//                System.out.println("Not Palindrome");
//            }
//        }
//    }

//    public static void main(String[] args) {
//        int year = 2016;
//        if (year % 4 == 0){
//            System.out.println("Leap Year");        // Leap Year
//        } else {
//            System.out.println("Not Leap Year");
//        }
//    }

//    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 4, 5, 5, 4, 7, 3, 6};     // Reverse int array
//        for (int i = array.length-1; i >= 0; i--){
//            System.out.println(array[i]);
//        }
//    }

//    public static void main(String[] args) {    // Reverse a String
//        String st = "Programmer";
//        char[] ch = st.toCharArray();
//        for(int i = ch.length-1; i >= 0; i--){
//            System.out.print(ch[i]);
//        }
//    }

//    public static void main(String[] args) {
//        int[] numberList = {4, 3, 4, 2, 3};
//        int search = 4;
//        int count = 0;
//        for (int i = 0; i < numberList.length; i++) {     // number of occurence
//            if(search == numberList[i]){
//                count++;
//            }
//        }
//        System.out.println("Number of occurence of given number is : " + count);
//    }

//    public static void main(String[] args) {    // Fibonacci
//        int fibo = 5;
//        int a = 0;
//        int b = 1;
//        for(int i = 0; i <= fibo; i++){
//            System.out.println(a);
//            int c = a + b;
//            a = b;
//            b = c;
//        }
//    }

//    public static void main(String[] args) {    /// Armstrong Number
//        int num = 153;
//        int x = num;
//        int armstrong = 0;
//        int remainder = 0;
//        while(num > 0){
//            remainder = num % 10;
//            armstrong = (remainder*remainder*remainder) + armstrong;
//            num = num / 10;
//        }
//        if(x == armstrong){
//            System.out.println("armstrong");
//        }
//    }

    public static void main(String[] args) {
        int num = 6;
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum +i;
            }
        }
        if (num == sum) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not Perfect Number");
        }
    }



















}