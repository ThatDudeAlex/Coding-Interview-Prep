/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function (nums, target) {
    const hashTable = new Map();

    for (let i = 0; i < nums.length; i++) {
        const number = target - nums[i]

        if (hashTable.has(number))
            return [i, hashTable.get(number)]
        hashTable.set(nums[i], i)
    }
};

module.exports = twoSum;