import java.util.HashMap;
import java.util.List;
public class MobileShop {
    private HashMap<String,List<String> > mobiles=new HashMap<>();
    public void addMobile(String mobile){
        //Input brand:model
        //oneplus:Nord2 //add in the map withnew key and new ArrayList
        //oneplus:Nord4 ///just  add Nord4 in List
        //samsung:s23//add in the map with new key and new ArrayList
        //samsung:s24///just add s24 in corresponding list
        //vivo:v50
        //Vivo:v40
        //Iphone:17 pro max
    }
    //throw exception if brand not found
    public List<String> getPhones(String brand){ return null;}
    public static void main(String[] args) {
        MobileShop shop=new MobileShop();
        shop.addMobile("oneplus:Nord2");
    }
}
