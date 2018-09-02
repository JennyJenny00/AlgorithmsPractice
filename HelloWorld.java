public class Solution {
  public int[] solve(int[] array) {
    // for each iteration, find the smallese and put it in the front.
//    if(array == null || array.length == 0)
//      return array;
/*    int temp;
    for(int i = 0; i < array.length-1; i++) {
      for (int j = i+1; j < array.length; j++)
        if(array[i] > array[j]) {
          temp = array[i];
          array[i] = array[j];
          array[j] = temp;
        }
    }
    return array;*/
    
     //global represents the index of the minimum element for each iteration
    int global;
    int temp;
    
    //outer loop for the first element 
    for (int i = 0; i < array.length-1; i++) {
      //inner loop for the second element
      global = i;//global 不能设成0， global总是i 因为要从第i个起比
      for (int j = i + 1; j < array.length; j++) {
        if (array[global] > array [j])
          global = j;
      }
      // now array[global]is the ith smallest element
      //so we swap with array[i] which is array[global]'s real position
      temp = array[global];
      array[global] = array[i];
      array[i] = temp;
    }
    return array;
  }
}

