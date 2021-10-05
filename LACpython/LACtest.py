from LAC import Node
import unittest 


class TestStringMethods(unittest.TestCase): 

    root = Node(1)
    root.left = Node(2)
    root.right = Node(3)
    root.left.left = Node(4)
    root.left.right = Node(5)
    root.right.left = Node(6)
    root.right.right = Node(7)
    root.left.left.left = Node(8)
    root.left.left.right = Node(9)

    def setUp(self):
        pass

    def test_for_zeroes(self):
        self.assertEqual(Node.findLCA(self.root,0,0),-1)

    def test_for_valid_input(self):
        self.assertEqual(Node.findLCA(self.root,4,5),2)
        self.assertEqual(Node.findLCA(self.root,4,6),1)
        self.assertEqual(Node.findLCA(self.root,3,4),1)
        self.assertEqual(Node.findLCA(self.root,2,4),2)


    def test_duplicate_values(self):
        self.assertEqual(Node.findLCA(self.root,4,4),4)
        self.assertEqual(Node.findLCA(self.root,6,6),6)
        self.assertEqual(Node.findLCA(self.root,8,8),8)
        self.assertEqual(Node.findLCA(self.root,1,1),1)


if __name__ == "__main__":
    unittest.main()