package academy.everyonecodes.java.evaluation2.optionals.sets;

import java.util.HashSet;
import java.util.Set;

public class ViewCounter {

    private Set<String> views;

    public void addViewerIPAddress(String IPAddress){
        Set<String> view = new HashSet<>();
        view.add(IPAddress);
    }
    public int countUniqueViews(){
        int size = views.size();
        return size;
    }
}
