const fs = require('fs');
const path = require('path');
const twoSum = require('./solution');  // Import function

// ✅ Load test cases from JSON file
const testCasePath = path.join(__dirname, 'testcases.json');  
const testCases = JSON.parse(fs.readFileSync(testCasePath));

/**
 * Validate output (order-independent check)
 * @param {number[]} result - The output from twoSum function
 * @param {number[][]} expected - The list of valid answers
 * @return {boolean} - True if output matches any valid expected output
 */
function validateOutput(result, expected) {
    return expected.some(valid => 
        (result[0] === valid[0] && result[1] === valid[1]) ||
        (result[0] === valid[1] && result[1] === valid[0])
    );
}

// ✅ Run tests
testCases.forEach(({ description, input, expected }) => {
    const { nums, target } = input;
    const result = twoSum(nums, target);

    if (validateOutput(result, expected)) {
        console.log(`✅ Passed: ${description}`);
    } else {
        console.log(`❌ Failed: ${description}`);
        console.log(`   Input: nums = ${JSON.stringify(nums)}, target = ${target}`);
        console.log(`   Expected: ${JSON.stringify(expected)}, Got: ${JSON.stringify(result)}\n`);
    }
});
