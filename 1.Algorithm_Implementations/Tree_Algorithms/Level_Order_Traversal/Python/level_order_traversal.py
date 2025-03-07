from queue import Queue

# Iterative Implementation
def level_order_traversal_iterative(tree):
    array = []

    if tree is None:
        return array

    queue = Queue()
    queue.put(tree)

    while not queue.empty():
        current = queue.get()
        array.append(current.value)

        if current.left:
            queue.put(current.left)
        if current.right:
            queue.put(current.right)

    return array


# recursive implementation
def level_order_traversal_recursive(tree):
    array = []

    if tree is None:
        return array

    queue = Queue()
    queue.put(tree)
    return level_order_traversal_recursive_helper(array, queue)


def level_order_traversal_recursive_helper(array, queue):
    # Base Case
    if queue.empty():
        return array

    current = queue.get()
    array.append(current.value)

    if current.left:
        queue.put(current.left)
    if current.right:
        queue.put(current.right)

    return level_order_traversal_recursive_helper(array, queue)
    
