import java.util.ArrayList;

public class UsedCarLot {
    private ArrayList<Car> inventory;

    public  UsedCarLot(){
        inventory = new ArrayList<Car>();
    }

    public ArrayList<Car> getInventory(){
        return inventory;
    }

    public void addCar(Car car){
        inventory.add(car);
    }

    public boolean swap(int index1, int index2){
        if((index1 > -1 && index1 < inventory.size()) && (index2 > -1 && index2 < inventory.size())){
            Car holder = inventory.set(index1, inventory.get(index2));
            inventory.set(index2, holder);
            return true;
        }
        return false;
    }

    public void addCar(int indexToAdd, Car carToAdd) {
        inventory.add(indexToAdd, carToAdd);
    }

    public Car sellCarShift(int indexOfCarToSell) {
        Car soldCar = inventory.remove(indexOfCarToSell);
        return soldCar;
    }

    public Car sellCarNoShift(int indexOfCarToSell) {
        Car soldCar = inventory.get(indexOfCarToSell);
        inventory.set(indexOfCarToSell, null);
        return soldCar;
    }

    /* moves Car located at index indexOfCarToMove to index destinationIndex;
       all other cars in the inventory should shift accordingly

       PRECONDITIONS: indexOfCarToMove < inventory.size()
                      destinationIndex < inventory.size()
     */
    public void moveCar(int indexOfCarToMove, int destinationIndex) {
        Car moveCar = inventory.remove(indexOfCarToMove);
        inventory.add(destinationIndex, moveCar);
    }

}
