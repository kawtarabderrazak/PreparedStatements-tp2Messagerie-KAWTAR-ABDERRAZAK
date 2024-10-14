# PreparedStatements-tp2Messagerie-KAWTAR-ABDERRAZAK

Ce projet vise à développer un système de messagerie interne pour une société afin que les employés puissent s'envoyer des messages entre eux. L'application utilise Java avec JDBC pour se connecter à une base de données MySQL, permettant la gestion des employés et des messages échangés.

Structure du projet
Le projet est divisé en plusieurs packages :

ma.projet.beans : Contient les classes Employe et Message qui modélisent les employés et les messages.
ma.projet.connexion : Contient la classe Connexion qui gère la connexion à la base de données.
ma.projet.dao : Contient l'interface générique IDao utilisée pour les opérations CRUD (Create, Read, Update, Delete).
ma.projet.services : Contient les services EmployeService et MessageService qui implémentent les opérations CRUD pour les employés et les messages.
ma.projet.test : Contient la classe Messagerie pour tester les fonctionnalités de l'application.
Fonctionnalités principales
Gestion des Employés
La classe EmployeService permet de gérer les employés via les opérations CRUD.

Gestion des Messages
La classe MessageService permet d'envoyer et de recevoir des messages entre les employés.

 
