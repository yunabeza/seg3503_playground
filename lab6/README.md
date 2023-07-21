# Lab6
# seg3503_playground
| Outline | Value |
| --- | --- |
| Course | SEG 3503 |
| Date | Summer 2023 |
| Professor |  Mohammed Ibrahim  |
| TA | Joseph Abonasara  |
| Team | Sanata Dembele 300237772 <br> Lolita Inabeza 300218895|


## Output of mvn --version
<br> ![mvn --version](Photos/mavenVersionOutput.png)
<br>

## Output of mvn compile
<br> ![mvn compile](Photos/FirstCompile1.png)
<br> ![mvn compile](Photos/FirstCompile2.png)
<br> ![mvn compile](Photos/FirstCompile3.png)
<br>

## Output of mvn package -DskipTests
<br> ![mvn package -DskipTests](Photos/Dskiprun1.png)
<br> ![mvn package -DskipTests](Photos/Dskiprun2.png)
<br>

## Output of java -jar ./target/BookstoreApp-0.1.0.jar
<br> ![server launch command output](Photos/BookstoreAppjarRun.png)
<br> This command is supposed to launch the server but when we tried to access it through the browser it did not work. Instead, we used the command -jar bookstore5.jar 

## Output of java -jar bookstore5.jar
<br> ![server launch command output](Photos/bookstore5jar.png)
<br> With this command we accessed successfully the application through the browser.
<br>

## Application screenshots
<br> ![application visual](Photos/app1.png)
<br> ![application visual](Photos/app2.png)
<br><![application visual](Photos/app3.png)
<br>

## Output of mvn test
<br> ![mvn test output](Photos/mvntestInit.png)
<br>

## One additional selenium web driver test
<br> ![added test](Photos/newTest.png)
<br>
This test checks that the number of times we click on the button "add to cart" (ajouter au panier) for a certain book, will correspond to the number of copies of that book on the order page (checkout page)

## Output of mvn test for the new test
<br> ![new mvn test output](Photos/finalTestRes.png)
<br>
