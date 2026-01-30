import android.os.bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.LaunchedEffect

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate
     setContent {
       val viewmodel = androidx.lifecycle.viewmodel.compose.viewmodel<simplifiedTextViewModel>()
       
       LaunchedEffect(Unit) {
         viewmodel.setOriginalText("This is a arduous text that needs to be simplified")
       }
       SimplifiedTextScreenWithViewModel = viewModel)
     }
  }
}










setContent {
  var simplifiedText by remember { mutableStateOf("Hello! Simplified text will display here.")}

  SimplifiedTextScreen {
    simplifiedText = simplifiedText,
    onRefresh = {
     //logic to re-simplify text or reload
    simplifiedText = "Refreshed simplified text"
    }
    )
  }
