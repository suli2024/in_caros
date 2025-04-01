public class Car {
  //Adattagok
  private Integer id;
  private String plate;
  private String brand;
  private Integer year;
  private Double price;

  //Konstruktorok
  public Car() {}

  public Car(Integer id, String plate, String brand, Integer year, Double price) {
    this.id = id;
    this.plate = plate;
    this.brand = brand;
    this.year = year;
    this.price = price;
  }

  public Car(String plate, String brand, Integer year, Double price) {
    this.plate = plate;
    this.brand = brand;
    this.year = year;
    this.price = price;
  }

  //Plusz metódus:

  //Getters and Setters:
  //Lekérdező getter:
  public Integer getId(){
    return this.id;
  }
  //beállító setter
  public void setId(Integer id) {
    this.id = id;
  }
  public String getPlate() {
    return plate;
  }
  public void setPlate(String plate) {
    this.plate = plate;
  }
  public String getBrand() {
    return brand;
  }
  public void setBrand(String brand) {
    this.brand = brand;
  }
  public Integer getYear() {
    return year;
  }
  public void setYear(Integer year) {
    this.year = year;
  }
  public Double getPrice() {
    return price;
  }
  public void setPrice(Double price) {
    this.price = price;
  }
  
}
