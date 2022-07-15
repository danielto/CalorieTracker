package com.plcoding.calorytracker.navigation

//import com.plcoding.tracker_presentation.destinations.SearchScreenDestination
//import com.plcoding.tracker_presentation.destinations.TrackerOverviewScreenDestination
//import com.plcoding.tracker_presentation.search.SearchScreenNavigator
//import com.plcoding.tracker_presentation.tracker_overview.TrackerOverviewScreenNavigator
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.navigation.NavController
import coil.annotation.ExperimentalCoilApi
import com.plcoding.onboarding_presentation.OnboardingNavigator
import com.plcoding.onboarding_presentation.destinations.*
import com.ramcosta.composedestinations.navigation.navigate
import com.ramcosta.composedestinations.spec.DestinationSpec
import java.lang.IllegalStateException

@ExperimentalCoilApi
@ExperimentalComposeUiApi
class CoreFeatureNavigator(
    private val currentDestination: DestinationSpec<*>,
    private val navController: NavController
) :
//    SearchScreenNavigator,
//    TrackerOverviewScreenNavigator,
    OnboardingNavigator {

    override fun navigateToNextScreen() {
        currentDestination as? OnboardingDestination
            ?: throw RuntimeException("Trying to use Onboarding navigator from a non onboarding screen")
        val nextDirection = when (currentDestination) {
            WelcomeScreenDestination -> GenderScreenDestination
            GenderScreenDestination -> AgeScreenDestination
            AgeScreenDestination -> HeightScreenDestination
            HeightScreenDestination -> WeightScreenDestination
            WeightScreenDestination -> ActivityScreenDestination
            ActivityScreenDestination -> GoalScreenDestination
            GoalScreenDestination -> NutrientGoalScreenDestination
//            NutrientGoalScreenDestination -> TrackerOverviewScreenDestination
            else -> {
               throw IllegalStateException("Destination is not specified")
            }
        }
        navController.navigate(nextDirection)
    }

//    override fun navigateUp() {
//        navController.navigateUp()
//    }

//    override fun navigateToSearch(mealName: String, dayOfMonth: Int, month: Int, year: Int) {
//        navController.navigateTo(
//            SearchScreenDestination(
//                mealName = mealName,
//                dayOfMonth = dayOfMonth,
//                month = month,
//                year = year
//            )
//        )
//    }

}