import android accessibilityservice.AccessiblityService

import android view.accessibility.AccessibilityEvent
import android view.accessiblityAccessibilityNodeInfo

class DocumentSimplifierAccessibilityService : AccessibilityService() {
  override fun onAccessibilityEvent (event AccessibilityEvent?) {
(event == null) return

   if (event.eventType == AccessibilityEvent.TYPE_WINDOW_CONTENT_CHANGED ||
       event.eventType == AccessibilityEvent.TYPE_VIEW_TEXT_CHANGED) {
     
    val rootnode = rootInActive ?: return
   
    val extractedText = extractTextfromNode(rootnode)
     //Display simplified text
    val simplifiedText = simplifiedText(extractedText)
     //Display simple  UI
    showSimplifiedText(simplifiedText)
   }
  }

  override fun onInterrupt() {
    //
  }

  private fun extractTextFromNode(node: AccessibilityNodeInfo):
    val sb = StringBuilder()
    fun recurse(n: Accessibility node info?) {
          if (n == null) return
        if (n.text != null) {
       sb.append(n.text).append("")
        }
        for (i in 0 until n.childcount) {
          recurse(n.getChild(i))
        }
    }
    recurse(node)
    return sb.toString()
}
      
      
      
      
      private fun simplifyText (text: String): String {
  
  
    return text
  
    
    private fun showSimplifiedText(text: String) {


}
}
