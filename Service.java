package Server021221;

import java.util.ArrayList;
import java.util.List;

public class Service<T> {
    /*
    לכתוב מתודה שמקבלת מערך שהאיברים הם מטיפוס גנרי
    תחזירו רשימה של איברים גנריים
     */

    public List<T> Generics(T[] array){
        List list = new ArrayList();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        return list;
    }


}
