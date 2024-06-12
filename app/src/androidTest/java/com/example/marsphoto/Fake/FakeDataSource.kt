package com.example.marsphoto.Fake

import com.example.marsphotos.model.MarsPhoto

object FakeDataSource {

    val idOne = "1"
    val idTwo = "2"
    val imgOne = "url.1"
    val imgTwo = "url.2"

    val photoLists = listOf(
        MarsPhoto(idOne, imgOne),MarsPhoto(idTwo, imgTwo)
    )


}