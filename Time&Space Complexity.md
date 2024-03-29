# Time & Space Complexity
![from-code-to-big-o-algorithms-large](https://github.com/ArsalanAhsan/Data_Structure-Notes/assets/49119148/60d27122-0ebb-433b-ad7c-96e88345bd41)

Time complexity of an algorithm quantifies the amount of time taken by an algorithm to run as a function of the length of the input.

**Types of notations**

1. O-notation: It is used to denote asymptotic upper bound. For a given function g(n), we denote it by O(g(n)). Pronounced as “big-oh of g of n”. It is also known as worst case time complexity as it denotes the upper bound in which the algorithm terminates. 
2. Ω-notation: It is used to denote asymptotic lower bound. For a given function g(n), we denote it by Ω(g(n)). Pronounced as “big-omega of g of n”. It is also known as best case time complexity as it denotes the lower bound in which the algorithm terminates. 
3. 𝚯-notation: It is used to denote the average time of a program.

**Example:**

Q. Imagine a classroom of 100 students in which you gave your pen to one person. You have to find that pen without knowing to whom you gave it. 

Here are some ways to find the pen and what the O order is.

***O(n2):*** You go and ask the first person in the class if he has the pen. Also, you ask this person about the other 99 people in the classroom if they have that pen and so on, 
This is what we call O(n2). 

***O(n):*** Going and asking each student individually is O(N). 

***O(log n):*** Now I divide the class into two groups, then ask: “Is it on the left side, or the right side of the classroom?” Then I take that group and divide it into two and ask again, and so on. Repeat the process till you are left with one student who has your pen. This is what you mean by O(log n).

## **Space Complexity**
Space complexity of an algorithm quantifies the amount of time taken by a program to run as a function of length of the input. It is directly proportional to the largest memory your program acquires at any instance during run time. 
For example: int consumes 4 bytes of memory.

Generally, when a program is under execution it uses the computer memory for THREE reasons. They are as follows...

* Instruction Space: It is the amount of memory used to store compiled version of instructions.
* Environmental Stack: It is the amount of memory used to store information of partially executed functions at the time of function call.
* Data Space: It is the amount of memory used to store all the variables and constants.

To calculate the space complexity, we must know the memory required to store different datatype values (according to the compiler). For example, the C Programming Language compiler requires the following...

1. 2 bytes to store Integer value.
2. 4 bytes to store Floating Point value.
3. 1 byte to store Character value.
4. 6 (OR) 8 bytes to store double value.
Consider the following piece of code...
## Example:
int square(int a)
{
	return a*a;
}

In the above piece of code, it requires 2 bytes of memory to store variable 'a' and another 2 bytes of memory is used for return value.

That means, totally it requires 4 bytes of memory to complete its execution. And this 4 bytes of memory is fixed for any input value of 'a'. This space complexity is said to be Constant Space Complexity.



