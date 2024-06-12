package com.example.marsphoto.Fake

import com.example.marsphotos.Data.MarsPhotoRepository
import com.example.marsphotos.model.MarsPhoto

class FakeNetWorkMarsPhotoRepository:MarsPhotoRepository {
    override suspend fun getPhotos(): List<MarsPhoto> {
        TODO("Not yet implemented")
        return  FakeDataSource.photoLists
    }
}