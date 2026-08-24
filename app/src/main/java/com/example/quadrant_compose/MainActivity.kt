package com.example.quadrant_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.res.stringResource

// Activité principale : point d'entrée de l'application
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge() // Permet à l'UI de s'étendre derrière la barre de statut/navigation
        setContent {
            MaterialTheme {
                // Surface = conteneur racine qui applique le fond du thème
                Surface(modifier = Modifier.fillMaxSize()) {
                    ComposableInfoApp()
                }
            }
        }
    }
}

// Composable principal : organise l'écran en 4 quadrants (2 lignes x 2 colonnes)
@Composable
fun ComposableInfoApp(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {

        // Première ligne : quadrants "Text" et "Image"
        Row(modifier = Modifier.weight(1f).fillMaxWidth()) {
            // Quadrant 1 : informations sur le composable Text
            ComposableInfoCard(
                title = stringResource(R.string.text_composable_title),
                description = stringResource(R.string.text_composable_description),
                backgroundColor = Color(0xFFEADDFF),
                modifier = Modifier
                    .weight(1f)     // Prend la moitié de la largeur de la ligne
                    .fillMaxHeight() // Occupe toute la hauteur de la ligne
            )
            // Quadrant 2 : informations sur le composable Image
            ComposableInfoCard(
                title = stringResource(R.string.image_composable_title),
                description = stringResource(R.string.image_composable_description),
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
            )
        }

        // Deuxième ligne : quadrants "Row" et "Column"
        Row(modifier = Modifier.weight(1f).fillMaxWidth()) {
            // Quadrant 3 : informations sur le composable Row
            ComposableInfoCard(
                title = stringResource(R.string.row_composable_title),
                description = stringResource(R.string.row_composable_description),
                backgroundColor = Color(0xFFB69DF8),
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
            )
            // Quadrant 4 : informations sur le composable Column
            ComposableInfoCard(
                title = stringResource(R.string.column_composable_title),
                description = stringResource(R.string.column_composable_description),
                backgroundColor = Color(0xFFF6EDFF),
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
            )
        }
    }
}

// Composable réutilisable représentant une carte d'information dans un quadrant
@Composable
fun ComposableInfoCard(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .background(color = backgroundColor) // Couleur de fond du quadrant
            .padding(16.dp), // Marge intérieure de 16dp sur les 4 côtés (consigne du devoir)
        verticalArrangement = Arrangement.Center,       // Centre le contenu verticalement
        horizontalAlignment = Alignment.CenterHorizontally // Centre le contenu horizontalement
    ) {
        // Titre en gras avec une marge inférieure de 16dp (consigne du devoir)
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        // Description avec alignement justifié, taille de police par défaut
        Text(
            text = description,
            textAlign = TextAlign.Justify
        )
    }
}

// Aperçu Compose : permet de voir le résultat directement dans Android Studio
@Preview(showBackground = true)
@Composable
fun ComposableInfoAppPreview() {
    MaterialTheme {
        ComposableInfoApp()
    }
}