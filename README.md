Quadrant Compose

Application Android réalisée avec Jetpack Compose dans le cadre d'un exercice de cours. L'écran affiche 4 fonctions Composable (Text, Image, Row, Column) réparties en 4 quadrants égaux, avec le nom et une description pour chacune.

Description

L'écran est divisé en 4 parties égales (50% largeur x 50% hauteur) :

Haut gauche : Text composable
Haut droite : Image composable
Bas gauche : Row composable
Bas droite : Column composable
Ce que j'ai appliqué
Padding de 16dp sur les 4 côtés de chaque quadrant
Contenu centré horizontalement et verticalement
Premier Text en gras avec une marge inférieure de 16dp
Deuxième Text avec la taille de police par défaut
Répartition égale des 4 quadrants avec le modifier weight()
Chaînes de texte mises dans strings.xml
Technologies utilisées
Kotlin
Jetpack Compose (Material3)
Android Studio
Structure
app/src/main/
├─ java/com/example/quadrant_compose/MainActivity.kt
└─ res/values/strings.xml
Comment lancer le projet
Cloner le dépôt :
git clone  https://github.com/PagniSamuel01/quadrant_compose.git                 
Ouvrir le projet dans Android Studio
Laisser Gradle synchroniser
Lancer l'app sur un émulateur ou un téléphone