public class Collectable {
    // Add collectable properties here
private String color;
private int size;
private String condition;
private double cost;
private String rarity;
private int value;
    // Add collectable constructors here
Collectable(){
    this.color="";
    this.size=0;
    this.condition="";
    this.cost=0.0;
    this.rarity="";
    this.value=0;
}
Collectable(String color, int size, String condition, double cost, String rarity, int value){
    this.color=color;
    this.size=size;
    this.condition=condition;
    this.cost=cost;
    this.rarity=rarity;
    this.value=value;
}
    // Add collectable accessors and mutators here
public String getColor() {
    return this.color;
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
public int getSize() {
    return this.size;
}
public int getValue() {
    return this.value;
}
public void setColor(String color) {
    this.color = color;
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
public void setSize(int size) {
    this.size = size;
}
public void setValue(int value) {
    this.value = value;
}
    // Add any methods here
    public String toString() {
        
        return super.toString();
    }
}