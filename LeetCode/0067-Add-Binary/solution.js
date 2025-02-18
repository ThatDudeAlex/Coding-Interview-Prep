/**
 * @param {string} a
 * @param {string} b
 * @return {string}
 */
var addBinary = function (a, b) {
    let positionInA = a.length - 1
    let positionInB = b.length - 1
    let answer = "";
    let carry = 0;

    while (positionInA >= 0 || positionInB >= 0) {
        let sum = carry

        if (positionInA >= 0) {
            sum += a.charAt(positionInA) - '0'
            positionInA--
        }

        if (positionInB >= 0) {
            sum += b.charAt(positionInB) - '0'
            positionInB--
        }

        answer = `${sum % 2}${answer}`
        carry = Math.floor(sum / 2)
    }

    if (carry)
        answer = `1${answer}`

    return answer
};