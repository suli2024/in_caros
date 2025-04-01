import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Store {
  public ArrayList<Car> readCsvFile() {
    try {
      return tryReadCsvFile();
    } catch (FileNotFoundException e) {
      System.err.println(e.getMessage());
      return null;
    }
  }
  public ArrayList<Car> tryReadCsvFile() throws FileNotFoundException {
    ArrayList<Car> carList = new ArrayList<>();
    File file = new File("cars2.csv");
    try(Scanner sc = new Scanner(file)){
      sc.nextLine();
      while(sc.hasNext()) {
        String line = sc.nextLine();
        String[] array = line.split(",");
        Car car = new Car();
        car.setId(Integer.parseInt(array[0].trim()));
        car.setPlate(array[1].replace("\"", "").trim());
        car.setBrand(array[2].replace("\"", "").trim());
        car.setYear(Integer.parseInt(array[3].trim()));
        car.setPrice(Double.parseDouble(array[4]));
        carList.add(car);
      }
      return carList;
    }
    
  }
}
