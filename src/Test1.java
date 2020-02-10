import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by yufeng on 2020/2/6.
 */
public class Test1 {
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        List linkedList = new LinkedList();
        Date startarray = new Date();
        for(int i=0 ; i<100000 ; i++){
            arrayList.add(0,i);
        }
        Date endarray = new Date();
        System.out.println("ArrayList添加用时"+(endarray.getTime()-startarray.getTime()));
        Date startLinkedList = new Date();
        for(int i=0 ; i<100000 ; i++){
            linkedList.add(0,i);
        }
        Date endLinkedList = new Date();
        System.out.println("linkedList添加用时"+(endLinkedList.getTime()-startLinkedList.getTime()));

        Date startreadarray = new Date();
        for(int i=0 ; i<arrayList.size() ; i++){
            Object obj=arrayList.get(i);
        }
        Date endreadarray = new Date();
        System.out.println("arraydList读取用时"+(endreadarray.getTime()-startreadarray.getTime()));
        Date startreadlinked = new Date();
        for(int i=0 ; i<linkedList.size() ; i++){
            Object obj=linkedList.get(i);
        }
        Date endtreadlinked = new Date();
        System.out.println("linkeddList读取用时"+(endtreadlinked.getTime()-startreadlinked.getTime()));
    }
}
