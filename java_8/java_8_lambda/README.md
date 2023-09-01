# Programmation fonctionnelle et lambdas

## La programmation fonctionnelle

La programmation fonctionnelle est un paradigme de programmation basé sur l’appel et la composition de fonctions.

Un trait important de la programmation fonctionnelle est de considérer une fonction comme une entité de première classe (first class citizen), c’est-à-dire qu’on peut lui appliquer les mêmes opérations que n’importe quel autre élément du langage. Ainsi une fonction doit posséder une identité intrinsèque lui permettant d’être passée en paramètre d’une autre fonction ou retournée par une autre fonction.

Une fonction qui accepte une ou plusieurs autres fonctions en paramètres et qui retourne une fonction est appelée une fonction d’ordre supérieur (higher-order function).

## Les fonctions anonymes : les lambdas

Une lambda est une fonction anonyme, c’est-à-dire une fonction qui est déclarée sans être associée à un nom. Le terme lambda est emprunté à la méthode formelle du lambda-calcul. Les fonctions lambda (ou plus simplement les lambdas) sont couramment utilisées dans la programmation fonctionnelle. Elles permettent d’écrire des programmes plus concis et elles permettent de créer des closures (fermetures).

Depuis la version 8, il est possible de déclarer des lambdas en Java.

### Syntaxe des lambdas

En Java, les lambdas s’écrivent sous la forme :
```
(paramètres) -> { corps }
(int a, int b) -> {  return a + b; }
(int a, int b) -> a + b
String s -> System.out.println(s)
() -> 42
```

- Les parenthèses ne sont pas obligatoires si la lambda n’a qu’un seul paramètre.
- Si le compilateur peut inférer le type des paramètres alors il n’est pas obligatoire de déclarer ce type.
- Les accolades peuvent être omises si la lambda n’a qu’une instruction et si le contexte le permet.
- Si le corps de la lambda ne contient qu’une instruction, on peut omettre le point-virgule à la fin de l’instruction.
- Si le corps de la lambda ne contient qu’une instruction, on peut omettre le mot-clé return et le compilateur infère que la fonction retourne le résultat de l’instruction.


# Ressources
- https://gayerie.dev/docs/java/langage_java/les_lambdas.html
