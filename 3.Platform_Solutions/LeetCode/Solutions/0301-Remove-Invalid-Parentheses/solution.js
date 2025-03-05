/**
 * @param {string} s
 * @return {string[]}
 */
var removeInvalidParentheses = function (s) {
    const leftRightCount = getCount(s)
    const result = []
    const stringBuilder = []

    dfs(s, 0, leftRightCount[0], leftRightCount[1], result, stringBuilder, 0, 0)
    return result
};

const dfs = (s, index, leftCount, rightCount, result, stringBuilder, leftSeen, rightSeen) => {
    if (index === s.length && leftCount === 0 && rightCount === 0) {
        let validString = stringBuilder.join('')

        if (!result.includes(validString))
            result.push(validString)
        return
    }
    else if (index === s.length && (leftCount !== 0 || rightCount === 0)) {
        return
    }

    let character = s[index]

    if (leftCount > 0 && character === '(' || rightCount > 0 && character === ')') {
        let left = leftCount - (character === '(' ? 1 : 0)
        let right = rightCount - (character === ')' ? 1 : 0)
        dfs(s, index + 1, left, right, result, stringBuilder, leftSeen, rightSeen)
    }

    stringBuilder.push(character)

    if (character !== '(' && character !== ')')
        dfs(s, index + 1, leftCount, rightCount, result, stringBuilder, leftSeen, rightSeen)
    else if (character === '(')
        dfs(s, index + 1, leftCount, rightCount, result, stringBuilder, leftSeen + 1, rightSeen)
    else if (rightSeen < leftSeen)
        dfs(s, index + 1, leftCount, rightCount, result, stringBuilder, leftSeen, rightSeen + 1)

    stringBuilder.pop()
}

const getCount = (string) => {
    let left = 0
    let right = 0

    for (let i = 0; i < string.length; i++) {
        if (string[i] === '(')
            left += 1
        else if (string[i] === ')' && left > 0)
            left -= 1
        else if (string[i] === ')')
            right += 1
    }

    return [left, right]
}