class Stack:
    def __init__(self):
        self.items = []

    def isEmpty(self):
        return self.items == []

    def push(self, item):
        self.items.append(item)

    def pop(self):
        return self.items.pop()

    def size(self):
        return len(self.items)

s = Stack()
s.push(5)
s.push(4)
s.push(3.3)
s.push('A')
s.push('B')
s.push(True)
print(s.size())
print(s.isEmpty())
print(s.pop())
print(s.pop())
print(s.size())
