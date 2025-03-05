const fs = require('fs');
const path = require('path');
const twoSum = require('./solution');  // Import function

// ✅ Load test cases from JSON file
const testCasePath = path.join(__dirname, '../testcases.json');  
const testCases = JSON.parse(fs.readFileSync(testCasePath));

/**
 * Validate output (order-independent check)
 * @param {number[]} result - The output from twoSum function
 * @param {number[][]} expected - The list of valid answers
 * @return {boolean} - True if output matches any valid expected output
 */
function validateOutput(result, expected) {
    if (result.length == 0 && expected.length == 0)
        return true;
    
    return expected.some(valid => 
        (result[0] === valid[0] && result[1] === valid[1]) ||
        (result[0] === valid[1] && result[1] === valid[0])
    );
}

// ✅ Run tests
testCases.forEach(({ name, inputs, expected }) => {
    const { array, targetSum } = inputs;
    const result = twoSum.twoNumberSum(array, targetSum);
    
    if (validateOutput(result, expected)) {
        console.log(`✅ Passed: ${name}`);
    } else {
        console.log(`❌ Failed: ${name}`);
        console.log(`   Input: nums = ${JSON.stringify(array)}, target = ${targetSum}`);
        console.log(`   Expected: ${JSON.stringify(expected)}, Got: ${JSON.stringify(result)}\n`);
    }
});