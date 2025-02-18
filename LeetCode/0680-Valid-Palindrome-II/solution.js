/**
 * @param {string} s
 * @return {boolean}
 */
var validPalindrome = function (s) {
    const len = s.length

    for (let i = 0; i < len / 2; i++) {
        if (s.charAt(i) !== s.charAt(len - i - 1) && (i + 1) !== len / 2) {
            const newLen = len - i - 1
            return isPalindrome(i + 1, newLen, s) || isPalindrome(i, newLen - 1, s)
        }
    }
    return true
};

const isPalindrome = (head, tail, s) => {
    for (let i = head; i <= head + (tail - head) / 2; i++) {
        if (s.charAt(i) !== s.charAt(tail - i + head))
            return false
    }
    return true
}