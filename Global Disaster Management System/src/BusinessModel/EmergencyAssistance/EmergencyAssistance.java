
package BusinessModel.EmergencyAssistance;

import BusinessModel.WorkQueue.WorkQueue;

/**
 *
 * @author HM
 */

public class EmergencyAssistance {
 
    private String name;
    private String id;
    private static int count;
    private WorkQueue workQueue;

    public EmergencyAssistance() {
        
        id="ORG"+(++count);
        
    }

    public String getNgoName() {
        return name;
    }

    public void setNgoName(String NgoName) {
        this.name = NgoName;
    }

  
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        EmergencyAssistance.count = count;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    @Override
    public String toString(){
        
        return name;
    }
    
    
}


