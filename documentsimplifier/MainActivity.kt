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
