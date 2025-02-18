/**
 * @param {string} S
 * @return {string}
 */
var toGoatLatin = function (S) {
    if (S === null || S === ' ')
        return S

    let goatLatin = ''
    let numberOfA = 1
    const words = S.split(' ')
    const vowels = {
        'a': true, 'A': true,
        'e': true, 'E': true,
        'i': true, 'I': true,
        'o': true, 'O': true,
        'u': true, 'U': true
    }

    words.forEach(word => {
        if (vowels[word.charAt(0)]) {
            goatLatin = goatLatin.concat(word, 'ma')
        }
        else {
            goatLatin = goatLatin.concat(word.substring(1))
            goatLatin = goatLatin.concat(word.substring(0, 1), 'ma')
        }

        for (let i = 0; i < numberOfA; i++)
            goatLatin = goatLatin.concat('a')

        goatLatin = goatLatin.concat(' ')
        numberOfA++
    })

    goatLatin = goatLatin.substring(0, goatLatin.length - 1)
    return goatLatin
};