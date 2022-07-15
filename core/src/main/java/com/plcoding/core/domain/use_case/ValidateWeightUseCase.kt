package com.plcoding.core.domain.use_case

class ValidateWeightUseCase {
    operator fun invoke(text: String): Boolean {
        return text.toFloatOrNull() != null
    }
}