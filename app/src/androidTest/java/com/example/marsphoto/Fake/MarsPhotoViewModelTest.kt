package com.example.marsphoto.Fake

import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.marsphoto.Fake.Rules.TestDispatcherRule

import com.example.marsphotos.ui.screens.MarsUiState
import com.example.marsphotos.ui.screens.MarsViewModel
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.test.runTest
import org.junit.Rule
import org.junit.Test

class MarsPhotoViewModelTest {
    @get: Rule

    val testRule = TestDispatcherRule()

    
    @Test
    fun marsPhotoViewModel_getDataFromRepository_verifyMarsUiStateSuccess() = runTest {
  val viewModel= MarsViewModel(FakeNetWorkMarsPhotoRepository())
        assertEquals(
            MarsUiState.Success(FakeDataSource.photoLists),
           viewModel.marsUiState
        )
    }
}