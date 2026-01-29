setContent {
  var simplifiedText by remember { mutableStateOf("Hello! Simplified text will appear here.")}

  SimplifiedTextScreen {
    simplifiedText = simplifiedText,
    onRefresh = {
     //logic to re-simplify text or reloaf
    simplifiedText = "Refreshed simplified text"
    }
    )
  }
