class Node:
    def __init__(self, value):
        self.value = value
        self.left_child = None
        self.right_child = None

class Binary_search_tree:
    def __init__(self):
        self.root = None

    def insert(self,value):
        if self.root == None:
            self.root = Node(value)
        else:
            self._insert(value,self.root)
            
    def _insert(self, value, cur_node):
        if value < cur_node.value:
            if cur_node.left_child == None:
                cur_node.left_child = Node(value)
            else:
                self._insert(value,cur_node.left_child)
        elif value> cur_node.value:
            if cur_node.right_child == None:
                cur_node.right_child = Node(value)
            else:
                self._insert(value, cur_node.right_child)
        else:
            print("Value already in tree")

    def print_tree(self):
        if self.root!=None:
            self._print_tree(self.root)

    def _print_tree(self,cur_node):
        if cur_node != None:
            #print(str(cur_node.value), end=' ')  # DLR
            self._print_tree(cur_node.left_child)
            print (str(cur_node.value), end = ' ')         #LDR
            self._print_tree(cur_node.right_child)
            #print(str(cur_node.value), end=' ')  # LRD

    def search(self,value):
        if self.root != None:
            return self._search(value,self.root)
        else:
            return False

    def _search(self,value,cur_node):
        if value == cur_node.value:
            return True
        elif value<cur_node.value and cur_node.left_child != None:
            return self._search(value, cur_node.left_child)
        elif value>cur_node.value and cur_node.right_child != None:
            return self._search(value, cur_node.right_child)
        return False


tree = Binary_search_tree()
tree.insert(11)
tree.insert(22)
tree.insert(8)
tree.insert(4)
tree.insert(33)
tree.insert(18)
tree.print_tree()
print(tree.search(4))
