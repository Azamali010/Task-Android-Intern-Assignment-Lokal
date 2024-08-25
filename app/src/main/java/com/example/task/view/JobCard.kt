package com.example.task.view

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.task.model.JobItem

@Composable
fun JobCard(jobItem: JobItem,navController: NavHostController) {
    Box(
        modifier = Modifier.fillMaxSize()
            .background(Color(0xFF282C41))
    ) {
        Card(
            shape = RoundedCornerShape(8.dp),
            elevation = CardDefaults.cardElevation(4.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .clickable {
//                navController.navigate(route = "DetailsScreen/${jobItem.location}/${jobItem.salary_max}/${jobItem.salary_min}/${jobItem.whatsapp_no}/${jobItem.title}")
                    navController.navigate(route = "DetailsScreen")
                }
        ) {
            Column(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                Text(
                    text = "Title:${jobItem.title}",
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.padding(bottom = 8.dp)
                )

                Text(
                    text = "Location: ${jobItem.location}",
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier.padding(bottom = 4.dp)
                )

                Text(
                    text = "Salary: ₹${jobItem.salary_min} - ₹${jobItem.salary_max}",
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier.padding(bottom = 4.dp)
                )

                Text(
                    text = "Phone: ${jobItem.whatsapp_no}",
                    style = MaterialTheme.typography.bodyLarge,
                    color = MaterialTheme.colorScheme.primary,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
        }
    }
}

@Composable
fun JobsScreen(modifier: Modifier = Modifier, jobItems: List<JobItem>,navController: NavHostController) {
    LazyColumn(modifier = modifier) {
        items(jobItems) { jobItem ->
            JobCard(jobItem = jobItem,navController)
        }
    }
}