package com.plcoding.tracker_data.mapper

import com.plcoding.tracker_data.remote.dto.Product
import com.plcoding.tracker_domain.model.TrackableFood
import kotlin.math.roundToInt

fun Product.toTrackableFood(): TrackableFood? {

    val carbs100g = this.nutriments.carbohydrates100g.roundToInt()
    val protein100g = this.nutriments.proteins100g.roundToInt()
    val fat100g = this.nutriments.fat100g.roundToInt()
    val calories100g = this.nutriments.energyKcal100g.roundToInt()

    return TrackableFood(
        name = this.productName ?: return null,
        imageUrl = this.imageFrontThumbUrl,
        carbsPer100g = carbs100g,
        proteinPer100g = protein100g,
        fatPer100g = fat100g,
        caloriesPer100g = calories100g,
    )
}