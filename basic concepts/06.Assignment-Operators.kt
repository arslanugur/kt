// The assignment operator = is used to assign a value to a variable.
// Kotlin also supports arithmetic assignment operators, for example a+=b is equivalent to a=a+b.

// The same applies to the other operators. For example:
fun main(args : Array<String>) {
    var num = 4
    num *= 5
    
    println(num)
} // Output: 20

// Kotlin also supports the increment ++ and decrement -- operators, used to increment and decrement the value by one.
fun main(args : Array<String>) {
    var num = 8
    num++
    println(num)
} // Output: 9

// Both, increment and decrement operators have prefix (before the name of the variable) and postfix (after the name of the variable) forms. 
// The prefix form increments the variable and then uses it in the assignment statement. 
// The postfix form uses the value of the variable first, before incrementing it.
// PREFIX : Before The Name Of The Variable (++a) 
// POSTFIX : After the name of the variable (a++)

  
// Example:
fun main(args: Array<String>) {
    var n=8
    var x=n++
    println(x)  // 8
    println(n)  // 9
    var y=++n
    println(y)  // 10
}


// Example: to calculate the sum of the two variables and output it.
var a = 9
var b = 15
var res = a + b
println(res)

