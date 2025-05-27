import java.io.FileWriter;

public class write {
    public static void main(String[] args) {
        try{
            FileWriter fw=new FileWriter("output.txt");
            fw.write("Hello java");
            fw.close();
            System.out.println("success");
        }catch(Exception e){
            System.out.println("Something fissy");
        }
        
    }
}
