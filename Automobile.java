public class Automobile {
    String type;
    String make;
    String model;
    int year;

    //constructor

    public Automobile(String type, String make, String model, int year){
        this.type=type;
        this.make=make;
        this.model=model;
        this.year=year;
    }
    //Get methods
    public String getType(){return type;}
    public String getMake(){return make;}
    public String getModel(){return model;}
    public int getYear(){return year;}
// set methods
    public void setType(String newType){this.type=newType;}
    public void setMake(String newMake){this.make=newMake;}
    public void setModel(String newModel){this.model=newModel;}
    public void setYear(int newYear){ this.year=newYear;}

    //main App
    public static void main(String [] args){
        Automobile A1= new Automobile("Truck","Ford", "F-150", 2019);

        System.out.println(A1.getYear());
        System.out.println(A1.getMake());
        System.out.println(A1.getModel());
        System.out.println(A1.getType());

        A1.setType("Car");
        A1.setMake("Honda");
        A1.setModel("Accord");
        A1.setYear(2024);


        //return after setting new values

        System.out.println(A1.getYear());
        System.out.println(A1.getMake());
        System.out.println(A1.getModel());
        System.out.println(A1.getType());

    }
}
