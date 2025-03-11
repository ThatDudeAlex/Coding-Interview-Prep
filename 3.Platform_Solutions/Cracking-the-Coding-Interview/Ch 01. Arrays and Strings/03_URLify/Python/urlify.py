
# o(n) time complexity
def replace_spaces(input_str, actual_len):
    REPLACEMENT = "%20"
    output = ""
    curr_str = ""

    for i in range(actual_len):
        if input_str[i] != " ":
            curr_str += input_str[i]
        elif curr_str:
            output += curr_str
            output += REPLACEMENT
            curr_str = ""
        else:
            output += REPLACEMENT

    if curr_str:
        output += curr_str

    return output


