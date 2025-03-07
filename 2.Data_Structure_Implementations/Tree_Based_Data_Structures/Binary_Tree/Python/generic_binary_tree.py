from queue import Queue

class BinaryTree:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None

    def insert(self, value):
        q = Queue()
        q.put(self)

        while not q.empty():
            current = q.get()

            if not current.left:
                current.left = BinaryTree(value)
                break
            elif not current.right:
                current.right = BinaryTree(value)
                break
           
            q.put(current.left)
            q.put(current.right)

        return self

    def contains(self, value):
        q = Queue()
        q.put(self)

        # Searches with level order traversal
        while not q.empty():
            current = q.get()

            if current.value == value:
                return True

            if current.left:
                 q.put(current.left)
            if current.right:
                q.put(current.right)
        
        return False

    def remove(self, value):
        if self is None:
            return None

        # single-node tree, root deletion
        if self.__is_leaf_node(self) and self.value == value:
            self.value = None
            return self

        node_to_delete = None
        parent = None
        last_node = None

        q = Queue()
        q.put(self)

        while not q.empty():
            # after loop is this this will be the deepest
            # node in tree
            last_node = q.get()

            if last_node.value == value:
                node_to_delete = last_node

            if last_node.left:
                parent = last_node
                q.put(last_node.left)
            if last_node.right:
                parent = last_node
                q.put(last_node.right)

        
        if node_to_delete:
            # replace values
            node_to_delete.value = last_node.value

            # remove deepest node from the tree
            if parent.right is last_node:
                parent.right = None
            else:
                parent.left = None

        return self

    # Helper Methods

    def __is_leaf_node(self, node):
        return not node.left and not node.right

    def print_tree(self, level=0, prefix="Root: "):
        print(" " * (level * 4) + prefix + str(self.value))
        if self.left:
            self.left.print_tree(level + 1, "L--- ")
        if self.right:
            self.right.print_tree(level + 1, "R--- ")
