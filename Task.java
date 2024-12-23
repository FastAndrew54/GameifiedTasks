public class Task {
    int pointVal;
    String TaskName;
    public Task(int pointVal, String taskName)
    {
        if (!taskName.equals("") && !(taskName.charAt(0) ==' '))
        {TaskName=taskName;
        this.pointVal=pointVal;
        }
        else{
            System.out.println("Invalid task name");
        }
    }
    public int getpointval()
    {return pointVal;}
    public String getTaskName()
    {return TaskName;}
    public void reassignpointval(int val)
    {
        pointVal=val;
    }

}
