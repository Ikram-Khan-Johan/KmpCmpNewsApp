package org.johan.project.newsapp.headlines.presentation

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import cmpproject.composeapp.generated.resources.Res
import cmpproject.composeapp.generated.resources.logo
import org.jetbrains.compose.resources.painterResource

@Composable
fun HeadlineScreen() {

    Scaffold (
      topBar = {
          TopAppBar {
              Text(text = "Navbar")
          }
      },
      modifier = Modifier.fillMaxSize()
    ) {

        LazyColumn(
            modifier = Modifier.fillMaxSize()
        ) {
            items(10) {
                HeadlineItem()
            }
        }

       
    }
}

@Composable
fun HeadlineItem() {
    Row(
        modifier = Modifier.fillMaxSize()
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .border(
                border = BorderStroke(1.dp, color = Color.Gray),
                shape = RoundedCornerShape(16.dp)
            ),
//            horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(Res.drawable.logo),
            contentDescription = null,
            modifier = Modifier.size(100.dp)
                .clip(RoundedCornerShape(16.dp))
                .padding(16.dp)
        )
        Text(text = "Headline", style = MaterialTheme.typography.h6)
    }
}