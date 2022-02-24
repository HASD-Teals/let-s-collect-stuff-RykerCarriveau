import java.util.ArrayList;
import java.util.List;

public class CollectionClient {
    public static void main(String[] args) throws Exception {
        // Add your collection ArrayList here..
        // e.g. List<Collectable> collection = new ArrayList<Collectable>();
List<Collectable> yugiohCollection= new ArrayList<Collectable>();
addItem(yugiohCollection,"Blue Eyes Ultimate Dragon","fusion", 8,"good",50, "Ultra Rare");
addItem(yugiohCollection,"Dark Magician","monster",10,"ok",70.45,"Ultra Rare");
addItem(yugiohCollection,"Red Eyes Black Dragon","monster",5,"great",15.20,"Ultra Rare");
displayCollection(yugiohCollection);
searchArray(yugiohCollection, "Blue Eyes Ultimate Dragon","fusion", 8,"good",50, "Ultra Rare",true,"name");
System.out.println();
searchArray(yugiohCollection, "Fake Card", "monster", 3, "bad", 0, "common",true,"name");
System.out.println();
displayCollection(yugiohCollection);
System.out.println();
searchArray(yugiohCollection, "Fake Card", "monster", 3, "bad", 0, "common",false,"name");
searchArray(yugiohCollection, "Blue Eyes Ultimate Dragon","fusion", 8,"good",50, "Ultra Rare",false,"name");
searchArray(yugiohCollection, "Blue Eyes Ultimate Dragon","fusion", 8,"good",50, "Ultra Rare",false,"type");
searchArray(yugiohCollection, "Blue Eyes Ultimate Dragon","fusion", 8,"good",50, "Ultra Rare",false,"rating");
searchArray(yugiohCollection, "Blue Eyes Ultimate Dragon","fusion", 8,"good",50, "Ultra Rare",false,"condition");
searchArray(yugiohCollection, "Blue Eyes Ultimate Dragon","fusion", 8,"good",50, "Ultra Rare",false,"cost");
searchArray(yugiohCollection, "Blue Eyes Ultimate Dragon","fusion", 8,"good",50, "Ultra Rare",false,"rarity");
searchArray(yugiohCollection, "Blue Eyes Ultimate Dragon","fusion", 8,"good",50, "Ultra Rare",false,"fake property");
itemNumber(yugiohCollection);
totalValue(yugiohCollection);
System.out.println();
displayItem(yugiohCollection,0);
removeItem(yugiohCollection,0);
displayItem(yugiohCollection,0);
displayCollection(yugiohCollection);

        // Add collection methods here to manage and manipulate the collection
        
    }
    public static List<Collectable> addItem(List<Collectable> collection, String name, String type,int rating, String condition, double cost, String rarity){
        Collectable addCollectable= new Collectable(name, type, rating, condition, cost, rarity);
        collection.add(addCollectable);;
        return collection;
    }
    public static List<Collectable> removeItem(List<Collectable> collection, int collectable){
        collection.remove(collectable);
        return collection;
    }
    public static void searchArray(List<Collectable> collection,String name, String type,int rating, String condition, double cost, String rarity,boolean Item,String property){
        if(Item==true){
            Collectable searching= new Collectable(name, type, rating, condition, cost, rarity);
            if(searching.equals(searching, collection.get(0))){
                System.out.println(searching+ "is in the collection");
            }
            else{
                System.out.println(searching+"isn't in the collection");
            }
        }
        else{
            boolean fakeProperty=true;
            Collectable findProperty;
            if(property=="name"){
                for(int i=0;i<collection.size();i++){
                    findProperty=collection.get(i);
                    if(name==findProperty.getName()){
                        fakeProperty=false;
                    }
                }
                if(fakeProperty==false){
                    System.out.println(name+ " is in the collection.");
                }
                else{
                    System.out.println(name+ " isn't in the collection");
                }
            }
            else if(property=="type"){
                for(int i=0;i<collection.size();i++){
                    findProperty=collection.get(i);
                    if(type==findProperty.getType()){
                        fakeProperty=false;
                    }
                }
                if(fakeProperty==false){
                    System.out.println(type+ " is in the collection.");
                }
                else{
                    System.out.println(type+ " isn't in the collection");
                }
            }
            else if(property=="rating"){
                for(int i=0;i<collection.size();i++){
                    findProperty=collection.get(i);
                    if(rating==findProperty.getRating()){
                        fakeProperty=false;
                    }
                }
                if(fakeProperty==false){
                    System.out.println(rating+ " is in the collection.");
                }
                else{
                    System.out.println(rating+ " isn't in the collection");
                }
        }
            else if(property=="condition"){
                for(int i=0;i<collection.size();i++){
                    findProperty=collection.get(i);
                    if(condition==findProperty.getCondition()){
                        fakeProperty=false;
                    }
                }
                if(fakeProperty==false){
                    System.out.println(condition+ " is in the collection.");
                }
                else{
                    System.out.println(condition+ " isn't in the collection");
                }
            }
            else if(property=="cost"){
                for(int i=0;i<collection.size();i++){
                    findProperty=collection.get(i);
                    if(cost==findProperty.getCost()){
                        fakeProperty=false;
                    }
                }
                if(fakeProperty==false){
                    System.out.println(cost+ " is in the collection.");
                }
                else{
                    System.out.println(cost+ " isn't in the collection");
                }
            }
            else if(property=="rarity"){
                for(int i=0;i<collection.size();i++){
                    findProperty=collection.get(i);
                    if(rarity==findProperty.getRarity()){
                        fakeProperty=false;
                    }
                }
                if(fakeProperty==false){
                    System.out.println(rarity+ " is in the collection.");
                }
                else{
                    System.out.println(rarity+ " isn't in the collection");
                }
            }
            else{
                System.out.println(property+ " is not a valid property.");
            }
        }
    }
    public static void itemNumber(List<Collectable> collection){
        int totalNumber=0;
        for(int j=0;j<collection.size();j++){
            totalNumber=j+1;
        }
        System.out.println("There is "+ totalNumber +" item(s) in the collection");
    }
    public static void totalValue(List<Collectable> collection){
        double value=0;
        Collectable currentValue;
        for(int l=0;l<collection.size();l++){
            currentValue=collection.get(l);
            value=value+currentValue.getCost();
        }
        System.out.println("The total value of the collection is $"+value);
    }
    public static void displayItem(List<Collectable> collection,int item){
        Collectable display=collection.get(item);
        System.out.println(display);
    }
    public static void displayCollection(List<Collectable> collection){
        System.out.println(collection);
    }
}
