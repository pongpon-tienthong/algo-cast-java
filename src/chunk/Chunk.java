package chunk;

// --- Directions
// Given an array and chunk size, divide the array Integero many subarrays
// where each subarray is of length size
// --- Examples
// chunk([1, 2, 3, 4], 2) --> [[ 1, 2], [3, 4]]
// chunk([1, 2, 3, 4, 5], 2) --> [[ 1, 2], [3, 4], [5]]
// chunk([1, 2, 3, 4, 5, 6, 7, 8], 3) --> [[ 1, 2, 3], [4, 5, 6], [7, 8]]
// chunk([1, 2, 3, 4, 5], 4) --> [[ 1, 2, 3, 4], [5]]
// chunk([1, 2, 3, 4, 5], 10) --> [[ 1, 2, 3, 4, 5]]

import java.util.ArrayList;
import java.util.Arrays;

public class Chunk {

//    Solution #1
    public ArrayList<ArrayList<Integer>> chunk(Integer[] arr, Integer size) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();


        for (Integer ele: arr) {

            if (res.isEmpty()) {
                res.add(new ArrayList<>(Arrays.asList(ele)));
                continue;
            }

            ArrayList<Integer> last = res.get(res.size() - 1);

            if(last.size() == size){
                res.add(new ArrayList<>(Arrays.asList(ele)));
            } else {
                last.add(ele);
            }
        }

        return res;
    }

//    Solution #2
    public ArrayList<ArrayList<Integer>> chunk2(Integer[] arr, Integer size) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Integer idx = 0;

        while(idx < arr.length) {

            Integer toIdx = (idx + size) < arr.length ? idx + size : arr.length;

            res.add(new ArrayList<>(Arrays.asList(Arrays.copyOfRange(arr, idx, toIdx))));
            idx += size;
        }

        return res;
    }
}
