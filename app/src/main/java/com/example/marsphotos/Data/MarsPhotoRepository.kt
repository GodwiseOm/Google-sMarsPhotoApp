package com.example.marsphotos.Data

import com.example.marsphotos.model.MarsPhoto

import com.example.marsphotos.network.MarsApiService

interface MarsPhotoRepository {
    suspend fun getPhotos():List<MarsPhoto>
}
class NetworkMarsPhotosRepository(private val marsApiService: MarsApiService): MarsPhotoRepository{
    override suspend fun getPhotos():List<MarsPhoto>
     = marsApiService.getPhotos()

}