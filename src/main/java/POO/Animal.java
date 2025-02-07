
package POO;


public interface Animal {
    //no tiene declaracion de public, private, final igual funciona correctamente
    void ladrar();
    
    public void HacerRuido();//metodo sin implementacion
    
    default String ruido(){//metodo con implementacion "default"
        
        return "Guau,Guau";
    }

   
    
    
}
