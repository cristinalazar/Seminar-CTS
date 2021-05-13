package clase;

public class Manager extends ManagerSalaDeSport{
    public void anuntaMeci(String tipMeci) {
        super.notificaObservator("Va avea loc un meci de: " + tipMeci);


    }
}
