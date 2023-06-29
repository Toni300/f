package object_oriented;

public class Garajecar {
    private String ModelCar = "mg";
    private int CarMails = 20000;
    private Boolean CareCar = true;
    private String CRT ="12:56";


    public int getCarMails() {
        return CarMails;
    }

    public Boolean getCareCar() {
        return CareCar;
    }

    public String getCRT() {
        return CRT;
    }

    public void setModelCar(String modelCar) {
        this.ModelCar = modelCar;
    }

    public void setCarMails(int carMails) {
        this.CarMails = carMails;
    }

    public void setCareCar(Boolean careCar) {
        this.CareCar = careCar;
    }

    public void setCRT(String CRT) {
        this.CRT = CRT;
    }

    public String getModelCar(){
        return ModelCar;
    }
    public void print(){

    }

}
