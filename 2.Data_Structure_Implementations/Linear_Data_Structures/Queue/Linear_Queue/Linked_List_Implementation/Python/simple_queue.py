from typing import Any


class Queue:
    class Node:
        def __init__(self, data: Any):
            self.data = data
            self.next = None

    def __init__(self):
        """Initialize an empty queue"""
        self.__front = None
        self.__back = None
        self.__size = 0

    def enqueue(self, data: Any) -> bool:
        if self.is_empty():
            self.__front = self.__back = self.Node(data)
            self.__size = 1
            return True

        new_node = self.Node(data)
        self.__back = self.__back.next = new_node
        self.__size += 1
        return True

    def dequeue(self) -> Any | None:
        if self.is_empty():
            return None

        deleted_head = self.__front
        self.__front = self.__front.next

        # If queue becomes empty, reset back
        if self.__front is None:
            self.__back = None

        self.__size -= 1
        return deleted_head.data

    def peek(self) -> Any | None:
        return None if self.is_empty() else self.__front.data

    # ==================
    #  Utility Methods
    # ==================

    def size(self) -> int:
        return self.__size

    def is_empty(self) -> bool:
        return self.__front is None
