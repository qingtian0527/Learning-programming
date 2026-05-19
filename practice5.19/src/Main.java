import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        System.out.println("请输入数字串：");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringToNum vert=new StringToNum();
        try{
            int num=vert.convert(s);
            System.out.println("该数字为合法数字串："+num);
        }catch(InvalidStringException e){
            System.out.println("错误类型为："+e.getMessage());
        }

    }
}