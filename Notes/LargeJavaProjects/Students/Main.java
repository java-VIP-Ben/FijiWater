//imports 
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Create an arraylist of students called classroom
        //Add at least 9 students
        //creating the array list "classroom"

        ArrayList<Student> classroom = new ArrayList<Student>();
        
        //adding 9 students
        classroom.add(new Student("Ty", 9));
        classroom.add(new Student("Zander", 0));
        classroom.add(new Student("Brucken", 10));
        classroom.add(new Student("Ben", 7));
        classroom.add(new Student("Pohl", 5));
        classroom.add(new Student("Steckler", 107));
        classroom.add(new Student("Owen", 50));
        classroom.add(new Student("Sam", 1));
        classroom.add(new Student("Landon", 82));
        classroom.add(new Student("Steckler", 107)); // duplicate steckler

        //printing the class of students without the crummy formating and operator brackets
        printClass(classroom);

        //finding out the maximum, minimum, and average grades. Turn these into letter grades.
        System.out.printf("Lowest Student: %s\n" , minumumGrade(classroom));
        System.out.printf("Highest Student: %s\n" ,maximumGrade(classroom));
        System.out.printf("Average Percent: %s\n" ,averageGrade(classroom));

        //Modify print statments to make sure thay are title case
        printTitleCase(classroom);

        //find the standard deviation in the scores
        System.out.print(stdev(classroom));

        //find duplicate students
        duplicate(classroom);

        //find mode of the score
        modeScore(classroom);
        
    }

    public static void printClass(ArrayList<Student> arr) {
        //output will be each student
        for(int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }

    public static String minumumGrade(ArrayList<Student> arr) {
        //setting the minumum name and grade, idk what these do tbh
        int minGrade = Integer.MAX_VALUE;
        String minName = "";

        for(int i = 0; i < arr.size(); i++) {
            String curName = arr.get(i).getName();
            int curGrade = arr.get(i).getGrade();

            //comparing curgrade to original grade
            if(curGrade < minGrade) {
                minGrade = curGrade;
                minName = curName;
            }  
        }
        return minName;
    }

    public static String maximumGrade(ArrayList<Student> arr) {
        //same as above but with max instead of min
        int maxGrade = Integer.MIN_VALUE;
        String maxName = "";
        for(int i = 0; i < arr.size(); i++) {
            String curName = arr.get(i).getName();
            int curGrade = arr.get(i).getGrade();
            if(curGrade > maxGrade) {
                maxGrade = curGrade;
                maxName = curName;
            }   
        }
        return maxName;
    }

    public static double averageGrade(ArrayList<Student> arr) {
        //summing up all the grades in arraylist then dividing by size of arraylist
        int average = 0;
        for(int i = 0; i < arr.size(); i++) {
            average += arr.get(i).getGrade();
        }
       //int/int -> double
        average = average/arr.size();
        return average;
    }

    public static void printTitleCase(ArrayList<Student> arr) {
        for(int i = 0; i < arr.size(); i++) {
            //capitalize first letter of each word
            String curName = arr.get(i).getName();
            curName = curName.substring(0,1).toUpperCase() + curName.substring(1);
            System.out.println(curName);
        }
    }

    public static Double stdev(ArrayList<Student> arr) {
        //standard deviation formula: sqrt((sumOfSquares - (average * average)) / n)
        double mean = Double.valueOf(averageGrade(arr));
        double totalDev = 0; // Total deviation in the population
        for(int i = 0; i < arr.size(); i++) {
            totalDev = Math.pow(arr.get(i).getGrade() - mean, 2); //taking the total deviation and setting it equal to the grade, minus the mean average of all of the grades.
        }
        return Math.sqrt(totalDev/arr.size());
    }

    public static void duplicate(ArrayList<Student> arr) {
        ArrayList<String> names = new ArrayList<String>();
        for(int i = 0; i != arr.size(); i++) {
            if(names.contains(arr.get(i).getName())) {
                System.out.println(arr.get(i).getName());
                arr.remove(i);
            } else {
                names.add(arr.get(i).getName()); //adding the current name to namesAL

            }
        }
    }

    public static int modeScore(ArrayList<Student> arr){
        //finding the most frequent number
        //find the unique values....
        ArrayList<Integer> uniqueList = new ArrayList<Integer>();
        uniqueList=removeDuplicates(arr);

        //create a list of 0's that will count the amount of items in unique list
        ArrayList<Integer> countList = new ArrayList<Integer>();
        // countList=createArrayList(new int[uniqueList.size()]);
        //for each for loop
        for(int n: uniqueList){            //for(item in uniqueList)
             countList.add(0);
        }

        //iterate through the uniqueList and count the frequency...
        for(int n:uniqueList){
             int c = count(arr,n);
             countList.set(uniqueList.indexOf(n),c);
        }

        //find the max value in the countList
        int modeValue = maxIntAL(countList);

        //set mode to the index of uniqueList[countList]
        int mode = uniqueList.get(countList.get(modeValue));

        return mode;
   }
}

