import java.util.ArrayList;
class Order {

    public String name;
    public double total;
    public boolean ready;
    public ArrayList<Item> items = new ArrayList<Item>();

    public Order() {}

    public ArrayList getItems() {
        return items;
    }
    
    public void addItems(Item item) {
        items.add(item);
    }
    // public void setName(String name){
    //     this.name = name;
    // }
    // public String getName(){
    //     return name;
    // }

    // public void setTotal(double total){
    //     this.total = total;
    // }
    // public double getTotal(){
    //         return total;
    // }

    // public void setReady(boolean ready){
    //     this.ready = ready;
    // }
    // public boolean getReady(){
    //         return ready;
    // }

    // public void setArrayList(ArrayList<Item> items){
    //     this.items = items;
    // }
    // public ArrayList<Item> getArrayList(){
    //         return items;
    // }


}