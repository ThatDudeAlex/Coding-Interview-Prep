/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNumber = function (nums) {
    const unique = new Set()

    for (const number of nums) {
        if (unique.has(number))
            unique.delete(number)
        else
            unique.add(number)
    }
    return unique.values().next().value
};