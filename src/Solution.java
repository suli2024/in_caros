import java.util.ArrayList;

public class Solution {
  Store store = new Store();
  ArrayList<Car> carList = store.readCsvFile();
  
  public Solution() {}

  public void sumSalary() {
    double sum = 0.0;
    for(Car car : carList) {
      sum += car.getPrice();
    }
    System.out.printf("Összeg: %.2f\n", sum);
  }
  //Hány darab Lada van
  public void task02() {
    int counter = 0;
    for(Car car : carList) {
      if(car.getBrand().equals("Lada")) {
        counter++;
      }
    }
    System.out.printf("Ladák száma: %d\n", counter);
  }
  //Citroen van?
  public void task03() {
    int n = carList.size();
    String ker = "Citroen";
    int i = 0;
    while(i<n && !carList.get(i).getBrand().equals(ker) ) {
      i++;
    }
    if(i<n) {
      System.out.println("Van " + ker);
    }else {
      System.out.println("Nincs " + ker);
    }
  }

  //Hányadik helyen van a Citroen?
  public void task04() {
    String ker = "Citroen";
    int i = 0;
    while(!carList.get(i).getBrand().equals(ker) ) {
      i++;
    }    
    System.out.println("Hányadik helyen: " + (i + 1));
    
  }
  //Lada keresése?
  public void task05() {
    int n = carList.size();
    String ker = "Lada";
    int i = 0;
    while(i<n && !carList.get(i).getBrand().equals(ker) ) {
      i++;
    }
    if(i<n) {
      System.out.println("Van " + ker + ". Indexe: " + i);
    }else {
      System.out.println("Nincs " + ker);
    }
  }
  //A Ladák kiválogatása másik listába
  public void task06() {
    ArrayList<Car> ladaList = new ArrayList<>();
    
    for(Car car: carList) {
      if(car.getBrand().equals("Lada")){
        ladaList.add(car);
      }
    }
    //int j = 0; for(int i=0; i<carList.size(); i++) {}
    kiirLista(ladaList);
  }

  public void kiirLista(ArrayList<Car> list) {
    for(Car car: list) {
      System.out.println(car.getPlate() + " " + car.getBrand());
    }
  }
}
