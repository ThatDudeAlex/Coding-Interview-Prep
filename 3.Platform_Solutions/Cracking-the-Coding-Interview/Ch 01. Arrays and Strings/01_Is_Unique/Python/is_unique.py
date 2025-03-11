
# O(n) time and space complexity
def is_unique(input):
    if input is None:
        return False

    character_set = set()

    for character in input:
        if character in character_set:
            return False
        character_set.add(character)

    return True
