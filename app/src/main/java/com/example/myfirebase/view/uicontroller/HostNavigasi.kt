package com.example.myfirebase.view.uicontroller

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.myfirebase.view.page.DetailSiswaScreen
import com.example.myfirebase.view.page.EditSiswaScreen
import com.example.myfirebase.view.page.EntrySiswaScreen
import com.example.myfirebase.view.page.HomeScreen
import com.example.myfirebase.view.route.DestinasiDetail
import com.example.myfirebase.view.route.DestinasiEdit
import com.example.myfirebase.view.route.DestinasiEntry
import com.example.myfirebase.view.route.DestinasiHome

@Composable
fun HostNavigasi(
    navController: NavHostController,
    modifier: Modifier = Modifier,
) {
    NavHost(
        navController = navController,
        startDestination = DestinasiHome.route,
        modifier = modifier,
    ) {
        composable(DestinasiHome.route) {
            HomeScreen(
                navigateToItemEntry = {
                    navController.navigate(DestinasiEntry.route)
                },
                navigateToItemUpdate = { id ->
                    navController.navigate("${DestinasiDetail.route}/$id")
                },
            )
        }

        composable(DestinasiEntry.route) {
            EntrySiswaScreen(
                navigateBack = {
                    navController.navigateUp()
                },
            )
        }

        composable(
            DestinasiDetail.routeWithArgs,
            arguments =
                listOf(
                    navArgument
                        (DestinasiDetail.itemIdArg) {
                        type = NavType.StringType
                    },
                ),
        ) {
            DetailSiswaScreen(
                navigateToEditItem = { navController.navigate("${DestinasiEdit.route}/$it") },
                navigateBack = { navController.navigate(DestinasiHome.route) },
            )
        }
        composable(
            DestinasiEdit.routeWithArgs,
            arguments =
                listOf(
                    navArgument
                        (DestinasiEdit.itemIdArg) {
                        type = NavType.StringType
                    },
                ),
        ) {
            EditSiswaScreen(
                navigateBack = { navController.navigate(DestinasiHome.route) },
                onNavigateUp = { navController.navigateUp() },
            )
        }
    }
}