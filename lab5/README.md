# Lab3
# seg3503_playground
| Outline | Value |
| --- | --- |
| Course | SEG 3503 |
| Date | Summer 2023 |
| Professor | Mohammed Ibrahim  |
| TA | Joseph Abonasara  |
| Team | Sanata Dembele 300237772 <br> Lolita Inabeza 300218895|

<br>

## Grades


## Twitter

### Implementation des 4 cas de test manquantes

![missing tests](Photos/firstest.png)
<br>
![missing tests](Photos/secondtest.png)
<br> <br> 

**Resultats de ces tests**
<br>
![results1](Photos/testsBeforeRefactoring.png)
<br>
![results2](Photos/testsBeforeRefactoring_1.png)


### Analyse des resultats des tests

En examinant les resultats des tests, on voit premièrement qu'une exception apparaît lorsque il n'y a aucun tweet (null), cela est dû au fait que isMentioned va vérifier tweet.contains("@"+ name), hors tweet aura la valeur null qu'on ne peut pas referencer d'où l'exception. Pour resoudre cela, on fait en sorte que si il n' y a aucun tweet isMentionned retournera toujours false.
<br> <br> 
Deuxièmement, en analysant les resultats que donne le test isMentionned_dontReturnSubstringMatches, on voit que quand le tweet est 'hello @meat' isMentionned trouve que 'me" fait partie du tweet, cela veut dire dans  isMentionned la ligne 'tweet.contains("@"+ name)' vérifie juste que la suite de caractères '@me' est dans le tweet, ce qui est vrai mais n'est pas valide pour notre implementation. Donc pour avoir le resultat qu'on souhaite on doit comparer les deux mots soit '@meat' et '@me' en tant que String.
<br>  <br> 
ci-bas vous pourrez voir la nouvelle implementation de isMentionned et les résultats des tests

### Code refactoring

![new isMentionned](Photos/isMentionnedAfter.png)

<br> 
**Résultas des tests**
<br> <br> 
![results after refactoring](Photos/resultsAfterRefactoring.png)

