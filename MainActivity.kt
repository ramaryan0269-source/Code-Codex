
package com.corecodex.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CoreCodexScreen()
        }
    }
}

@Composable
fun CoreCodexScreen() {
    val background = Color(0xFF10131A)
    val panel = Color(0xFF1B202B)
    val accent = Color(0xFF8B7CFF)

    MaterialTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = background
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(20.dp)
            ) {
                Text(
                    text = "CORE CODEX",
                    color = accent,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )

                Spacer(Modifier.height(12.dp))

                Text(
                    text = "Your coding space.",
                    color = Color.White,
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = "Create projects. Write code. Learn.",
                    color = Color.LightGray,
                    fontSize = 14.sp
                )

                Spacer(Modifier.height(24.dp))

                Button(
                    onClick = { },
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(14.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = accent
                    )
                ) {
                    Text("＋  New Project")
                }

                Spacer(Modifier.height(24.dp))

                Text(
                    text = "WORKSPACE",
                    color = Color.LightGray,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold
                )

                Spacer(Modifier.height(10.dp))

                LazyColumn(
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    item {
                        WorkspaceCard(
                            title = "My First Project",
                            subtitle = "Ready for your code",
                            panel = panel
                        )
                    }
                    item {
                        WorkspaceCard(
                            title = "AI Assistant",
                            subtitle = "Coming soon",
                            panel = panel
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun WorkspaceCard(
    title: String,
    subtitle: String,
    panel: Color
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = panel
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(18.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = title,
                    color = Color.White,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 16.sp
                )
                Spacer(Modifier.height(5.dp))
                Text(
                    text = subtitle,
                    color = Color.LightGray,
                    fontSize = 13.sp
                )
            }
            Text("›", color = Color.White, fontSize = 26.sp)
        }
    }
}
