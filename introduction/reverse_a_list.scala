/*Problem Statement
Reverse a list without using reverse function. The input and output portions will be handled automatically. You need to write a function with the recommended method signature.
Input and Output Format
Each element of the list is displayed on a new line.
The output list is the reverse of the input list.*/
def f(arr:List[Int]):List[Int] =  {
    var list:List[Int] = Nil;
    val iterator = (arr.length - 1) to 0 by -1
    for (i <- iterator) {
        list = list:::List(arr(i));
    }
    return list;
}