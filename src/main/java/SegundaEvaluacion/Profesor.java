
package SegundaEvaluacion;

/**
 *
 * @author DANIC
 */
public class Profesor extends Person{
    private int NumberSubjects =2;
    
    public Profesor(int NumberSubjects, String Name, int group){
        super(Name, group);
        this.NumberSubjects = NumberSubjects;
    }
}
