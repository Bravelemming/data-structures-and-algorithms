package utilities;

public class AnimalShelter {
    Queue<String> cats = new Queue<>();
    Queue<String> dogs = new Queue<>();

    public void enqueue(String animal){
        if (animal.equals("cat")) {
            cats.enqueue(animal);
        }
        else if (animal.equals("dog")){
            dogs.enqueue(animal);
        }
    }


    public String dequeue(String pref){
        if (pref.equals("cat")) {
            if (cats.peek() != null){
                return cats.dequeue();
            }
            else {
                return "no more cats!";
            }
        }
        else if (pref.equals("dog")){
            if (dogs.peek() != null){
                return dogs.dequeue();
            }
            else {
                return "no more dogs!";
            }
        }
        return "sorry, that's not an allowed preference.";
    }


}
