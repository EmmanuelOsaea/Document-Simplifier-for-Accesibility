package com.emmaxtech.documentsimplifier.ui

import androidx.compose.foundation.layout*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@ param
@ param

@Composable 

fun SimplifiedTextScreen(
  simplifiedText
  onRefresh: (() -> Unit)? = null
  ) {

  Scaffold(
    topBar = {
      TopAppBar(
       title = { Text("Simplified Document")},
     actions = {
        if (onRefresh ! = null)
          IconButton(onClick = onRefresh) {
            Icon(
              imageVector = Icons.Default.Refresh,
              contentDescription = "Refresh"
              )
          }
     }
        }
        )
    }
    { paddingValues ->
      Column(
        modifier = Modifier
           .padding(paddingValues)
           .padding(16.dp)
           .fillMaxSize()
        ) {
        if (simplifiedText.isEmpty()) {
          Text(
            text = "No simplified text available.",
            style = MaterialTheme.typography.body1
            )
        } else
        Text(
          text = simplifiedText,
          style = MaterialTheme.typography.body1
         )
    }
    }
    }
    }

    
