package com.hyeongrok.spongebob

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.accompanist.web.WebContent
import com.google.accompanist.web.WebViewNavigator
import com.google.accompanist.web.WebViewState

class MainViewModel: ViewModel() {
    val webViewState = WebViewState(
        WebContent.Url(
            url = "https://vue-spongebob.netlify.app/",
            additionalHttpHeaders = emptyMap()
        )
    )
    val webViewNavigator = WebViewNavigator(viewModelScope)
}