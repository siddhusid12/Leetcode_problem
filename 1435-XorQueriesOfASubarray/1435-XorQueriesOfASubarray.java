// Last updated: 9/3/2025, 10:07:48 AM
class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        int[] prefixXor = new int[n];
        prefixXor[0] = arr[0];
        
        // Build prefix XOR array
        for (int i = 1; i < n; i++) {
            prefixXor[i] = prefixXor[i - 1] ^ arr[i];
        }

        int q = queries.length;
        int[] result = new int[q];

        // Answer each query
        for (int i = 0; i < q; i++) {
            int L = queries[i][0];
            int R = queries[i][1];

            if (L == 0) {
                result[i] = prefixXor[R];
            } else {
                result[i] = prefixXor[R] ^ prefixXor[L - 1];
            }
        }

        return result;
    }
}
