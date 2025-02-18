/**
 * @param {string} s
 * @return {string}
 */
var minRemoveToMakeValid = function (s) {
    const stack = []
    let answer = []

    for (let i = 0; i < s.length; i++) {
        if (s[i] === '(') {
            answer.push('(')
            stack.push(answer.length - 1)
        }
        else if (s[i] === ')' && stack.length > 0) {
            stack.pop()
            answer.push(')')
        }
        else if (s[i] !== '(' && s[i] !== ')')
            answer.push(s[i])
    }

    while (stack.length !== 0) {
        answer[stack.pop()] = null
    }

    return answer.filter(character => character !== null).join('')
};