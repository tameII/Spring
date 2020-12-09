# Spring
Repo contenant plusieurs application permettant de faire tourner un projet spring entier de Base de donnée de peintures  

## Installation
Clonez le repository :
```
$ git clone https://github.com/tameII/Spring.git
```
Vous allez avoir la copie contenant tout les projets au propre.  

Crééz un depot git à au niveau de MyConfig dans le projet springConfigServer:  
```
$ cd PathToSpringConfigServer/src/main/resources/myConfig
$ git init
$ git add .
$ git commit -m "initialisation configServer"
```

Vous avez maintenant la configuration de départ pour lancer le projet. 

## Démarrage
Ordre de lancement des projets :  
Config -> Découverte -> Proxy -> Métier(s)  
Métier(s) fait references aux applications Art.  
Une fois lancé, vous pourrez accéder à chacune des application sur leurs port respectifs.  

## Test
Vous pouvez utiliser le json postman exporté sur le repo pour tester différentes requêtes.  

Si vous voulez tester rapidement via navigateur, voici des exemples d'adresses accessible:

Adresse Config:
```
http://localhost:8888/painting-service/master
http://localhost:8888/discovery-service/master
```
Adresse Eureka
```
http://localhost:8761
```

Adresse Proxy
```
http://localhost:9999/painting-service/cestqui
http://localhost:9999/painting-service/art
```
Adresse Painting get Art basique:

```
http://localhost:8080/art
http://localhost:8082/art
http://localhost:8083/art
```
Autre adresse utile pour l'application Painting: (remplacez le 8080 par le port correspondant)
```
http://localhost:8080/actuator/ 
http://localhost:8080/h2-console/
```
