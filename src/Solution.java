public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        int mask = 1;

        // loop through number
        for (int i = 0; i < 32; i++) {

            //  1 & 1 = 1
            //  1 & 0 = 0
            //  0 & 0 = 0
            if ((n & mask) != 0) {
                count++;
            }
            mask = mask << 1;
        }
        return count;
    }
}
