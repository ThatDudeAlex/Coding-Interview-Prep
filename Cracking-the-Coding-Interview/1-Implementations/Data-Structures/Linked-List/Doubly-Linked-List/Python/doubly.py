import warnings


class LinkedList:

    class Node:
        def __init__(self, value=0):
            self.value = value
            self.next = None
            self.previous = None


    def __init__(self, value=None):
        self.head = None if not value else LinkedList.Node(value)
        self.tail = None if not self.head else self.head
        self._size = 0 if not self.head else 1


    def insert_head(self, value=None):
        """
        Inserts a new node as the head of the linked list.

        O(1) time complexity.

        Args:
            value: The value to insert.

        Returns:
            True if the insertion was successful.
        """

        if value == None:
            warnings.warn('Missing value during head insertion')
            return False
        
        try:
            new_head = LinkedList.Node(value)

            if self.head == None:
                self.head = new_head
                self.tail = new_head
            else:
                new_head.next = self.head
                self.head.previous = new_head
                self.head = new_head

            self._size += 1
            return True
        except Exception as error:
            print(f"Error occurred while inserting a new head node: {str(error)}")
            raise
    
    
    def insert_tail(self, value=None):
        """
        Inserts a new node as the tail of the linked list.

        O(1) time complexity.

        Args:
            value: The value to insert.

        Returns:
            True if the insertion was successful.
        """

        if value == None:
            warnings.warn('Missing value during tail insertion')
            return False
        
        try:

            if self._size == 0:
                return self.insert_head(value)
            
            new_tail = LinkedList.Node(value)
            self.tail.next = new_tail
            new_tail.previous = self.tail
            self.tail = new_tail
            self._size += 1
            return True
        except Exception as error:
            print(f"Error occurred while inserting a new tail node: {str(error)}")
            raise
    
    
    def insert_at_index(self, value=None, index=None):
        """
        Inserts a new node into the given index.

        O(n) time complexity.

        Args:
            value: The value to insert.
            index: Index to insert into

        Returns:
            True if the insertion was successful.
        """

        if value == None:
            warnings.warn('Missing value during index insertion')
            return False
        
        if index == None:
            warnings.warn('Missing index during index insertion')
            return False
        
        if index < 0 or index >= self._size:
            warnings.warn('Invalid index during index insertion')
            return False
        
        try:
            if index == 0:
                return self.insert_head(value)
            
            if index == self._size - 1:
                return self.insert_tail(value)
            
            middle = self._size // 2

            if index <= middle:
                curr = self.head

                for i in range(index - 1):
                    curr = curr.next
            
                new_idx_node = LinkedList.Node(value)
                next_idx_node = curr.next

                curr.next = new_idx_node
                new_idx_node.previous = curr
                new_idx_node.next = next_idx_node
                next_idx_node.previous = new_idx_node
            else:
                curr = self.tail

                for i in range(self._size - 1, index, -1):
                    curr = curr.previous
            
                new_idx_node = LinkedList.Node(value)
                next_idx_node = curr.next

                curr.next = new_idx_node
                new_idx_node.previous = curr
                new_idx_node.next = next_idx_node
                next_idx_node.previous = new_idx_node

            self._size += 1
            return True
        except Exception as error:
            print(f"Error occurred while inserting a new node at index {index}: {str(error)}")
            raise
    
    
    def delete_head(self):
        """
        Deletes the head node.

        O(1) time complexity.

        Returns:
            True if the deletion was successful.
        """

        if not self.head:
            return False
        
        try:
            new_head = self.head.next
            self.head.next = None
            self.head = new_head
            self._size -= 1
            return True
        except Exception as error:
            print(f"Error occurred while deleting head node: {str(error)}")
            raise
    
    
    def delete_tail(self):
        """
        Deletes the tail node.

        O(1) time complexity.

        Returns:
            True if the deletion was successful.
        """

        if not self.head:
            return False
        
        try:
            if self._size == 1:
                self.head = None
                self.tail = None
            else:
                self.tail = self.tail.previous
                self.tail.next = None

            self._size -= 1
            return True
        except Exception as error:
            print(f"Error occurred while deleting head node: {str(error)}")
            raise
    
    
    def delete_at_index(self, index=None):
        """
        Deletes a node at the given index.

        O(n) time complexity.

        Args:
            index: Node index to delete

        Returns:
            True if the deletion was successful.
        """

        if index == None:
            warnings.warn('Missing index during index deletion')
            return False
        
        if index < 0 or index >= self._size:
            warnings.warn('Invalid index during index deletion')
            return False
        
        try:
            if index == 0:
                return self.delete_head()
            
            if index == self._size - 1:
                return self.delete_tail()
            
            middle = self._size // 2

            if index <= middle:
                curr = self.head

                for i in range(index - 1):
                    curr = curr.next
            
                node_to_delete = curr.next
                curr.next = node_to_delete.next
                node_to_delete.next.previous = curr
            else:
                curr = self.tail

                for i in range(self._size - 1, index, -1):
                    curr = curr.previous
            
                node_to_delete = curr.previous
                curr.previous = node_to_delete.previous
                node_to_delete.previous.next = curr
            
            self._size -= 1
            return True
        except Exception as error:
            print(f"Error occurred while deleting a node at index {index}: {str(error)}")
            raise
    
    
    def has_value(self, value=None):
        """
        Searches the list for the given value.

        O(n) time complexity.

        Args:
            value: node value to search for

        Returns:
            True if the list contains the value.
        """

        if value == None:
            warnings.warn('Invalid search value')
            return False
        
        if self._size == 0:
            return False
        
        try:
            leftPointer  = self.head
            rightPointer = self.tail

            while leftPointer and rightPointer and leftPointer != rightPointer:
                if leftPointer.value == value or rightPointer.value == value:
                    return True
                
                if leftPointer.next == rightPointer:
                    return leftPointer.next.value == value

                leftPointer = leftPointer.next
                rightPointer = rightPointer.previous

            if leftPointer and leftPointer.value == value:
                return True


            return False
        except Exception as error:
            print(f"Error occurred while searching for value {value}: {str(error)}")
            raise


    def get_size(self):
        """
        Returns the size of the linked list

        O(1) time complexity.

        Returns:
            Number of nodes in the list (number)
        """
        return self._size


    def print_list(self):
        """
        Prints the linked list to the console

        O(n) time complexity.
        """
        if not self.head:
            print('Empty List')
            return
        
        curr = self.head
        output = '\nLinked List: '

        while curr is not None:
            if curr.next == None:
                output += f"{curr.value} --> "
            else:
                output += f"{curr.value} <--> "

            curr = curr.next

        output += 'NULL\n'
        print(output)

