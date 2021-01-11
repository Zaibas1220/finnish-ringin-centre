import java.util.*;

public class RingingCentre {

    private Map<Bird, Set<String>> observation;

    public RingingCentre() {
        observation = new HashMap<>();
    }

    //metodo observe che crea o aggiunge avvistamenti
    public void observe(Bird bird, String place) {
        observation.putIfAbsent(bird, new HashSet<>());
        observation.get(bird).add(place);
    }

    //metodo observations che ritorna la lista di osservazioni per un Bird
    public void observations(Bird bird) {
        if (observation.get(bird)!=null) {
            System.out.println(bird.toString() + " observations: " + observation.get(bird).size());
            for (String place : observation.get(bird)) {
                System.out.println(place);
            }
        } else {
            System.out.println(bird.toString() + " observations: 0");
        }
    }

}
