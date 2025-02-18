/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var subarraySum = function (nums, k) {
    let totalSubArrays = 0
    let sum = 0
    const map = new Map().set(0, 1)

    for (let i = 0; i < nums.length; i++) {
        sum += nums[i]

        if (map.has(sum - k))
            totalSubArrays += map.get(sum - k)

        if (map.has(sum))
            map.set(sum, map.get(sum) + 1)
        else
            map.set(sum, 1)
    }

    return totalSubArrays;
};