/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 */
var intersection = function (nums1, nums2) {
    const nums1Values = new Map()
    const intersection = new Map()

    for (let i = 0; i < nums1.length; i++)
        if (!nums1Values.has(nums1[i]))
            nums1Values.set(nums1[i], nums1[i])

    for (let i = 0; i < nums2.length; i++)
        if (nums1Values.has(nums2[i]) && !intersection.has(nums2[i]))
            intersection.set(nums2[i], nums2[i])

    return [...intersection.values()]
};