import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.*;

import static java.util.Collections.sort;

/**
 * Created by warrior on 16-4-12.
 */
public class listTest {
    private List<Integer> list_arr = new ArrayList<Integer>();
    private List<Integer> list_link = new LinkedList<Integer>();
    /**
     * description: input int array list
     * input:
     *  none
     * output:
     *  none
     */
    public void initArrList() throws IOException {
        BufferedReader read_one = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("please input 'end' to quit!");
        do{
            str = read_one.readLine();
            if(str.equals("end"))
            {
                break;
            }
            else
            {
                this.list_arr.add(Integer.valueOf(str).intValue());
                System.out.println(str);
            }

        }while(true);
    }

    /**
     * description: input int link list
     * input:
     *  none
     * output:
     *  none
     */
    public void initLinkList() throws IOException{
        BufferedReader read_one = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("please input 'end' to quit");
        do{
            str = read_one.readLine();
            if(str.equals("end"))
            {
                break;
            }
            else
            {
                this.list_link.add(Integer.valueOf(str).intValue());
                System.out.println(str);
            }
        }while (true);
    }

    /**
     * description: judge symmetry structure
     * input:
     * none
     * output:
     *  none
     */
    public  void JudgeSymmetryStructure()
    {
        Integer sizeoflist=0;
        Integer sum = 0;
        ListIterator<Integer> n_iter;
        ListIterator<Integer> p_iter;
        sizeoflist = this.list_link.size();
        System.out.println(sizeoflist);
        if((float)sizeoflist/2 > sizeoflist/2){
            System.out.println("lala");
            n_iter = this.list_link.listIterator(1 + sizeoflist/2);
            p_iter = this.list_link.listIterator(sizeoflist/2);
        }
        else {
            System.out.println("lulu");
            n_iter = this.list_link.listIterator(sizeoflist/2);
            p_iter = this.list_link.listIterator(sizeoflist/2);
        }
        while ((n_iter.hasNext())&&(p_iter.hasPrevious())){
            sum=0;
//            System.out.println(Integer.toString(n_iter.next())+ "&&" +
//                    Integer.toString(p_iter.previous()));
            sum+=n_iter.next();
            sum-=p_iter.previous();
            if(sum == 0)
                continue;
            else {
                System.out.println("False");
                return;
            }
        }
        if((sum != 0) | (n_iter.hasNext()) | (p_iter.hasPrevious())){
            System.out.println("False");
            return;
        }
        System.out.println("True");
    }


    /**
     * description: get longest consecutive elements
     * input:
     * none
     * output:
     *  none
     */
    public void GetLongestConsecutiveElem()
    {
        List<Integer> buf_F = new ArrayList<Integer>();
        List<Integer> buf_S = new ArrayList<Integer>();
        ListIterator<Integer> iter_F;
        ListIterator<Integer> iter_S;
        Iterator iter_M;
        Integer tmp = 0;
        Integer tmp_last = 0;
        Integer max_consecutive_length = 0;
        Integer cur_consecutive_length = 0;
        sort(this.list_arr);
        iter_M = this.list_arr.listIterator();
        while(iter_M.hasNext()){
            System.out.print(iter_M.next());
            System.out.print("  ");
        }
        System.out.println();
        iter_M = this.list_arr.listIterator();
        while (iter_M.hasNext())
        {
            tmp = (Integer) iter_M.next();
            if((tmp - tmp_last) == 0){
                continue;
            }
            else if((tmp - tmp_last) == 1){
                buf_S.add(tmp);
                tmp_last = tmp;
                cur_consecutive_length++;
            }
            else {
                buf_S.clear();
                buf_S.add(tmp);
                tmp_last = tmp;
                cur_consecutive_length = 1;
            }
            if(cur_consecutive_length>max_consecutive_length){
                max_consecutive_length = cur_consecutive_length;
                buf_F.clear();
                iter_S = buf_S.listIterator();
                while(iter_S.hasNext()){
                    buf_F.add(iter_S.next());
                }
            }
            iter_F = buf_F.listIterator();
            System.out.println(Integer.toString(max_consecutive_length));
            while(iter_F.hasNext()){
                System.out.print(iter_F.next());
                System.out.print("  ");
            }
            System.out.println();
        }

    }
}
