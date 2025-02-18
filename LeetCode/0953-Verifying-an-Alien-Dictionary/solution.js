/**
 * @param {string[]} words
 * @param {string} order
 * @return {boolean}
 */
var isAlienSorted = function (words, order) {
    const alienAlphabet = new Map();

    for (let i = 0; i < order.length; i++) {
        alienAlphabet.set(order[i], i + 1);
    }

    for (let i = 1; i < words.length; i++) {
        if (!compareLetters(words[i - 1], words[i], alienAlphabet))
            return false;
    }

    return true;
};

const compareLetters = (word1, word2, alienAlphabet) => {
    let minLength = Math.min(word1.length, word2.length);

    for (let i = 0; i < minLength; i++) {
        let rank1 = alienAlphabet.get(word1.charAt(i));
        let rank2 = alienAlphabet.get(word2.charAt(i));

        if (rank1 < rank2)
            return true;
        else if (rank1 > rank2)
            return false;
    }
    return word1.length <= word2.length;
};
