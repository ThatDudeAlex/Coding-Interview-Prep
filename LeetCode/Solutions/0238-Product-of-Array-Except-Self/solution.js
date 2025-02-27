/**
 * @param {number[]} nums
 * @return {number[]}
 */
var productExceptSelf = function (nums) {
    const left = new Array(nums.length)
    const right = new Array(nums.length)
    const answer = new Array(nums.length)

    for (let i = 0; i < nums.length; i++) {
        if (i === 0)
            left[i] = 1
        else
            left[i] = nums[i - 1] * left[i - 1]
    }

    for (let i = nums.length - 1; i >= 0; i--) {
        if (i === nums.length - 1)
            right[i] = 1
        else
            right[i] = nums[i + 1] * right[i + 1]
    }

    for (let i = 0; i < nums.length; i++) {
        answer[i] = left[i] * right[i]
    }

    return answer
};