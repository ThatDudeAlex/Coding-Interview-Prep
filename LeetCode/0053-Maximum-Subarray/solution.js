/**
 * @param {number[]} nums
 * @return {number}
 */
const maxSubArray = (nums) => {
    let maxSum = 0;
    let currentSum = 0;
    const arrayLength = nums.length;

    if (arrayLength === 0 || arrayLength === null)
        return 0;
    else if (arrayLength === 1)
        return nums[0];

    maxSum = currentSum = nums[0];

    for (let i = 1; i < arrayLength; i++) {

        if (currentSum < 0)
            currentSum = nums[i];
        else if ((currentSum + nums[i]) > 0)
            currentSum += nums[i];
        else
            currentSum = nums[i];

        if (currentSum > maxSum)
            maxSum = currentSum;
    }

    return maxSum;

};