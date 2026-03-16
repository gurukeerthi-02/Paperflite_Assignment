# Paperflite Assignment

## Prerequisites
1. Download a suitable IDE if needed (IntelliJ preferable).
2. Ensure Java JDK is available on the machine, else IntelliJ will automatically prompt you to download and install the JDK on the machine.


## Steps to run the program
1. Clone the project using https url from GitHub.
2. Select the required program (paperflite-java -> src -> problems) and double-click it.
3. Right click inside the code block window and select run.
4. Output will appear in the terminal.

## Explanation for the solutions

### Solution 1

- The brute force approach was to use a hashmap and map the value with its count of occurrence in the input.
- Next, iterate the keys of the hashmap and check if any eky has only 1 count of occurrence value and return that key back.
- Optimized approach was to create a result = 0 variable and iterate each value and XOR them to with the result and return the result.

### Solution 2
- The approach was to use Stack based concept and try to find the smallest possible value.
- The value will be pushed to stack until the top of the stack is lesser than the current value.
- If the top of the stack is greater than current value, the top will be removed until the top of the stack is lesser than the current value and push the current value to stack.
- I do not know how to return the stack in the string format, so I utilised the StringBuilder collection and implemented the same logic and returned it as a string.
- Edge case was resolved by removing the leading zeros using a simple loop check at result[0].
- There might be more edge cases for the problem, but I have written the solution using the available example inputs.

### Solution 3
- The approach was to create a hashmap and map each pattern character with its respective string word.
- If the pattern character is already in the map, then check if the current word is the same word as in the map, else return false.
- The tricky part is to ensure the one-one property stays true, hence we need to have another Hashmap that keeps track of mapping the string word with the pattern character too.
- If the string word is already in the map, then check if the current character is the same character as in the map, else return false.
- If all the conditions pass, return true.
- Edge case is to check if the pattern array length is the same as word array length.