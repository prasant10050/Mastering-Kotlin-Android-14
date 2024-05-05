package com.mastering.kotlin

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun PacktColumn() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Android")
        Text(text = "Kotlin")
        Text(text = "Compose")
    }
}

@Composable
fun PackRow() {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = "Android")
        Text(text = "Kotlin")
        Text(text = "Compose")
    }
}

@Composable
fun PacktBox() {
    Box(
        modifier = Modifier.size(100.dp),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            modifier = Modifier.size(80.dp),
            imageVector = Icons.Outlined.Notifications,
            contentDescription = null,
            tint = Color.Green
        )
        Text(text = "9")
    }
}

@Composable
fun PacktLazyColumn() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
    ) {
        items(100) {
            Text(modifier = Modifier.padding(8.dp), text = "Item number $it")
        }
    }
}

@Composable
fun PacktLazyRow() {
    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.LightGray).padding(8.dp)
    ) {
        items(100) {
            Text(modifier = Modifier.padding(8.dp), text = "Item number $it")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PacktColumnPreview() {
    PacktColumn()
}

@Preview(showBackground = true)
@Composable
fun PacktRowPreview() {
    PackRow()
}

@Preview(showBackground = true)
@Composable
fun PacktBoxPreview() {
    PacktBox()
}

@Preview(showBackground = true)
@Composable
fun PacktLazyColumnPreview() {
    PacktLazyColumn()
}

@Preview(showBackground = true)
@Composable
fun PacktLazyRowPreview() {
    PacktLazyRow()
}