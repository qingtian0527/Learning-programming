public class StringToNum {
    public static int convert(String input) throws InvalidStringException{
        if(input==null||input.equals("")){
            throw new InvalidStringException("该字符串为空");
        }
        for(int i=0;i<input.length();i++){
            char c=input.charAt(i);
            if(c=='-'&&i==0) {
                continue;
            }
            if(c<'0'||c>'9'){
                throw new InvalidStringException("出现非数字字符");
            }
        }
        int num=Integer.parseInt(input);
        if(num<0){
            throw new InvalidStringException("该字符串小于零");
        }
        return num;
    }
}
