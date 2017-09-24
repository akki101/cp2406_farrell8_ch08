import java.util.*;
public class DistanceFromAverage
{
    public static void main (String[] args)
    {
        double[] nums = new double[20];
        double entry, tot = 0, average;
        final int EXIT = 99999;
        int i = 0, j;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number or " +
                EXIT + " to exit: ");
        entry = input.nextDouble();
        while(entry != EXIT && i < nums.length)
        {
            nums[i] = entry;
            tot += nums[i];
            ++i;
            if(i < nums.length)
            {
                System.out.print("Enter next number or " +
                        EXIT + " to exit:  ");
                entry = input.nextDouble();
            }
        }
        if(i == 0)
            System.out.println("Average cannot be computed because no nums were entered");
        else
        {
            average = tot / i;
            System.out.println("You have entered " + i +
                    " numbers and the average is " + average);
            for(j = 0; j < i; ++j)
                System.out.println(nums[j] + " is " +
                        (nums[j] - average) + " away from the average");
        }
    }
}