/**
 * @param {number[][]} points
 * @param {number} K
 * @return {number[][]}
 */

var kClosest = function (points, K) {
    const answer = [...points].sort((a, b) => getDistance(a) - getDistance(b))

    return answer.slice(0, K)
};

const getDistance = (point) => {
    return Math.sqrt((point[0] * point[0]) + (point[1] * point[1]))
}