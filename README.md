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


