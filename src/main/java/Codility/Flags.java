package Codility;
import java.util.Arrays;
import java.lang.Integer;
import java.util.ArrayList;
import java.util.List;
public class Flags {

    public int solution(int[] A)
    {
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 1; i < A.length - 1; i++)
        {
            if (A[i - 1] < A[i] && A[i + 1] < A[i])
            {
                array.add(i);
            }
        }
        if (array.size() == 1 || array.size() == 0)
        {
            return array.size();
        }
        int sf = 1;
        int ef = array.size();
        int result = 1;
        while (sf <= ef)
        {
            int flag = (sf + ef) / 2;
            boolean suc = false;
            int used = 0;
            int mark = array.get(0);
            for (Integer integer : array) {
                if (integer >= mark) {
                    used++;
                    mark = integer + flag;
                    if (used == flag) {
                        suc = true;
                        break;
                    }
                }
            }
            if (suc)
            {
                result = flag;
                sf = flag + 1;
            }
            else
            {
                ef = flag - 1;
            }
        }
        return result;
    }
}
