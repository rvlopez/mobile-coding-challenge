package com.ruben.domain.postures.entity

class PosturesFactory {

    companion object {
        fun providesPostureList() = listOf(providesPosture(), providesPosture())

        private fun providesPosture(
            id: String = "5df111bd23f72ffeefe0fa31",
            name: String = "Inversion on block",
            picture: String = "https://loremflickr.com/320/320/yoga,asana",
            description: String = "The posture inversion on block lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
        ) = Posture(
            id = id,
            name = name,
            picture = picture,
            description = description
        )

        fun providesPostureDetail(
            id: String = "5df111bd23f72ffeefe0fa31",
            name: String = "Inversion on block",
            picture: String = "https://loremflickr.com/320/320/yoga,asana",
            description: String = "The posture inversion on block lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
            teacher: String = "Hedwig Winter",
            duration: String = "23 min."
        ) = PostureDetail(
            id = id,
            name = name,
            picture = picture,
            description = description,
            teacher = teacher,
            duration = duration
        )
    }

}