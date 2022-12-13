package course2.transport;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {
    private final Queue<Transport> queue = new LinkedList<>();

    private void add(Transport transport){
        queue.offer(transport);
    }
    public void addPassengerCar(PassengerCars car){
        add(car);
    }
    public void addTruck(Trucks truck){
        add(truck);
    }
    public void service (){
        if(!queue.isEmpty()){
            Transport transport = queue.poll();
            boolean result = transport.passDiagnostics();
            if(!result){
                transport.fixTheCar();
            }
            service();
        } else {System.out.println("Очередь на починку машин пуста");}
    }
}
