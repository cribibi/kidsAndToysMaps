package craciun;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Kid> children= new ArrayList<>();
        ToyInnatorInterface toyInterface = new ToyInnator();

        Scanner input = new Scanner(new File("/Users/biancacricler/Documents/proiecteIT/children.csv"));
        createChildrenList(input, children);
        //metoda clasica
        //display(children);

        //metoda cu streamuri
        children.forEach(System.out::println);
        displayNoElements(children);

        Scanner inputToys = new Scanner(new File("/Users/biancacricler/Documents/proiecteIT/toys.csv"));
        ArrayList<Toy> toylist= new ArrayList<>();

        createToylist(inputToys, toylist);
        //metoda clasica
        //display(toylist);

        //metoda cu streamuri
        toylist.forEach(System.out::println);

        displayNoElements(toylist);

        Map<Kid,Toy> myMap= toyInterface.givePresents(children,toylist);
        System.out.println(myMap);
    }

    public static void createChildrenList(Scanner input, ArrayList<Kid> children){
        while (input.hasNext()){
            String line = input.nextLine();
            String[] fields = line.split(";");
            String lastName = fields[0];
            String firstName = fields[1];
            String gender= fields[2];
            String age1=fields[3];
            String good1=fields[4];
            int age=Integer.parseInt(age1);
            boolean good=Boolean.parseBoolean(good1);
            Kid anotherKid = new Kid(lastName,firstName, gender, age, good);
            children.add(anotherKid);
        }

    }
    public static void createToylist(Scanner inputToys, ArrayList<Toy> toylist){
        while (inputToys.hasNext()){
            String line = inputToys.nextLine();
            String[] fieldsToys = line.split(";");
            String name = fieldsToys[0];
            String gender = fieldsToys[1];
            String ageMin1=fieldsToys[2];
            String ageMax1=fieldsToys[3];
            int ageMin=Integer.parseInt(ageMin1);
            int ageMax=Integer.parseInt(ageMax1);
            Toy anotherToy = new Toy(name, gender, ageMin, ageMax);
            toylist.add(anotherToy);
        }

    }

//    public static <T> void display(ArrayList <T> lista){
//        for(T element : lista) {
//            System.out.println(element);
//        }
//    }


    public static void displayNoElements(ArrayList lista){
//        System.out.println("---------------------------------------------");
//        System.out.println("1There are: " + lista.size()+ " elements in this list");

        System.out.println("---------------------------------------------");
        long count = lista.stream().count();
        System.out.printf("There are %d elements in this list %n", count);
        System.out.println("---------------------------------------------");

    }





}
