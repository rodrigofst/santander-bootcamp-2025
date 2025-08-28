# Bootcamp Santander 2025
Java RESTful API criada para o bootcamp Santander.

##Diagrama de classes

```mermaid
classDiagram
    class User {
        -String name
    }

    class Account {
        -String number
        -String agency
        -Double balance
        -Double limit
    }

    class Feature {
        -String icon
        -String description
    }

    class Card {
        -String number
        -Double limit
    }

    class News {
        -String icon
        -String description
    }

    User *-- Account 
    User *-- Feature 
    User *-- Card 
    User *-- News 
```
