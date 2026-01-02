package com.example.myfirebase.view.uicontroller

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.myfirebase.view.page.EntrySiswaScreen
import com.example.myfirebase.view.page.HomeScreen
import com.example.myfirebase.view.route.DestinasiDetail
import com.example.myfirebase.view.route.DestinasiEntry
import com.example.myfirebase.view.route.DestinasiHome

@Composable
fun HostNavigasi(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = DestinasiHome.route,
        modifier = modifier
    ) {
        composable(DestinasiHome.route) {
            HomeScreen(
                navigateToItemEntry = {
                    navController.navigate(DestinasiEntry.route)
                },
                navigateToItemUpdate = { id ->
                    navController.navigate("${DestinasiDetail.route}/$id")
                }
            )
        }

        composable(DestinasiEntry.route) {
            EntrySiswaScreen(
                navigateBack = {
                    navController.navigateUp()
                }
            )
        }

        // kalau nanti mau detail / edit
        // composable(
        //     route = DestinasiDetail.routeWithArgs,
        //     arguments = listOf(navArgument(DestinasiDetail.itemIdArg) {
        //         type = NavType.IntType
        //     })
        // ) { backStackEntry ->
        //     val id = backStackEntry.arguments?.getInt(DestinasiDetail.itemIdArg)
        // }
    }
}