public class Collectable {
    // Add collectable properties here
private String name;
private String type;
private int rating;
private String condition;
private double cost;
private String rarity;
    // Add collectable constructors here
Collectable(){
    this.name="";
    this.type="";
    this.rating=0;
    this.condition="";
    this.cost=0.0;
    this.rarity="";
}
Collectable(String name,String type, int rating, String condition, double cost, String rarity){
    this.name=name;
    this.type=type;
    this.rating=rating;
    this.condition=condition;
    this.cost=cost;
    this.rarity=rarity;
}
    // Add collectable accessors and mutators here
public String getName() {
    return this.name;
}
public String getType() {
    return this.type;
}
public String getCondition() {
    return this.condition;
}
public double getCost() {
    return this.cost;
}
public String getRarity() {
    return this.rarity;
}
public int getRating() {
    return this.rating;
}
public void setName(String name){
    this.name=name;
}
public void setType(String type) {
    this.type = type;
}
public void setCondition(String condition) {
    this.condition = condition;
}
public void setCost(double cost) {
    this.cost = cost;
}
public void setRarity(String rarity) {
    this.rarity = rarity;
}
public void setRating(int rating) {
    this.rating = rating;
}
    // Add any methods here
    public String toString() {
    System.out.println("Name: "+this.name);
    System.out.println("Type: "+this.type);
    System.out.println("Condition: "+this.condition);
    System.out.println("Cost: "+"$"+this.cost);
    System.out.println("Rarity: "+this.rarity);
    System.out.println("Rating: "+this.rating);
        return "";
    }
    public boolean equals(Collectable c1,Collectable c2) {
        boolean equal=false;
        if(c1==c2){
            equal=true;
        }
        return equal;
    }
}