package com.savchuk.andrew.home.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.savchuk.andrew.home.domain.usecases.GetSectionsUseCase
import com.savchuk.andrew.nestedrecyclertest.domain.entities.SectionEntities
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

data class HomeState(
    var isLoading: Boolean,
    var sectionList: List<SectionEntities>,
)

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getSectionsUseCase: GetSectionsUseCase,
    private val homeRouter: HomeRouter
) : ViewModel() {

    private val _homeState: MutableLiveData<HomeState> = MutableLiveData()
    val homeState: LiveData<HomeState> get() = _homeState

    init {
        viewModelScope.launch {
            _homeState.value?.sectionList = getSectionsUseCase.invoke()
        }
    }

    fun launchDetailProduct(productId: Int) {
        homeRouter.launchProductDetail(productId)
    }

    fun launchProductMore(sectionId: Int) {
        homeRouter.launchMoreProducts(sectionId)
    }
}