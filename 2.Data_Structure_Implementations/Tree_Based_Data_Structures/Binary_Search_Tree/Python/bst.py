
class BST:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None

    def insert(self, value):
        current = self

        while True:
            if value < current.value:
                if current.left:
                    current = current.left
                else:
                    current.left = BST(value)
                    break
            else:
                if current.right:
                    current = current.right
                else:
                    current.right = BST(value)
                    break
        return self

    def contains(self, value):
        current = self

        while current:
            if value == current.value:
                return True
            elif value < current.value:
                current = current.left
            else:
                current = current.right

        return False

    def remove(self, value, parent=None):
        if self.__is_leaf_node(self) and self.__is_root(parent):
            return self

        current = self

        while current:
            # Go right
            if value > current.value:
                parent = current
                current = current.right

            # Go left
            elif value < current.value:
                parent = current
                current = current.left

            # We found node to delete
            else:
                if self.__is_leaf_node(current):
                    self.__remove_leaf(parent, current)
                    break

                elif self.__has_one_child(current):
                    self.__remove_node_with_one_child(parent, current)
                    break

                else:
                    self.__remove_node_with_two_children(current)
                    break
        return self

    # Helper Methods

    def __is_root(self, parent):
        return parent is None

    def __is_leaf_node(self, node):
        return not node.left and not node.right

    def __has_one_child(self, node):
        return (node.left and not node.right) or (node.right and not node.left)

    def __remove_leaf(self, parent, node):
        if node.value >= parent.value:
            parent.right = None
        else:
            parent.left = None

    def __remove_node_with_one_child(self, parent, node):

        if self.__is_root(parent):
            child = node.right if node.right else node.left
            node.value = child.value
            node.right = child.right
            node.left = child.left
            child.left = child.right = None

        elif node.value >= parent.value:
            parent.right = node.right if node.right else node.left
            node.right = node.left = None

        else:
            parent.left = node.right if node.right else node.left

    def __remove_node_with_two_children(self, node):
        parent = node
        replacement_node = node.right

        # Find left-most node in right subtree
        while replacement_node.left:
            parent = replacement_node
            replacement_node = replacement_node.left

        node.value = replacement_node.value

        if self.__is_leaf_node(replacement_node):
            self.__remove_leaf(parent, replacement_node)
        else:
            self.__remove_node_with_one_child(parent, replacement_node)

    def print_tree(self, level=0, prefix="Root: "):
        print(" " * (level * 4) + prefix + str(self.value))
        if self.left:
            self.left.print_tree(level + 1, "L--- ")
        if self.right:
            self.right.print_tree(level + 1, "R--- ")
