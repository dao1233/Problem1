# Matriculation number: 7221965
# Development environment: 
Java version 22.0.2
Java(TM) SE Runtime Environment (build 22.0.2+9-70)
Java HotSpot(TM) 64-Bit Server VM (build 22.0.2+9-70, mixed mode, sharing)
Eclipse IDE for Java Developers with Version: 2024-06 (4.32.0)
# Problem 1
Contains 4 different problems
# Problem 1.1
This project is used to calculate the volume of the Earth, the Sun in cubic miles, and the ratio of the Sun to the Earth.
Initially, we have the volume formula of sphere 4 pi r^3/3 that can be apply to calculate the volume of the Sun and the Earth.
We knew the diameter of the Sun and Earth --> radius --> use the calculated radius to find volume.
Result:

![image](https://github.com/user-attachments/assets/dbf224af-9849-4df1-b342-05952a5c9e93)

# Problem 1.2
In this problem, we have to modify the provided code so that the codes meet the requirements and the result will be still correct. This program is used to find prime number.
The solution is that we use a counter and continue statement instead of a isPrime flag and break statement. Because the continue statement breaks one iteration (in the loop) and continues with the next iteration in the loop, we have to use a counter instead of a flag.

![image](https://github.com/user-attachments/assets/9b3371a8-26b0-415d-b1c3-318bdce244fd)

Result with input = 50:

![image](https://github.com/user-attachments/assets/f47f5359-333d-4e14-92f5-1be6aee8cec4)

# Problem 1.3
This solution is used to count the number of vowels, spaces and letters in a string.

![image](https://github.com/user-attachments/assets/2410be98-2839-436e-8b49-e7379c93a608)
Firstly, we have to convert all the letters in the string to lowercase in order counting to be correct.
We base on the length of the string to limit the for loop to count vowels (letters: u, e, o, a, i), spaces and the number of letters
Result:

![image](https://github.com/user-attachments/assets/cd6bc154-7d12-46b9-872d-0ab740b7e85d)

# Problem 1.4
The solution has three main step to solve this problem
Firstly, to create an array, we must know the number of words. Therefore, we have to create code for counting words

![image](https://github.com/user-attachments/assets/cad70e99-f69d-4874-a726-5dd8cd0a6921)

If the first letter of a word is recognized, the counter is increased by 1. Then, the program scans and go through until the end of this word. For each words, the counter will be increased by 1 til the end of the text.

Secondly, we have to extract the words from text and store these words to an array with size found in step 1. For extracting, we use a similar algorithm to step 1 and substring(startpoint, endpoint) method.

![image](https://github.com/user-attachments/assets/58e861f7-de61-4168-a36d-2573b3b42284)

Finally, we use array sorting algorithm to sort the words into alphabetical order by using compareToIgnoreCase() method.

![image](https://github.com/user-attachments/assets/5efabd2a-b147-4854-a670-4e21cc4621a2)

Result:

![image](https://github.com/user-attachments/assets/ffb26009-4685-463b-8e8d-62a91298399b)
![image](https://github.com/user-attachments/assets/b61b72dd-c69b-4bcb-8c6e-a304d2dfbd91)
