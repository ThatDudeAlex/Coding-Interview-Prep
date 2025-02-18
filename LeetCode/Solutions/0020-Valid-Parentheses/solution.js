/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function (s) {
    const stack = [];

    if (s.length % 2 !== 0)
        return false

    for (let i = 0; i < s.length; i++) {
        handleStack(stack, s[i])
    }

    if (stack.length === 0)
        return true
    else
        return false
};

const handleStack = (stack, character) => {
    if (character === '(' || character === '{' || character === '[')
        stack.push(character)
    else if (character === ')' && (stack[stack.length - 1] === '('))
        stack.pop()
    else if (character === '}' && (stack[stack.length - 1] === '{'))
        stack.pop()
    else if (character === ']' && (stack[stack.length - 1] === '['))
        stack.pop()
} 
