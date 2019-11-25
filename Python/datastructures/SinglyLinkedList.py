class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head =None

    def insert(self,data):
        new_node = Node(data)
        if self.head == None:
            self.head = new_node
        else:
            curent = self.head
            while curent.next!=None:
                curent = curent.next
            curent.next = new_node

    def insert_at_start(self, data):
        new_node = Node(data)
        if self.head == None:
            self.head = new_node
        else:
            new_node.next = self.head
            self.head = new_node

    def insert_at(self, data, index):
        new_node = Node(data)
        if self.head == None:
            self.head = new_node
        else:
            current = self.head
            for i in range(0,index-1):
                current = current.next

            new_node.next = current.next
            current.next = new_node

    def delete_at(self, index):
            current = self.head
            node=None
            for i in range(0,index-1):
                current = current.next
            node = current.next
            current.next= node.next
            print("Deleted item at index %d" %index)

    def size(self):
        size = 0
        cur = self.head

        while(cur):
            size +=1
            cur = cur.next
        return size

    def display(self):
        cur = self.head
        element = []
        while(cur.next != None):
            element.append(cur.data)
            cur = cur.next
        element.append(cur.data)
        print(element)

    def reverse(self):
        prev = None
        current = self.head
        while (current is not None):
            next = current.next
            current.next = prev
            prev = current
            current = next
        self.head = prev
        
    def mid(self):
        slow_ptr= self.head
        fast_ptr = self.head
        while fast_ptr.next is not None:
            slow_ptr = slow_ptr.next
            temp = fast_ptr.next
            fast_ptr = temp.next
        print(slow_ptr.data)   

l1 = LinkedList()
l1.insert(11)
l1.insert(22)
l1.insert(33)
l1.insert(44)
l1.insert_at_start(0)
l1.insert_at(3,3)
print("Size " + str(l1.size()))
l1.display()
l1.delete_at(2)
l1.reverse()
l1.display()
l1.mid()
