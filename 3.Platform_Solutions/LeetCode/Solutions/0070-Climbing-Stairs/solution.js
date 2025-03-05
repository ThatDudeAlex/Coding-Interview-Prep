/**
 * @param {number} n
 * @return {number}
 */
var climbStairs = function (n) {
    const memo = new Array(n + 1)

    const value = calcDistinctWays(n, memo)
    return value;
};

const calcDistinctWays = (n, memo) => {
    let result = 0;
    if (memo[n] != undefined)
        return memo[n]
    if (n <= 0)
        return 0;
    if (n === 2)
        result = 2;
    else if (n === 1)
        result = 1;
    else
        result = calcDistinctWays((n - 1), memo) + calcDistinctWays((n - 2), memo);

    memo[n] = result;
    return result;
}