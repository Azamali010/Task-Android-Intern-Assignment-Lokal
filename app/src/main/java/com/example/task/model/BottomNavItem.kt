package com.example.task.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person


sealed class BottomNavItem(val route: String, val icon: androidx.compose.ui.graphics.vector.ImageVector, val title: String) {
    object Jobs : BottomNavItem("jobs", Icons.Filled.Person, "Jobs")
    object Bookmarks : BottomNavItem("bookmarks", Icons.Filled.AddCircle, "Bookmarks")
}