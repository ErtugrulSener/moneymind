package com.lead.nevertell

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.lead.nevertell.components.verticalbar.BarSamplePlot
import com.lead.nevertell.components.verticalbar.TickPositionState
import io.github.koalaplot.core.xygraph.TickPosition
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        Column(
            modifier = Modifier
                .safeContentPadding()
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            BarSamplePlot(
                thumbnail = false,
                tickPositionState = TickPositionState(TickPosition.None, TickPosition.None),
                title = "moneymind"
            )
        }
    }
}
