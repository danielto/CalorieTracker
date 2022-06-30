package com.plcoding.onboarding_presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.plcoding.core_ui.LocalSpacing

@Composable
fun SelectableButton(
    text: String,
    isSelected: Boolean,
    color: Color,
    selectedTextColor: Color,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    textStyle: TextStyle = MaterialTheme.typography.button,
) {
    val roundedCornerShape = RoundedCornerShape(100.dp)

    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .clip(roundedCornerShape)
            .border(
                width = 2.dp,
                color = color,
                shape = roundedCornerShape
            )
            .background(
                color = if (isSelected) color else Color.Transparent,
                shape = roundedCornerShape
            )
            .clickable {
                onClick()
            }
            .padding(LocalSpacing.current.spaceMedium),
    ) {
        Text(
            text = text,
            style = textStyle,
            color = if (isSelected) selectedTextColor else color,
        )
    }
}

@Preview
@Composable
fun SelectableButtonPreview() {
    SelectableButton(
        text = "text",
        isSelected = true,
        color = Color.Green,
        selectedTextColor = Color.Green,
        onClick = {  }
    )
}