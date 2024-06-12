package com.example.marsphoto.Fake

import com.example.marsphotos.Data.NetworkMarsPhotosRepository
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.test.runTest
import org.junit.Test

class MarsPhotoRepositoryTest {

    @Test
    fun netWorkMarsPhotoRepository_getPhoto_verifyPhotoList()= runTest{
        val repository = NetworkMarsPhotosRepository(marsApiService = FakeMarsPhotoApiService())

 assertEquals(repository.getPhotos(), FakeDataSource.photoLists)
    }}
