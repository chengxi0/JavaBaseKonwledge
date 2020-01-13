package chengxi0.initializeandclearnup;

/**
 * @author 承夕
 * @date 2020/1/13 0013 - 20:40
 * @contact:https://github.com/chengxi0
 */
public class EnumTest {
    public static void main(String[] args) {
        EnumType enumType = EnumType.WED;
        System.out.println(enumType);
        //values()方法是静态方法，类名.方法名调用
        for (EnumType e : EnumType.values()) {
            System.out.println(e.ordinal());
            System.out.println(e);
        }
        EnumType eT = EnumType.WED;
        switch (eT) {
            case  WON:
                System.out.println("今天是星期一");
                break ;
            case TUE :
                System.out.println("今天是星期二");
                break ;
            case  WED:
                System.out.println("今天是星期三");
                break ;
            case  THU:
                System.out.println("今天是星期四");
                break ;
            case  FRI:
                System.out.println("今天是星期五");
                break ;
            case  STA:
                System.out.println("今天是星期六");
                break ;
            case  SUN:
                System.out.println("今天是星期日");
                break ;
        }
    }
}
