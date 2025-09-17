## Description
This is a Java program for Lab 2 that simulates a **four-dice game**.  
The program follows these rules:

- **Instant Win**: If the sum of the first roll is **7, 11, 15, or 21**.  
- **Instant Lose**: If the sum is **10, 12, 13, 19, 20, 22, 23, or 24**.  
- **Otherwise**: The first roll becomes the **point**. Keep rolling until:
  - You roll the same sum again → **WIN**  
  - You roll a **13** → **LOSE** 
  - Any other number → keep rolling.  

---

## How to Compile & Run

### Command Line
```bash
# From the project root
javac -d out src/*.java
java -cp out Main
