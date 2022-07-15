package com.plcoding.core.util

sealed class UiEvent {
    data class Navigate(val route: String): UiEvent()
    object NavigateUp: UiEvent()
    object NavigateToNextScreen: UiEvent()
    data class SnowSnackbar(val text: UiText): UiEvent()
}