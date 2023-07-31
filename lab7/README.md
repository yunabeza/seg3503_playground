# Lab7
# seg3503_playground
| Outline | Value |
| --- | --- |
| Course | SEG 3503 |
| Date | Summer 2023 |
| Professor |  Mohammed Ibrahim  |
| TA | Joseph Abonasara  |
| Team | Sanata Dembele 300237772 <br> Lolita Inabeza 300218895|

## Spotbugs Interface
<br> ![Spotbugs](Photos/spotbugs.png)
<br>
## Calculator Interface
<br> ![Calculator interface](Photos/calcAPI.png)
<br>
## Bug 1: Comparison of String parameter using == or !=
<br>![bug 1](Photos/bug1.png)
<br> Description: a bug can arise from using == or != for comparing String content is related to reference equality instead of content equality.
<br> **After fixing the bug**<br> 
![bugfix 1](Photos/bugfix1.png)
<br>
## Bug 2: Certain swing methods to be invoked in the Swing thread
<br>![bug 2](Photos/bug2.png)
<br> Bug description: The issue occurs in Swing when using methods like show(), setVisible(), and pack(). When these methods are called, the associated peer for the frame is created, and the event dispatch thread is also created. This creates a problem because the event dispatch thread might notify listeners while pack() and validate() methods are still processing. This can lead to two threads simultaneously accessing the Swing component-based GUI, resulting in deadlocks
## Bug 3 and 4: An overridable method is called from the constructor
<br>![bug 3](Photos/bug3.png)
<br>![bug 4](Photos/bug4.png)
<br> Description to fix the bugs: These two bugs are due to the call in the constructor of new WindowAdapter which will call addActionlistener and getContentPane, to solve it is better to create a static class to invoke the new WindowAdapter, then reference that class in the constructor of calcFrame
## Bug 5 and 6: Boxing/unboxing to parse a primitive
<br>![bug 5](Photos/bug5.png)
<br>![bug 5.1](Photos/bug5.1.png)
<br>![bug 5.2](Photos/bug5.2.png)
<br>**After fixing the bug**
<br>![bugfix 5](Photos/bugfix5.png)
<br>![bugfix 5.1](Photos/bugfix5.1.png)
<br>![bugfix 5.2](Photos/bugfix5.2.png)
<br>![bug 6](Photos/bug6.png)
<br>**After fixing the bug**
<br>![bugfix 6](Photos/bugfix6.png)
<br> Bug fix description : replaced Double.valueOf() with Double.parseDouble for efficiency
<br>
## Bugs 7-12: Unread field: should this field be static
<br>![bug 7-12](Photos/bug7-12.png)
<br>**After fixing the bug**
<br>![bugfix 7-12](Photos/bugfix7-12.png)
<br> Bug fix description: The variables were just put as static.
<br>
## Bug 13 and bugs 15-17: method uses the same code for two branches and Condition has no effect
<br>![bug 13](Photos/bug13.png)
<br>![bug 15](Photos/bug15.png)
<br> ![bug 16](Photos/bug16.png)
<br>![bug 17](Photos/bug17.png)
<br>**After fixing the bugs**
<br> ![bugfix](Photos/bugfix13,15-17.png)
<br> These bugs were fixed at once, as the whole if - else if - else block was unnecessary since adding the buttons to getCotentPane does not the depend of i's value
<br>
## Bug 14: Switch statement found where default case is missing
<br>![bug 14](Photos/bug14.png)
<br>**After fixing the bug**
<br> ![bugfix 14](Photos/bugfix14.png)
<br> Bug fix description: Added default case
<br>
## Bug 18: Condition has no effect
<br>![bug 18](Photos/bug18.png)
<br>**After fixing the bug**
<br> ![bugfix18](Photos/bugfix18.png)
<br>Bug fix Description: At this point, morenums is True, else if(morenums) is replaced to else.
<br>
## Final results of the analysis
<br> As only 15 bugs were fixed, we are left with 3 bugs
<br>![final analysis](Photos/final.png)
