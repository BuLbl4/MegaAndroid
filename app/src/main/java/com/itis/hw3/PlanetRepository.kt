package com.itis.hw3

object PlanetRepository {
    val list: List<Planet> = listOf(
        Planet(id = 1, name = "Earth", url = "https://upload.wikimedia.org/wikipedia/commons/c/cb/The_Blue_Marble_%28remastered%29.jpg", description = "Planet Earth has the third most distant orbit.."),
        Planet(id = 2, name = "Jupiter", url = "https://upload.wikimedia.org/wikipedia/commons/c/c1/Jupiter_New_Horizons.jpg", description = "Jupiter has a mass of 318 times that..."),
        Planet(id = 3, name = "Saturn", url = "https://images.astronet.ru/pubd/2003/09/05/0001192702/saturn_vg2_big.jpg", description = "Saturn, known for its extensive ring system, has a somewhat similar structure..."),
        //Planet(id = 4, name = "Uranus", url = "https://images.immediate.co.uk/production/volatile/sites/25/2020/04/Hubble_Uranus-7f9693c.jpg", description = "Uran has a mass of 14 times more than the Earth, being the lightest among the giant planets. What makes it unique among other planets is that it ro.."),
    )

    fun getAllPlanet() : List<Planet> {
        return list
    }

    fun getPlanetFromId(id: Int) : Planet{
        var planet = list.firstOrNull{planet ->
            planet.id == id
        }
        return planet!!
    }

}