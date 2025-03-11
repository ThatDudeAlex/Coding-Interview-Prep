from collections import deque


# def replace_spaces(input_str, actual_len):
# REPLACEMENT = "%20"
# output = ""
# curr_str = ""

# for i in range(actual_len):
#     if input_str[i] != " ":
#         curr_str += input_str[i]
#     elif curr_str:
#         output += curr_str
#         output += REPLACEMENT
#         curr_str = ""
#     else:
#         output += REPLACEMENT

# if curr_str:
#     output += curr_str

# return output
def replace_spaces(input_str, actual_len):
    queue = build_queue(input_str, actual_len)

    str_idx = 0

    while str_idx < len(input_str):
        curr_str = queue.popleft()

        for char in curr_str:
            input_str[str_idx] = char
            str_idx += 1

    return input_str


def build_queue(input_str, length):
    REPLACEMENT = "%20"
    queue = deque()
    curr_str = ""

    for i in range(length):
        if input_str[i] != " ":
            curr_str += input_str[i]
        elif curr_str:
            queue.append(curr_str)
            queue.append(REPLACEMENT)
            curr_str = ""
        else:
            queue.append(REPLACEMENT)

    if curr_str:
        queue.append(curr_str)

    return queue


output = replace_spaces("Mr John Smith    ", 13)
print(output)
