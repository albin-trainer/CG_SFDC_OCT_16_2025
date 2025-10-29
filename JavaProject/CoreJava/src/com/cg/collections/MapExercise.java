import java.util.HashMap;
import java.util.List;

public class MapExercise {
    public static void main(String[] args) {
        MyMapData mymap=new MyMapData();
        mymap.addData("color", "Red");
        mymap.addData("color", "Blue");
        mymap.addData("breakfast","Dosa" );
        mymap.addData("breakfast","Vada" );
    }
}

class MyMapData{
    private HashMap<String,List<String>> map=new HashMap<>();

    public void addData(String k,String v){

    }
}
