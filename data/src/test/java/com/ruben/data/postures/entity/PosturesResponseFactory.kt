package com.ruben.data.postures.entity

class PosturesResponseFactory {

    companion object {
        fun providesPostureListResponse() =
            listOf(providesPostureResponse(), providesPostureResponse())

        private fun providesPostureResponse(
            id: String = "5df111bd23f72ffeefe0fa31",
            name: String = "Inversion on block",
            picture: String = "https://loremflickr.com/320/320/yoga,asana",
            description: String = "The posture inversion on block lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
        ) = PostureResponse(
            id = id,
            name = name,
            picture = picture,
            description = description
        )

        fun providesPostureDetailListResponse() =
            listOf(providesPostureDetailResponse(), providesPostureDetailResponse())

        private fun providesPostureDetailResponse(
            id: String = "5df111bd23f72ffeefe0fa31",
            name: String = "Inversion on block",
            picture: String = "https://loremflickr.com/320/320/yoga,asana",
            description: String = "The posture inversion on block lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
            teacher: String = "Hedwig Winter",
            duration: String = "23 min."
        ) = PostureDetailResponse(
            id = id,
            name = name,
            picture = picture,
            description = description,
            teacher = teacher,
            duration = duration
        )

    }

}