/**
 * @param {number} n
 * @return {boolean}
 */
var isHappy = function (n) {
    const numString = n.toString()
    const map = new Map();

    return addNumbers(numString, map);
};

const addNumbers = (numString, map) => {
    let sumOfSquares = 0;

    for (let i = 0; i < numString.length; i++) {
        const numValue = parseInt(numString[i])
        sumOfSquares += numValue * numValue
    }

    if (sumOfSquares === 1) {
        return true;
    }
    else if (!map.has(sumOfSquares)) {
        map.set(sumOfSquares, true);
        return addNumbers(sumOfSquares.toString(), map)
    }

    return false
}