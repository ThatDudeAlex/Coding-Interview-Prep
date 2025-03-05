function isValidSubsequence(array, sequence) {
  // Write your code here.
  let currSequenceIndex = 0;

  for (const number of array) {
    if (sequence[currSequenceIndex] === number) {
      currSequenceIndex++;
    }

    if (currSequenceIndex === sequence.length) {
      return true;
    }
  }
  return false;
}

// Do not edit the line below.
exports.isValidSubsequence = isValidSubsequence;
