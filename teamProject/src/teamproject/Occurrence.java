/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamproject;

/**
 *
 * @author paulbutler
 */
public class Occurrence {
    private String activityName;
    private int duration;
    private String[] predecessors;
    private int currentSize;
    
    public Occurrence(String activityName, int duration, String[] predecessors) {
        this.activityName = activityName;
        this.duration = duration;
        this.predecessors = predecessors;
        this.currentSize = this.predecessors.length;
    }
    
    public String getActivityName() {
        return activityName;
    }
    
    public void setActivityName(String newActivityName) {
        this.activityName = newActivityName;
    }
    
    public int getDuration() {
        return duration;
    }
    
    public void setDuration(int newDuration) {
        this.duration = newDuration;
    }
    
    public String[] getPredecessors() {
        return predecessors;
    }
    
    public void setPredecessors(String[] newPredecessors) {
        this.predecessors = newPredecessors;
    }
    
    public void addPredecessors(String newPredecessor) {
        this.predecessors[currentSize++] = newPredecessor;
    }
}
