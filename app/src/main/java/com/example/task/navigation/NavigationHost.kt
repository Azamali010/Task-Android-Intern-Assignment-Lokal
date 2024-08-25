package com.example.task.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import com.example.task.model.BottomNavItem
import com.example.task.model.JobItem
import com.example.task.view.BookmarksScreen
import com.example.task.view.JobCardDetails
import com.example.task.view.JobsScreen

@Composable
fun NavigationHost(navController: NavHostController, modifier: Modifier = Modifier,) {
    NavHost(navController, startDestination = BottomNavItem.Jobs.route, modifier = modifier) {
        composable(BottomNavItem.Jobs.route) {
            val jobs = remember {
                listOf(
                    JobItem("Wanted Tele Sales Executives", "Hyderabad", 0, 0, "9985628338"),
                    JobItem("Faculty, High School, Primary & Pre-Primary Teachers, RROs, Marketing Executives wanted for Hms, IIT/ NEET Foundation", "Suryapet", 0, 0, "7995718999"),
                    JobItem("Satyam Home Care Services wants nannies and ward boys for patient care, housework and cooking.", "Hyderabad", 18000, 25000, "6302532832"),
                    JobItem("Urgently wanted Catering Boys & Girls to work in 5 & 7 Star Hotels in Hyderabad, Packing Boys to work in Amazon, Flipkart companies", "Hyderabad", 25000, 35000, "7416071383"),
                    JobItem("Satyam Home Care Services wants nannies and ward boys for patient care, housework and cooking.", "Hyderabad", 18000, 25000, "6302532832"),
                    JobItem("Urgently wanted Catering Boys & Girls to work in 5 & 7 Star Hotels in Hyderabad, Packing Boys to work in Amazon, Flipkart companies", "Hyderabad", 25000, 35000, "7416071383"),
                )
            }
            JobsScreen(jobItems = jobs, navController = navController)
        }
        composable(BottomNavItem.Bookmarks.route) { BookmarksScreen() }
        
//        composable(route= "DetailsScreen/{location}/{salary_max}/{salary_min}/{whatsapp_no}/{title}"){
//            JobCardDetails(jobItem =jobItem)
//        }
        composable(route = "DetailsScreen"){
            JobCardDetails()
        }
    }
}
