public class report4 {
    public static void main(String[] args){
        String str = null;
        try {
            int num = str.length();
            System.out.println(num);
        }catch(NullPointerException e){
            System.out.println("NullPointerExceptionが発生しました");
            System.out.println(e.getMessage());
        }
    }
}
