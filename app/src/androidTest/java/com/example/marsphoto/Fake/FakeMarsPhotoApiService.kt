package com.example.marsphoto.Fake

import com.example.marsphotos.model.MarsPhoto
import com.example.marsphotos.network.MarsApiService

class FakeMarsPhotoApiService:MarsApiService {
    override suspend fun getPhotos():List<MarsPhoto> {
        return FakeDataSource.photoLists
    }
}