import random

game_start = input("Would you like to play slot machine. y/n ")
print("")

if game_start == "y":
    coin_num = int(input("How many vBucks you want to start with "))
    print("")

    while coin_num > 0:
        pull = input("Press p to pull slot machine ")
        print("")

        wheel1 = random.randint(0, 3)
        wheel2 = random.randint(0, 3)
        wheel3 = random.randint(0, 3)
        print("You rolled a ", wheel1, wheel2,wheel3)
        print("")

        if wheel1==1 and wheel2 ==1 and wheel3 ==1:
            coin_num += 1
            print("Congats you won 1 vBuck")
            print("vBucks:", coin_num)
            print("")

        elif wheel1==2 and wheel2 ==2 and wheel3 ==2:
            coin_num += 5
            print("Congats you won 5 vBuck")
            print("vBucks:",coin_num)
            print("")

        elif wheel1 == 3 and wheel2 == 3 and wheel3 == 3:
            coin_num += 1
            print("Congats you won 10 vBuck")
            print("vBucks:", coin_num)
            print("")

        else:
            print("Sorry you didn't win")
            print("vBucks:", coin_num)
            print("")


        coin_num += -1
    print("You're all out of vBucks")

else:
    print("Bye")
