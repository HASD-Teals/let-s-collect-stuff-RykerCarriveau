import java.util.ArrayList;
import java.util.List;

public class CollectionClient {
    public static void main(String[] args) throws Exception {
        // Add your collection ArrayList here..
        // e.g. List<Collectable> collection = new ArrayList<Collectable>();
List<Collectable> yugiohCollection= new ArrayList<Collectable>();
addItem(yugiohCollection,"Blue Eyes Ultimate Dragon","fusion", 8,"good",50, "Ultra Rare");
System.out.println(yugiohCollection);
searchArray(yugiohCollection, "Blue Eyes Ultimate Dragon","fusion", 8,"good",50, "Ultra Rare",true);
removeItem(yugiohCollection,0);
System.out.println(yugiohCollection);
        // Add collection methods here to manage and manipulate the collection
        
    }
    public static List<Collectable> addItem(List<Collectable> collection, String name, String type,int rating, String condition, double cost, String rarity){
        Collectable addCollectable= new Collectable(name, type, rating, condition, cost, rarity);
        collection.add(addCollectable);
        return collection;
    }
    public static List<Collectable> removeItem(List<Collectable> collection, int collectable){
        collection.remove(collectable);
        return collection;
    }
    public static void searchArray(List<Collectable> collection,String name, String type,int rating, String condition, double cost, String rarity,boolean Item){
        if(Item==true){
            Collectable searching= new Collectable(name, type, rating, condition, cost, rarity);
            if(searching.equals(searching, collection.get(0))){
                System.out.println(searching+ "is in the collection");
            }
            else{
                System.out.println(searching+"isn't in the collection");
            }
        }
    }
}
