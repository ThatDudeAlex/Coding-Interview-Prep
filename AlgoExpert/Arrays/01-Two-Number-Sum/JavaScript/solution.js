function twoNumberSum(array, targetSum) {
  // Write your code here.
  const numbers_seen = new Set();

  for (number of array) {
    const match = targetSum - number;

    if (numbers_seen.has(match)) {
      return [match, number];
    }
    numbers_seen.add(number);
  }
  return [];
}

// Do not edit the line below.
exports.twoNumberSum = twoNumberSum;
