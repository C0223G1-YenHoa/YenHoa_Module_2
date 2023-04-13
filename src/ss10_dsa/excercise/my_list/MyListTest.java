package ss10_dsa.excercise.my_list;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> listName = new MyList<>();
        listName.add("Hoa");
        listName.add("Hưng");
        listName.add("Kiệt");
        listName.add("Nam");
        listName.add("Thái");
        for (Object s : listName.getElements()) {
            if (s != null) {
                System.out.print(s + ",");
            }
        }
        System.out.println(listName.remove(2));
        System.out.println(listName.remove(2));
        System.out.println(listName.get(2));
    }
}
