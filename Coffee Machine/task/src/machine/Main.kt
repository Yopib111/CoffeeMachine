package machine

class CoffeeMachine (line: String) {
    var stroka: String = line
    var water = 400
    var milk = 540
    var coffee = 120
    var money = 550
    var cups = 9
    var coffeeSort = "1"
}

val machineOurs = CoffeeMachine("")

fun main() {

    do {
        println("Write action (buy, fill, take, remaining, exit)):")
        val action = readln()
        machineOurs.stroka = action
        when (machineOurs.stroka) {
            "remaining" -> {
                remaining()
            }

            "buy" -> {
                println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:")
                machineOurs.coffeeSort = readln()
                when (machineOurs.coffeeSort) {
                    "1" -> {
                        if (machineOurs.water - 250 >= 0 && machineOurs.coffee - 16 >= 0) {
                            println("I have enough resources, making you a coffee!")
                            machineOurs.water -= 250
                            machineOurs.coffee -= 16
                            machineOurs.cups -= 1
                            machineOurs.money += 4
                        } else {
                            if (machineOurs.water - 250 < 0) {
                                println("Sorry, not enough water!")
                            }
                            if (machineOurs.coffee - 16 < 0) {
                                println("Sorry, not enough coffee!")
                            }
                        }

                    }

                    "2" -> {
                        if ((machineOurs.water - 350 >= 0) && (machineOurs.milk - 75 >=0) && (machineOurs.coffee - 20 >= 0)) {
                            println("I have enough resources, making you a coffee!")
                            machineOurs.water -= 350
                            machineOurs.coffee -= 20
                            machineOurs.milk -= 75
                            machineOurs.cups -= 1
                            machineOurs.money += 7
                        } else {
                            if (machineOurs.water - 350 < 0) {
                                println("Sorry, not enough water!")
                            }
                            if (machineOurs.milk - 75 < 0) {
                                println("Sorry, not enough milk!")
                            }
                            if (machineOurs.coffee - 20 < 0) {
                                println("Sorry, not enough coffee!")
                            }
                        }
                        }

                    "3" -> {
                        if ((machineOurs.water - 200 >= 0) && (machineOurs.milk - 100 >=0) && (machineOurs.coffee - 12 >= 0)) {
                            println("I have enough resources, making you a coffee!")
                            machineOurs.water -= 200
                            machineOurs.coffee -= 12
                            machineOurs.milk -= 100
                            machineOurs.cups -= 1
                            machineOurs.money += 6
                        } else {
                            if (machineOurs.water - 200 < 0) {
                                println("Sorry, not enough water!")
                            }
                            if (machineOurs.milk - 100 < 0) {
                                println("Sorry, not enough milk!")
                            }
                            if (machineOurs.coffee - 12 < 0) {
                                println("Sorry, not enough coffee!")
                            }
                        }
                    }
                    "back" -> continue
                }
            }

            "fill" -> {
                println("Write how many ml of water you want to add:")
                val addWater = readln().toInt()
                machineOurs.water += addWater
                println("Write how many ml of milk you want to add:")
                val addMilk = readln().toInt()
                machineOurs.milk += addMilk
                println("Write how many grams of coffee beans you want to add:")
                val addCoffee = readln().toInt()
                machineOurs.coffee += addCoffee
                println("Write how many disposable cups you want to add:")
                val addCups = readln().toInt()
                machineOurs.cups += addCups
            }

            "take" -> {
                println("I gave you $${machineOurs.money}")
                machineOurs.money = 0
                }
            }



    } while (machineOurs.stroka != "exit")

}

fun remaining() {
    println("""

        The coffee machine has:
        ${machineOurs.water} ml of water
        ${machineOurs.milk} ml of milk
        ${machineOurs.coffee} g of coffee beans
        ${machineOurs.cups} disposable cups
        $${machineOurs.money} of money

    """.trimIndent())
}