import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by yufeng on 2020/2/6.
 */
public class Test {
    public static MyBook [] myBooks = new MyBook[200];
    public static List<MyBook>list =new ArrayList<>();
    public static void main(String[] args) {
        inputData(list);
        menu();
        //print(list);
        //searchname(list,"书名2");
        //addbook(list);
        //print(list);
    }
    public static void inputData(List<MyBook>books){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0;i<n ;i++){
            MyBook myBook = new MyBook("书名"+i,Double.valueOf(String.valueOf(i)),"出版社"+i+"号","作者"+i+"号","出版社"+i+"号");
            books.add(myBook);
        }
    }
    public static void print(List<MyBook>books){
        for(int i = 0; i<books.size();i++){
            System.out.println(books.get(i));
            menu();
        }
    }
    public static void searchname(List<MyBook>books,String name){
        for(int i = 0 ;i<books.size();i++){
            MyBook myBook = books.get(i);
            if(myBook.getName().equals(name)){
                System.out.println(books.get(i));
                menu();
                return;
            }
        }
        System.out.println("此书不存在");
        menu();
    }
    public static void deletename(List<MyBook>books,String name){
        for(int i = 0 ;i<books.size();i++){
            MyBook myBook = books.get(i);
            if(myBook.getName().equals(name)){
                books.remove(myBook);
                System.out.println("删除成功");
                menu();
                return;
            }
        }
        System.out.println("此书不存在");
        menu();
    }
    public static void addbook(List<MyBook>books){
        Scanner scanner =new Scanner(System.in);
        System.out.println("书名");
        String name=scanner.next();
        System.out.println("价格");
        Double price=scanner.nextDouble();
        System.out.println("出版社");
        String press=scanner.next();
        System.out.println("作者");
        String author=scanner.next();
        System.out.println("IBSN");
        String ibsn=scanner.next();
        MyBook mybook = new MyBook(name,price,press,author,ibsn);
        books.add(mybook);
        menu();
    }
    public static void menu(){
        System.out.println("输出菜单项请选择你要进行的操作（请输入1-4中的任一个数字）");
        System.out.println("1：添加图书");
        System.out.println("2：删除图书");
        System.out.println("3：查找图书（根据书名）");
        System.out.println("4：查看所有");
        System.out.println("5：退出");
        Scanner scanner=new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i){
            case 1:
                addbook(list);
                break;
            case 2:
                System.out.println("删除图书名");
                Scanner scanner1=new Scanner(System.in);
                String name=scanner.next();
                deletename(list,name);
                break;
            case 3:
                System.out.println("查看图书名");
                Scanner scanner2=new Scanner(System.in);
                String searchname=scanner.next();
                searchname(list,searchname);
                break;
            case 4:
                print(list);
                break;
            default:
                System.exit(1);
                break;
        }
    }
}
