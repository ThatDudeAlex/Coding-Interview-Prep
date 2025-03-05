/**
 * @param {string} num1
 * @param {string} num2
 * @return {string}
 */
var addStrings = function (num1, num2) {
    let num1Position = num1.length - 1
    let num2Position = num2.length - 1
    let answer = ''
    let carry = 0

    while (num1Position >= 0 || num2Position >= 0) {
        let sum = carry

        if (num1Position >= 0) {
            sum += num1.charAt(num1Position) - '0'
            num1Position--
        }

        if (num2Position >= 0) {
            sum += num2.charAt(num2Position) - '0'
            num2Position--
        }

        answer = `${sum % 10}${answer}`
        carry = Math.floor(sum / 10)
    }

    if (carry > 0)
        answer = `${carry}${answer}`

    return answer
};