/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var moveZeroes = function (nums) {
    const zerosIndex = []

    for (let i = 0; i < nums.length; i++) {
        if (nums[i] === 0)
            zerosIndex.push(i);
    }

    while (zerosIndex.length > 0) {
        nums.splice(zerosIndex.pop(), 1)
        nums.push(0)
    }
};
