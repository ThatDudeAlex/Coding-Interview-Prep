
# def make_frequency_map(str):
#     fmap = dict()

#     for char in str:
#         if char in fmap:
#             fmap[char] = fmap[char] + 1
#         else:
#             fmap[char] = 1
            
#     return fmap

# def absolute_diff(val1, val2):
#     return abs(val1 - val2)

# # O(n) Runtime
# def one_way(str1, str2):
#     if absolute_diff(len(str1), len(str2)) > 1:
#         return False
    
#     allowed = 1
#     fmap1 = make_frequency_map(str1)
#     fmap2 = make_frequency_map(str2)

#     for key, value in fmap1.items():
#         if key not in fmap2:
#             allowed -= 1
#         elif value != fmap2[key]:
#             if absolute_diff(value, fmap2[key]) > 1:
#                 return False
#             else:
#                 allowed -= 1
        
#         if allowed < 0:
#             return False
    
#     return True


# O(n) Runtime
def one_way(str1, str2):
    if abs(len(str1) - len(str2)) > 1:
        return False
    
    allowed = 1
    pointer1 = 0
    pointer2 = 0

    while (pointer1 < len(str1)) and (pointer2 < len(str2)):
        if str1[pointer1] == str2[pointer2]:
            pointer1 += 1
            pointer2 += 1
        else:
            allowed -= 1

            if allowed < 0:
                return False
            elif len(str1) == len(str2):
                pointer1 += 1
                pointer2 += 1
            elif len(str1) > len(str2):
                pointer1 += 1
            else:
                pointer2 += 1

    return True

