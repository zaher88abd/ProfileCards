package ca.zaher.profilecards

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ca.zaher.profilecards.ui.theme.ProfileCardsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProfileCard()
        }
    }
}

@Composable fun ProfileCard() {
    Card(modifier = Modifier.fillMaxWidth()) {
        Row() {
            ProfilePicture()
            ProfileContent()
        }
    }
}

@Composable fun ProfilePicture() {
    TODO("Not yet implemented")
}

@Composable fun ProfileContent() {
    TODO("Not yet implemented")
}


@Preview(showBackground = true) @Composable fun DefaultPreview() {
    ProfileCardsTheme {
        ProfileCard()
    }
}
