import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    static ArrayList<Task> list =new ArrayList<>();
    static int pointTotal=0;
static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String userinput;
        int userinput2;
        System.out.println("Enter Task Name or enter STOP to end inputs: ");
        userinput=scanner.nextLine();
        while (!userinput.equals("STOP"))
        {System.out.println("Enter point val: ");
            userinput2=Integer.parseInt(scanner.nextLine());
            Task t= new Task(userinput2,userinput);
            list.add(t);
         System.out.println("Enter Task Name or enter STOP to end inputs: ");
         userinput=scanner.nextLine();
        }
        int index;
        while(list.size()>0){
        System.out.println("Enter Task Name to get info or enter POINTS to get accumulated points or enter STOP to end program: ");
        userinput=scanner.nextLine();
        if (userinput.equals("STOP"))
        {return;}
        if (userinput.equals("POINTS"))
        {
            System.out.println("You have " + pointTotal + " points");
        }
        else{
        index = findTaskfromName(userinput);
        if (index != -1)
        {
            System.out.println("The Task " + userinput + " is worth " + list.get(index).pointVal + " points");
            System.out.println("Has this task been completed (enter YES or NO): ");
            userinput=scanner.nextLine();
            if (userinput.equals("YES"))
            {pointTotal += list.get(index).pointVal;
            list.remove(index);}
        }
        else{
            System.out.println("Task could not be found or is already completed");
        }}}

    }
    public static void completedtask()
    {}
    public static int findTaskfromName(String taskName)
    {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).TaskName.equals(taskName))
                return i;
        }
        return -1;
    }
}
