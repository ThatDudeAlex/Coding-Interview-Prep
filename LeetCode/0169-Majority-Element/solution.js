/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function (nums) {
    const hashTable = {};
    const majorityElement = { element: 0, count: 0 };

    for (let i = 0; i < nums.length; i++) {
        if (!hashTable.hasOwnProperty(nums[i])) {
            hashTable[nums[i]] = { count: 1 }
        }
        else if (hashTable.hasOwnProperty(nums[i]))
            hashTable[nums[i]].count += 1

        if (hashTable[nums[i]].count > majorityElement.count) {
            majorityElement.element = nums[i]
            majorityElement.count = hashTable[nums[i]].count
        }
    }

    return majorityElement.element
};