public class demo {
    public static void main(String[]args){
        String s="abh";
        int sum=1;
        for(int i=1;i<s.length();i++){
            //char ch=s.charAt(i);
            sum=sum*i;

        }
        System.out.println(sum);
    }
}
