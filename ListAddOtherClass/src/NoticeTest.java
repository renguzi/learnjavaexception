import com.sun.tools.corba.se.idl.constExpr.Not;

import java.util.ArrayList;
import java.util.Date;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-05
 * @Description: PACKAGE_NAME
 * @Version:1.0
 */
public class NoticeTest {
    public static void main(String[] args) {
//        创建3条公告
        Notice notice1 = new Notice(1, "欢迎来学习Java", "admin", new Date());
        Notice notice2 = new Notice(2, "及时交作业", "班主任", new Date());
        Notice notice3 = new Notice(3, "注意考勤", "老师", new Date());

//        把公告添加到List中
        ArrayList arrayList=new ArrayList();
        arrayList.add(notice1);
        arrayList.add(notice2);
        arrayList.add(notice3);

//        从存放公告的List中，取出公告ID，title
        System.out.println("公告ID和title是：");
        for (int i = 0; i <arrayList.size() ; i++) {
            System.out.println(((Notice) (arrayList.get(i))).getId() + " " + ((Notice) (arrayList.get(i))).getTitle());
        }

//        在第1条公告后面，添加新的公告
        Notice notice4 = new Notice(4, "注意公共卫生", "管理员", new Date());
        arrayList.add(1,notice4);
        System.out.println("添加新公告后：");
        for (int i = 0; i <arrayList.size() ; i++) {
            System.out.println(((Notice) (arrayList.get(i))).getId() + " " + ((Notice) (arrayList.get(i))).getTitle());
        }
//       删除及时交作业的公告
        arrayList.remove(2);
        System.out.println("删除公告后：");
        for (int i = 0; i <arrayList.size() ; i++) {
            System.out.println(((Notice) (arrayList.get(i))).getId() + " " + ((Notice) (arrayList.get(i))).getTitle());
        }
    }
}
