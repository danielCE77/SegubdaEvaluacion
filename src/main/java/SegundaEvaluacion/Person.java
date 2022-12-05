
package SegundaEvaluacion;

/**
 *
 * @author DANIC
 */
public class Person {
    private String Name;
    private int group;

    
    public Person(String Name, int group){
        this.Name=Name;
        this.group = group;
    }

    public String getName() {
        return Name;
    }

    public int getGroup() {
        return group;
    }
    
}
