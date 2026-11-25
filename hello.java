
public class hello {
    public static void main(String[] args){
        Hi obj = new Hi();
        int result = obj.sum();
        System.out.println(result);
    }
    }
class Hi{
    int sum (){
        int a = 10;
        int b = 20;
        return a + b ;
    }
}