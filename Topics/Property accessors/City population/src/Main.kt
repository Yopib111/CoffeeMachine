class City(val name: String) {
    var population: Int = 0
        set(value) {
            if (value < 0) field = 0
            if (value > 50000000) field = 50000000
            if (value < 50000000 && value > 0) field = value

        }
}
