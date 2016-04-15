import java.io.IOException;

/**
 * Created by warrior on 16-4-12.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        listTest lt = new listTest();
        try {
            lt.initArrList();
            lt.GetLongestConsecutiveElem();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try{
            lt.initLinkList();
            lt.JudgeSymmetryStructure();
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("hello!!");
    }
}
