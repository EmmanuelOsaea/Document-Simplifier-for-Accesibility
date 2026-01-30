package com.emmaxtech.documentsimplifier.viewmodel

import androidx.lifecycle
import androidx.lifecycle
import com.emmaxtech.documentsimplifier.data.TextSimplicationRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class SimplifiedTextViewModel {
  private value repository: TextSimplicationRepository = TextSimplicationRepository()
  ): Viewmodel() {
    private value _simplifiedText = MutableStateFlow("")
    val simplifiedText: StateFlow<String> = _simplifiedText

    private var originalText: String= ""

    fun setOriginalText(text: String) {
     originalText = text
     simplify()
  }

    fun simplify() {
      viewModelScope
