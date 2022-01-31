# Lab3



## Outline

- Assignment 4
- 3 lab  practice problems
  - Practice by group or alone for 10 mins each
  - Give you answer and go through (hope we can finish all of them)
- Quiz (begin at 12:05 PM)



## Part 1: Assignment

Trickest thing is the grading rule.

I use the homework grading as example:



Selected Requirements:

> The homework score is determined by the student's average score on a series of assignments, as well as points for attending labs. Homeworks are worth 10 points, and each lab is worth 4 points, and the number of homeworks and labs is the same. The number of assignments is entered by the user, as is the student's average homework score and the number of labs attended, as shown in the execution log. If a student hands an assignment in late, he or she uses "late days." For this course, if the student uses more late days than half the number of assignments, the assignment grade should be reduced by 10%. If the student uses no late days, the student should get 5 extra credit points for the homeworks. However, a student cannot earn more points than the maximum available for homeworks; a student that averages 10 points per assignment and never hands any in late has already earned the maximum number of homework points and will get no extra credit for being punctual.





> Your program should be careful to correct bad numeric values entered by the user. If a user enters a negative number or zero for the number of assignments, the student should receive full credit for the homework grade. If a user enters a negative number for the average homework grade or an exam grade, it should be treated as a zero. If a user enters a higher score than the maximum number of points available for homeworks or an exam, the score should be capped.



Extract the important information



### **1 Variables should define**

- Number of assignments: **numberOfAssignments**
- Average Homework grade: **avgHomeworkGrade**
- Number of late days used: **numberOfLateDays**
- Labs attended: **labsAttended**



### **2 Fuction of Calculate the Assignment grade**

Input:  all the variables of assignment 

Return:  total points



2.1 Before you begin calculating, check the averageHomeworkGrade, which cannot greater than 10 and less than 0 here.(if statement)



**2.2 Calculate **

totalPoints = numberOfAssignments * averageHomeworkGrade + labsAttended * 4

maxPoints = numberOfAssignments * ( 10 + 4 )



2.3 Late days may change the totalPoints (if statement)



2.4 Check the number of assignments. If numberOfAssignments is negative or zero => get total points (if statement)



### 3 Calculate weighted score

```java
weightedScore = totalPoints / maxPoints * HM_WEIGHT;
```


**The example code please see: https://github.com/edzq/TA-Qi/blob/main/lab3-exampleCode(grade)/Main.java**



## Part 2: Practice problem

Lab Return: https://www.buildingjavaprograms.com/labs/5ed/ch03-return.html

Lab Scanner: https://www.buildingjavaprograms.com/labs/5ed/ch03-scanner.html

Lab Parameter: https://www.buildingjavaprograms.com/labs/5ed/ch03-parameters.html


All the answer  of practice problem find [here](lab3Practice.md)
