package com.plcoding.tracker_domain.use_case

data class TrackerUseCases(
    val trackFoodUseCase: TrackFoodUseCase,
    val searchFoodUseCase: SearchFoodUseCase,
    val getFoodForDateUseCase: GetFoodForDateUseCase,
    val deleteTrackedFoodUseCase: DeleteTrackedFoodUseCase,
    val calculateMealNutrientsUseCase: CalculateMealNutrientsUseCase
)
