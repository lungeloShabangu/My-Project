/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterations;

/**
 *
 * @author User
 */
public class myClass {
    //1 finding the highest value in an array
    public int findLargentnumber(int[] myArr){
        
        int highest=0;
        for(int i=0; i<=myArr.length-1;i++){
            if(myArr[i]>highest)
                highest=myArr[i];
        }
        return highest;
    }
    //2 finding the second largest value in an array
    public int findSecondLargest(int arrNum[]){
      int LargestNum = 0;
            int largestPos = 0;
            int SecondLargestNum = 0;

            for (int i = 0; i < arrNum.length; i++)
            {
                if (arrNum[i] > LargestNum)
                {
                    LargestNum = arrNum[i];
                    largestPos = i;
                }
            }

            for (int j = 0; j < arrNum.length; j++)
            {
                if (arrNum[j] > SecondLargestNum)
                {
                    if (j != largestPos)
                    {
                        SecondLargestNum = arrNum[j];
                    }
                }
            }
            return SecondLargestNum;
    }
    
    //3 Finding checking if a value is in an array
    public String contains(int[] myArr, int number){
          for (final int i : myArr) {
            if (i == number) {
            return " exists in the array";
          }
    }
    return " doesn't exist in an array";
    }
    
   //4 finds the value with maximum occurences 
   public int occurence(int myArr[],int number){
        	int res = 0;  
		for (int i=0; i<myArr.length; i++) 
			if (number == myArr[i])
			res++; 
		return res; 
    }
        
        //5  finds the maximum occurence of a number
   	public int maxRepeating(int arr[]) 
	{ 
		// find the max frequency using linear 
		// traversal 
		int max_count = 1, res = arr[0]; 
		int curr_count = 1; 
		
		for (int i = 1; arr.length-1 >= i; i++) 
		{ 
			if (arr[i] == arr[i - 1]) 
				curr_count++; 
			else
			{ 
                            if (curr_count > max_count) 
                            { 
					max_count = curr_count; 
					res = arr[i - 1]; 
				} 
				curr_count = 1; 
			} 
		}
		// If last element is most frequent 
		if (curr_count > max_count) 
		{ 
			max_count = curr_count; 
			res = arr[arr.length - 1]; 
		} 
	
		return res; 
        } 
        
        //6 method to count spaces in a string
        public int countSpaces(String Name){
            int count =0;
            for(int i=0;i<Name.length()-1;i++){
                if(Character.isWhitespace(Name.charAt(i)))
                count+=1;
            }
         return count;
        }  
        
        //7 Method for counting number of words in a sentence
        public int countWords(String sentence){
            if(sentence == null || sentence.isEmpty()){
                return 0;
            }
            String[] numWords= sentence.split("\\s+");
            return numWords.length;
        }
        
        //8 Method to replace all spaces with underscore
        public void replaceSpaces(String myString)
        {
        // Replace letter with underscore.
            String result = myString.replace(' ', '_');
            System.out.println(result);

        }
        
        //9 Sorting an array in ascending order
        public int[] sortArray(int[] nonSortedArray)
        {
             int[] sortedArray = new int[nonSortedArray.length];
        int temp;

        for (int i = 0; i < nonSortedArray.length - 1; i++) {
            if (nonSortedArray[i] > nonSortedArray[i + 1]) {
                temp = nonSortedArray[i];
                nonSortedArray[i] = nonSortedArray[i + 1];
                nonSortedArray[i + 1] = temp;
                sortedArray = nonSortedArray;
            }
        }
        return sortedArray;
        }
        
        //10 Finding all even numbers in array
        public int findEven(int[] myArr){
            
            int evenNum=0;
            for(int x =0; x<myArr.length;x++){
                if(myArr[x]%2==0)
                    evenNum+=myArr[x];
                System.out.println(evenNum);
            }
            return evenNum;
        }
        
        //11 Generating a fibonacci series from 1 to N
        //every number after the first two is the sum of the two preceding ones 
        public void generateFibonacci(int n){
            int t1 = 0, t2 = 1;
            int sum=0;
            while (t1 <= n)
            {
                sum = t1 + t2;
                t1 = t2;
                t2 = sum;
                System.out.println(sum);
            }
        }
        
        //12 Reversing a string
        public void reverseString(String strOriginal)
        {
		char[] temparray = strOriginal.toCharArray(); 
		int left, right=0; 
		right = temparray.length-1; 

		for (left=0; left < right ; left++ ,right--) 
		{ 
			// Swap values of left and right 
			char temp = temparray[left]; 
			temparray[left] = temparray[right]; 
			temparray[right]=temp; 
		} 
		for (char c : temparray) 
                    System.out.print(c); 
		System.out.println(); 
        }
        
        //13 Converting numeric value "1234" to 1234
        public int convertString(String myInput){
            int number= Integer.parseInt(myInput);
            return number;
        }
        
        //14 Find the sum of odd numbers from one to n
        public int findSumOfOddNumbersInArray(int num){
            int sumOdd=0;
            for(int i =1; i <=num;i++){
                if(i % 2 != 0)
                    sumOdd+=i;
            }
            return sumOdd;
           
        }
        
        //15 Finding number of number
        public int findNumberOfDigits(int num){
            int count = 0;     
            while(num != 0)
            {
                // num = num/10
                num /= 10;
                ++count;
            }
            return count;
        }
        
        //16 Claculating the sum of digits in a number
        public int sumOfDigits(int num){
            int sum=0;
            while (num > 0) {
                 sum = sum + num % 10;
                 num = num / 10;
             }
             return sum;
        }
        
        //17 Reversing number
        public void reverseNumber(int num){
           reverseString(Integer.toString(num));
        }
        
        //18 Swapping first and last digit
        public void swapFirstAndLast(int number){
                int result = 0;
                int place = 1;
                while (number > 9) {
                    result += place * 10 * (number % 10);
                    number /= 10;
                    result += place * (number % 10);
                    number /= 10;
                    place *= 100;
                }
              System.out.println(result);
        }
        
        //19 Check if alphabe is vowl or consonent
        public String VowelCheck(char alphabet)
        {
            switch (alphabet)
            {
                case 'A':
                case 'a':
                case 'E':
                case 'e':
                case 'I':
                case 'i':
                case 'O':
                case 'o':
                case 'U':
                case 'u':
                    {
                        return "Vowel";
                    }
                default:
                    {
                        return "Consonent";
                    }
            }
        }
        
        //20 Find the maximum difference between two consecutive items in an array of numbers
        public int findMaxDifferenceBtwnTwoConsequtives(int[] myArr){
            
            int difference = 0;
            int maxiDifference = 0;
            for (int i = 0; i < myArr.length-1; i++)
            {
                difference = myArr[i + 1] - myArr[i];

                if (difference > maxiDifference)
                {
                    maxiDifference = difference;
                }
            }
            return maxiDifference;
        }
}