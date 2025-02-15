def twoNumberSum(array, targetSum):
    # Write your code here.
    numbers_seen = set()

    for number in array:
        match = targetSum - number
        
        if match in numbers_seen:
            return [match, number]
            
        numbers_seen.add(number)
        
    return []
