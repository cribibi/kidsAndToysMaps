package craciun;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class ToyInnator implements ToyInnatorInterface {
    private Object Kid;
    private Object Toy;

    public HashMap<Kid, Toy> givePresents(List<Kid> children, List<Toy> toyslist) {
        HashMap<Kid, Toy> giftMap = new HashMap<>();

        for (int i = 0; i < (children.size() - 1); i++) {
            if (children.get(i).good) {
                int randomIndexToy = (int) (Math.random() * toyslist.size() - 1);
                while (!hasProperToy(children, i, toyslist, randomIndexToy)){
                    randomIndexToy = (int) (Math.random() * toyslist.size() - 1);
                }
                giftMap.put(children.get(i), toyslist.get(randomIndexToy));
            }else {
                System.out.println(children.get(i) + "- Naughty child");
            }
        }
        return giftMap;
    }

    public boolean hasProperToy(List<Kid> children, int i, List<Toy> toyslist, int randomIndexToy) {
        if (((children.get(i).getGender().equalsIgnoreCase(toyslist.get(randomIndexToy).gender) == true))
                && ((children.get(i).getAge() >= toyslist.get(randomIndexToy).minAge) &&
                ((children.get(i).getAge()) <= toyslist.get(randomIndexToy).maxAge))) {
            return true;
        } else {
            return false;
        }
    }
}


