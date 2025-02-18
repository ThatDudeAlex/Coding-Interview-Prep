/**
 * @param {number[]} nums
 * @return {number[]}
 */
var findDisappearedNumbers = function (nums) {
    const hashTable = {};
    const disapperingNums = [];


    for (let i = 0; i < nums.length; i++) {
        if (!hashTable.hasOwnProperty(nums[i]))
            hashTable[nums[i]] = true
    }

    for (let i = 1; i <= nums.length; i++) {
        if (!hashTable.hasOwnProperty(i))
            disapperingNums.push(i)
    }

    return disapperingNums;
};