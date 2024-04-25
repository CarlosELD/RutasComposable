package net.GoogleMapApi.RutasCompose

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.platform.location.locationupdates.LocationUpdatesScreen
import com.example.platform.location.permission.LocationPermissionScreen
import net.GoogleMapApi.RutasCompose.ui.location.CurrentLocationScreen
import net.GoogleMapApi.RutasCompose.ui.mapas.Contrilling
import net.GoogleMapApi.RutasCompose.ui.mapas.Customizing
import net.GoogleMapApi.RutasCompose.ui.mapas.Mapa
import net.GoogleMapApi.RutasCompose.ui.mapas.MiPrimerMapa
import net.GoogleMapApi.RutasCompose.ui.mapas.RecomposingElements
import net.GoogleMapApi.RutasCompose.ui.mapas.StreetViewScreen
import net.GoogleMapApi.RutasCompose.ui.mapas.StreetViewScreen
import net.GoogleMapApi.RutasCompose.ui.theme.MiLocalizacionYMapasBTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MiLocalizacionYMapasBTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                        //LocationPermissionScreen()
                        //CurrentLocationScreen()
                        //LocationUpdatesScreen()
                        MiPrimerMapa()
                        //Mapa()
                        //RecomposingElements()
                        //Customizing()
                        //StreetViewScreen()
                        Contrilling()
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MiLocalizacionYMapasBTheme {
        Greeting("Android")
    }
}