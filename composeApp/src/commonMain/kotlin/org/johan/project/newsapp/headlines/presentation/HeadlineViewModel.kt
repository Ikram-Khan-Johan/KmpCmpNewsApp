package org.johan.project.newsapp.headlines.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.johan.newsapp.utils.Resource
import com.johan.newsapp.utils.articles
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import org.johan.project.newsapp.headlines.data.Article

public class HeadlineViewModel : ViewModel() {

    private  val _newResources = MutableStateFlow<Resource<List<Article>>>(Resource.Idle)
    val newResources = _newResources.asStateFlow()

    init {
        GetHeadlines()
    }


   private fun GetHeadlines() {
        viewModelScope.launch ( Dispatchers.IO ) {
            _newResources.emit(Resource.Loading)
            delay(2000)
            try {
                val response = articles
                _newResources.emit(Resource.Success(response))
            } catch (e : Exception) {
                _newResources.emit(Resource.Error(e.message ?: "An Error Occured"))
            }

        }
    }

}