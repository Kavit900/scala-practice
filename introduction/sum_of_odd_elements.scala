/*
ou are given a list. Return the sum of odd elements from the given list. The input and output portions will be handled automatically. You need to write a function with the recommended method signature.

Constraints

The list will have  elements. 
Each element will be an integer  where .

Sample Input:
3
2
4
6
5
7
8
0
1

Sample Output:
16

Explanation

Sum of odd elements is 

Method Signature:
Number Of Parameters: 1
Parameters: [list]
Returns: Number
*/
def f(arr:List[Int]):Int = {
 var sum = 0;
 for (i <- 0 until arr.length) {
     if (arr(i)%2 != 0) {
         sum = sum + arr(i);
     }
 }
 sum;
}