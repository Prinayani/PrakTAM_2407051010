package com.example.belajarandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.belajarandroid.model.ExpenseSource
import com.example.belajarandroid.model.SmartExpenseNote
import com.example.belajarandroid.ui.theme.BelajarAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BelajarAndroidTheme {
                Box(modifier = Modifier.safeDrawingPadding()) {
                    ExpenseApp(
                        name = "Neti Prinayani",
                        npm = "2407051010"
                    )
                }
            }
        }
    }
}

@Composable
fun ExpenseApp(name: String, npm: String) {
    val allExpenses = ExpenseSource.dummyExpenses

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(24.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        item {
            Column {
                Text(text = "Identitas Pemilik:", style = MaterialTheme.typography.labelSmall)
                Text(text = name, fontWeight = FontWeight.Bold)
                Text(text = "NPM: $npm")
                Spacer(modifier = Modifier.height(16.dp))
            }
        }

        items(allExpenses) { expense ->
            ExpenseDetailScreen(expense = expense)
        }
    }
}

@Composable
fun ExpenseDetailScreen(expense: SmartExpenseNote) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Image(
            painter = painterResource(id = expense.imageRes),
            contentDescription = expense.nama,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = expense.nama,
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = expense.deskripsi,
            style = MaterialTheme.typography.bodyLarge
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Harga: Rp ${expense.harga}",
            style = MaterialTheme.typography.bodyLarge,
            color = MaterialTheme.colorScheme.primary,
            fontWeight = FontWeight.SemiBold
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Pesan Sekarang")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ExpenseAppPreview() {
    BelajarAndroidTheme {
        ExpenseApp(
            name = "Neti Prinayani",
            npm = "2407051010"
        )
    }
}