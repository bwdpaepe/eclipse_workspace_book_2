package domein;

import java.util.Comparator;
    
public class Vergelijk_naam_voornaam implements Comparator<Student>
{
    //sorteren op naam en bij gelijke naam op voornaam
    @Override    
    public int compare(Student o1, Student o2)
    {
       int res = o1.getNaam().compareTo( o2.getNaam() );
       if(res==0)
           res = o1.getVoornaam().compareTo( o2.getVoornaam() );
       return res;
    }  
    
}
