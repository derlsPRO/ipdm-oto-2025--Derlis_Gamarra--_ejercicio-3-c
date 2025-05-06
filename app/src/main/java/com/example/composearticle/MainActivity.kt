package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composearticle.ui.theme.ComposeArticleTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeArticleTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ArticleScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun ArticleScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier.verticalScroll(rememberScrollState())) {

        Image(
            painter = painterResource(id = R.drawable.bg_compose_background),
            contentDescription = null,
            modifier = Modifier.fillMaxWidth()
        )

        Text(
            text = "Un viaje inesperado",
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp)
        )

        Text(
            text = "Aquel día comenzó como cualquier otro, con el sol asomándose tímidamente entre las nubes. Clara, una joven apasionada por los libros y los caminos desconocidos, decidió salir a caminar sin rumbo fijo, dejándose guiar por el viento.",
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp)
        )

        Text(
            text = "Mientras cruzaba un bosque cercano, encontró una pequeña cabaña de madera oculta entre los árboles. Intrigada, se acercó y descubrió en su interior una biblioteca antigua, repleta de historias que nadie parecía haber leído en años. Ese fue el inicio de una aventura que la cambiaría para siempre, una donde los libros no solo contaban historias, sino que la transportaban a ellas.",
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)
        )
    }
}



@Preview(showBackground = true)
@Composable
fun ArticlePreview() {
    ComposeArticleTheme {
        ArticleScreen()
    }
}