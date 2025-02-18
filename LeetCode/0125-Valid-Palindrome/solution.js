/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function (s) {
    const cleanedStr = s.toLowerCase().replace(/[^a-zA-Z0-9]/g, "")
    let start = 0
    let end = cleanedStr.length - 1

    if (cleanedStr.length === 0 || cleanedStr.length === 1)
        return true

    while (start < end) {
        if (cleanedStr[start++] != cleanedStr[end--])
            return false
    }

    return true
};