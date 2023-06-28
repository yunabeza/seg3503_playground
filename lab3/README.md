# Lab3
# seg3503_playground
| Outline | Value |
| --- | --- |
| Course | SEG 3503 |
| Date | Summer 2023 |
| Professor |  Mohammed Ibrahim  |
| TA | Joseph Abonasara  |
| Team | Sanata Dembele 300237772 <br> Lolita Inabeza 300218895|


## Date coverage before

<br> ![Date coverage before](Photos/date_before_coverage.png)

<br> ![Date's method coverage before](Photos/Datemethods_coverage_before.png)


## Code coverage after

<br> ![Date coverage after](Photos/Date_coverage_after.png)

<br> ![Date's method coverage after](Photos/dateMethods_%20coverage_after.png)

<br> __tests results after adding new tests and refactoring date.java__
<br> ![tests results](Photos/jacoco_run_3.png)

## Added tests to achieve full coverage

<p> Adding test cases helps achieve full coverage because the added tests aim to cover missed branches,
instructions, or conditions. For example the method <strong>__toString__</strong> and its instructions were not covered, so I added 
a test to cover it.</p>

<br> __Additional nextDate test cases__
<br> ![tests for nextDate](Photos/nextDate%20test.png)

<br> __Additional Exception test cases__
<br> ![tests for exceptions](Photos/Exception_test.png)

<br> __toString method test__
<br> ![tests for toString method](Photos/toString_test.png) 

<br> __equals method tests__
<br> ![tests for Equals method](Photos/Equals_test.png) 


## Date.java refactoring 

<br> ![Before refactoring](Photos/date_before_refactoring.png) 

<br> <p>We modified the isEndOfMonth and isThirtyDayMonth methods to return directly, the result of the condition passed to the if statement used in order to modify the number of instructions to cover </p>

<p>Note that in the isEndOfMonth method, the condition <strong>__(day == 31 || (day == 30 && isThirtyDayMonth()) || (this.month == 2 && ((day == 29 && leap) || (day == 28 && !leap))))__</strong> , will never be fully covered
because the case where the month is February, the day is 29, and the year is not a leap year cannot be covered as such day will throw an exception during its creation, meaning we cannot reach the step where nextDate calls isEndOfMonth, in this case. <br> To attain full coverage, I modified the condition per the below picture </p>

<br>![After refactoring](Photos/Date_after_refactoring.png)
