
def string_compression(input_str):
    if not input_str:
        return input_str

    current = input_str[0]
    output = ""
    count = 0

    for char in input_str:
        if current == char:
            count += 1
        else:
            output += f"{current}{count}"
            current = char
            count = 1
    
    output += f"{current}{count}"

    return output if len(output) < len(input_str) else input_str