# Adneom-project

Écrivez une fonction « partition » qui prend un paramètre « liste » et un paramètre « taille » et retourne une liste de sous liste, où chaque sous liste a au maximum « taille » éléments.

## Exemples d'entrées et sorties :
```
Partition([1,2,3,4,5], 2) retourne: [ [1,2], [3,4], [5] ]
Partition([1,2,3,4,5], 3) retourne: [ [1,2,3], [4,5] ]
Partition([1,2,3,4,5], 1) retourne: [ [1], [2], [3], [4], [5] ]
Partition([10,5,2,7,4], 2) ne retourne pas : [ [10,5], [2,7], [4]] car liste non ordoné
Partition(null, 2) ne retourne pas : [] car liste non ordoné
Partition(null, -1) ne retourne pas : [] car taille non correcte
```
 
## Library utilisé

Log4J
JUnit

## License
