const maxProfit = (prices) => {

    let lowest = 9999;
    let highest = 0;
    let profit = 0;
    let finalProfit = 0;
    const arrayLength = prices.length;

    if (arrayLength === 1 || arrayLength === 0 || arrayLength === null)
        return 0;

    for (let i = 0; i < arrayLength; i++) {
        if (prices[i] < lowest) {
            lowest = prices[i];
            highest = prices[i];
        }
        else if (prices[i] > highest) {
            highest = prices[i];
            profit = highest - lowest;

            if (profit > finalProfit)
                finalProfit = profit;
        }
    }

    return finalProfit;
};