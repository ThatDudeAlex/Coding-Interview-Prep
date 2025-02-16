def nonConstructibleChange(coins):
    # Write your code here.
    coins.sort()

    if coins == None or len(coins) == 0 or coins[0] != 1:
        return 1

    change = 0

    for coin in coins:
        if coin > change + 1:
            return change + 1
        change += coin
        
    return change + 1
