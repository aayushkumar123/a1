package debugtutorial;

public class Debugavgcalc {
    public static void main(String[] args)
    {
        System.out.println("avg calculation");
    int[] inputnumberarray={10,20,30};
    double avg=calculateaverage(inputnumberarray);
    System.out.println(avg);
    }
    public static double calculateaverage(int[] input) {
        double result = 0;
        for (int element : input) {
            result += element;
        }
  result=result/input.length;
        return result;
    }
    }