
# O(n) time complexity
def is_permutation(input_string1, input_string2):
    if len(input_string1) != len(input_string2):
        return False

    frequency_map1 = dict()
    frequency_map2 = dict()

    # O(n)
    for i in range(len(input_string1)):
        char1 = input_string1[i]
        char2 = input_string2[i]

        if char1 not in frequency_map1:
            frequency_map1[char1] = 1
        else:
            frequency_map1[char1] = frequency_map1[char1] + 1

        if char2 not in frequency_map2:
            frequency_map2[char2] = 1
        else:
            frequency_map2[char2] = frequency_map2[char2] + 1

    for key, value in frequency_map1.items():
        if (key not in frequency_map2) or (value != frequency_map2[key]):
            return False

    return True
