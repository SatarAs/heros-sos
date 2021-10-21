# Heros-App

---

## Liens utiles 

- [Board Kanban](https://app.gitkraken.com/glo/board/YXEjEWMcSQBGudrn)

---

## Installation

! Assurez-vous d'avoir **JDK-11** d'installer !

- [JDK-11](https://www.oracle.com/fr/java/technologies/javase/jdk11-archive-downloads.html)

+ Mettre le JDK dans les variables d'environnements système
    
  > Panneau de configuration > Système et sécurité 
  > Système > Paramètres avancés > variables d'environnement

    - Nouvelle variable utilisateur :
        - **JAVA_HOME** = ``C:\Program Files\Java\jdk-11.0.11``
        
      &nbsp;
      
    - Modifier la variable ``path``:
      - ``%JAVA_HOME%\bin``

*! Pensez à redémarrer le système pour prendre en compte les changements !*

--- 
+ Copie des fichiers d'environnements

````bash
cp .env.dist .env
````

+ Lancement des conteneurs

````bash
docker-compose up -d
````

+ Pour chaque nouvelle dépendance ajoutée

````bash 
docker-compose run --rm spring mvn install
````

---

## Utilisation 

+ Commandes utiles

**Spring**
````bash
docker-compose run --rm spring mvn <command>
````
