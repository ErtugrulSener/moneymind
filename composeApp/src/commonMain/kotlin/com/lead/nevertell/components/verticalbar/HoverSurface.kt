package com.lead.nevertell.components.verticalbar

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun HoverSurface(modifier: Modifier = Modifier, content: @Composable () -> Unit) {
    Surface(
        shadowElevation = 2.dp,
        shape = MaterialTheme.shapes.medium,
        color = Color.LightGray,
        modifier = modifier.padding(padding)
    ) {
        Box(modifier = Modifier.padding(padding)) {
            content()
        }
    }
}
