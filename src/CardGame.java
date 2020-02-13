import java.util.*;

/**
 * Created by yufeng on 2020/2/13.
 */
public class CardGame {
    public static void main(String[] args) {
        //输入游戏人数
        Scanner scanner =new Scanner(System.in);
        int playernumber = scanner.nextInt();
        if(playernumber<12||playernumber>18){
            System.out.println("游戏人数不合理");
        }else {
            //符合游戏人数后进行发牌
            //定义三个集合list
            //1.根据游戏人数得出的发牌列表all
            //2.除盗贼外玩家的列表
            //3.底牌列表
            List<String> all=new ArrayList<>();
            List<String> play=new ArrayList<>();
            List<String> di=new ArrayList<>();
            init(all);
            pai(all,playernumber);

            all.remove(14);
            play.add("盗贼");
            dipai(all,di);
            play.addAll(all);
            Collections.shuffle(play);
            for(int i =1;i<=playernumber;i++){
                System.out.println(i+"号玩家身份："+play.get(i-1));
            }
            System.out.println("盗贼身份底牌"+di);
        }
    }
    //游戏初始人数12人，配置初始标准，追加人数时，追加角色
    public static void init(List<String>list){
        for(int i=0;i<4;i++){
            list.add("狼人");
        }
        for(int i=0;i<4;i++){
            list.add("村民");
        }
        list.add("预言家");
        list.add("女巫");
        list.add("丘比特");
        list.add("守护");
        list.add("猎人");
        list.add("村长");
        list.add("盗贼");
    }
    public static void pai(List<String>list,int playernumber){
        if(playernumber>12)
            list.add("村民");
        if(playernumber>13)
            list.add("替罪羊");
        if(playernumber>14)
            list.add("狼人");
        if(playernumber>15)
            list.add("村民");
        if(playernumber>16)
            list.add("村民");
        if(playernumber>17)
            list.add("吹笛者");
    }
    //盗贼底牌
    public static void dipai(List<String>list,List<String>di){
        while (di.size()<3){
            Random random=new Random();
            int index=random.nextInt(list.size());
            if(di.contains("狼人")&&list.get(index).equals("狼人"))
                continue;
            else
                di.add(list.remove(index));
        }
    }
}
