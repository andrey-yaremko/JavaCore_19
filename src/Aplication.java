import java.io.*;

public class Aplication {

    public static void main(String[] args) throws Exception {
        File file = new File("employe.txt");
        File file1 = new File("employe1.txt");
        File file2 = new File("employe2.txt");
        File file3 = new File("employe3.txt");
        File file4 = new File("employe4.txt");

        Employee person1 = new Employee("Petro", 1, 5000);
        Employee person2 = new Employee("Petro", 2, 6000);
        Employee person3 = new Employee("Petro", 3, 7000);
        Employee person4 = new Employee("Petro", 4, 8000);
        Employee person5 = new Employee("Petro", 5, 9000);


        serialize(file,  person1);
        serialize(file1, person2);
        serialize(file2, person3);
        serialize(file3, person4);
        serialize(file4, person5);

        System.out.println(deserializable(file));
        System.out.println(deserializable(file1));
        System.out.println(deserializable(file2));
        System.out.println(deserializable(file3));
        System.out.println(deserializable(file4));


    }

    public static void serialize(File file, Serializable object) throws Exception {
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(object);
        oos.close();

    }

    public static Serializable deserializable(File file) throws Exception {
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        Serializable object = (Serializable) ois.readObject();
        ois.close();
        fis.close();

        return object;
    }
}

