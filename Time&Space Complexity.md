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

O(n2): You go and ask the first person in the class if he has the pen. Also, you ask this person about the other 99 people in the classroom if they have that pen and so on, 
This is what we call O(n2). 
O(n): Going and asking each student individually is O(N). 
O(log n): Now I divide the class into two groups, then ask: “Is it on the left side, or the right side of the classroom?” Then I take that group and divide it into two and ask again, and so on. Repeat the process till you are left with one student who has your pen. This is what you mean by O(log n). 

