package ss10_dsa.excercise.my_list;
public class MyListTest {
    public static void main(String[] args) {
        MyList<String> listName = new MyList<>();
        listName.add("Hoa");
        listName.add("Hưng");
        listName.add("Kiệt");
        listName.add("Nam");
        listName.add("Thái");
        System.out.println(listName);
        System.out.println(listName.getSize());
//       for (String s: listName){
//            if (s!=null){
//                System.out.println(s);
//            }
//        }
        System.out.println(listName.remove(2));
        System.out.println(listName.remove(2));
        System.out.println(listName);
        System.out.println(listName.get(2));
    }
}
