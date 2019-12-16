# Projet F1 Calendar 2019

- Introduction :
Projet androïd de quatrième année d'école d'ingénieur. 

- Énoncé :
  Création d'une application mobile avec :
  - Deux écrans : Un écran avec une liste et un écran avec un détail de l’item
  - Appel WebService à une API Rest.
  - Architecture MVC
  - Utilisation de fragments
  - Material Design
  - Git
  
- Présentation de l'application :
  Cette application mobile possède les caractéristiques suivantes :
  - Des fragments pour afficher la liste des Grands Prix du championnat de Formule 1 2019, ainsi que les équipes présentes
  ![Alt text](https://github.com/William-Henry/Projet-4A/blob/master/Screenshot_1576525995.png)
  ![Alt text](https://github.com/William-Henry/Projet-4A/blob/master/Screenshot_1576526000.png)
  
  - Un deuxième écran où apparait la description de chaque épreuve
  ![Alt text](https://github.com/William-Henry/Projet/blob/master/Screenshot_1553638343.png)
  
  - Un logo sur le menu Home du téléphone
  <img src="https://github.com/William-Henry/Projet-4A/blob/master/Screenshot_1576526060.png" width="200" height="400" />
  
  
- Réalisation de l'application :
  Pour réaliser cette application, j'ai réaliser les étapes suivantes :
  - Création d'une RecyclerView
  - Trouver et utiliser une API Rest
  - Création de plusieurs activités pour avoir plusieurs écrans.
  
  
- Ce que contient l'application :
  - Une liste avec RecyclerView
  - La mise en place d'une API Rest
  - Plusieurs écrans
  - Plusieurs activités
  - Liens entre les activités
  - Une architecture MVP :
    - Modèle : Une classe qui contiendra notre modèle
    - Présenteur : Il s’agit de l’Activity (ou fragment)
    - Vue : Cela correspond aux fichiers layout en .XML


- Amélioration possibles :
  - Mise en place d'un système de stockage des données en cache
  - Mise en place d'annimations entre les écrans
  

- À propos de l'API :
  Les informations présentes dans l'API viennent du site http://ergast.com/mrd/
  Cependant j'ai rencontré quelques soucis pour l'utiliser. Pour pouvoir utiliser l'API, j'ai créé un fichier.json que j'ai importer sur Github.


NB : pour les utilisateurs de MacOS, il est possible que le Mac bloque la connexion internet de l'émulateur android. Pour cela, il faut créer un DNS dans les préférences système.
