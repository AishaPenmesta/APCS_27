public class StepTracker{
    private int minActiveSteps;
    private int totalSteps;
    private int activeDays;
    private int daysTracked;
public StepTracker(int minSteps){
    minActiveSteps = minSteps;
    totalSteps = 0;
    activeDays =0;
    daysTracked =0;
}
public void addDailySteps(int steps){
    daysTracked++;
    totalSteps+=steps;
    if(minSteps<=steps){
        activeDays++;
    }
}
public int activeDays(){
    return activeDays;
}
public double averageSteps(){
    if(daysTracked==0){
        return 0.0;
    }
    else{return totalSteps/daysTracked;
    }
}
}