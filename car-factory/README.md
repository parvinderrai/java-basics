**How to build (clean, compile, run tests etc.) project**

gradle build

**How to run CarFactoryApplication**
1. gradle build
2. java -jar build/libs/car-factory.jar

**Sample output of running application:**

```
$:~/car-factory$ gradle build

BUILD SUCCESSFUL in 1s
7 actionable tasks: 7 up-to-date

$:~/car-factory$ java -jar build/libs/car-factory.jar 


Welcome to car factory. 
1. Order Honda Accord
2. Order Tata Jaguar 
3. Show orders
4. Quit
Please make a selection (From Above Menu) :4

Thank you, for using Car Factory. We received following orders today:
Showing current orders...
```