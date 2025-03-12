
def isSubstring(str1, str2):
    return str2 in str1


def string_rotation(str1, str2):
    # O(n) Runtime

    if len(str1) != len(str2):
        return False

    # str2 is a rotation of str1, so str2 has to be substring
    # of str1 + str1
    str1_double = str1 + str1
    return isSubstring(str1_double, str2)
