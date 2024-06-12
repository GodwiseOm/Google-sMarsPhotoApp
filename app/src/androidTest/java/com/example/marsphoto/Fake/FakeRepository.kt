package com.example.marsphoto.Fake

import com.example.marsphotos.Data.MarsPhotoRepository
import com.example.marsphotos.model.MarsPhoto

class FakeRepository: MarsPhotoRepository {
    override suspend fun getPhotos(): List<MarsPhoto> {
        return  FakeDataSource.photoLists
}}