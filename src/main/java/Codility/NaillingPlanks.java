package Codility;

public class NaillingPlanks {


    public int solution(int[] A, int[] B, int[] C)
    {
        int minPlanks = 1;
        int maxPlanks = C.length;
        int result = -1;
        while (minPlanks <= maxPlanks)
        {
            int midPlanks = (maxPlanks + minPlanks) / 2;
            if (AllNailed(midPlanks, A, B, C))
            {
                maxPlanks = midPlanks - 1;
                result = midPlanks;
            }
            else
            {
                minPlanks = midPlanks + 1;
            }
        }

        return result;
    }

    private boolean AllNailed(int planksCount, int[] A, int[] B, int[] C) {
        int[] nailsMarked = new int[2 * C.length + 1];
        for (int i = 0; i < planksCount; i++) {
            nailsMarked[C[i]] = 1;
        }
        return true;
    }
}
