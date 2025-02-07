package POO;

public class Airbus320 extends practicaHerencia {

 public void apagarMotor(){
     System.out.println("motor apagado");
 }

    public static void main(String[] args) {
        Airbus320 op = new Airbus320();
        op.encenderMotor();
        op.apagarMotor();
    }
}
