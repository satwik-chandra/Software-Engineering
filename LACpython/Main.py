from LAC import Node





root = Node(1)
root.left = Node(2)
root.right = Node(3)
root.left.left = Node(4)
root.left.right = Node(5)
root.right.left = Node(6)
root.right.right = Node(7)
root.left.left.left = Node(8)
root.left.left.right = Node(9)


print ("LCA(4, 5) = %d" %(Node.findLCA(root,4,5)))
print ("LCA(3, 5) = %d" %(Node.findLCA(root,3,5)))
print ("LCA(7, 7) = %d" %(Node.findLCA(root,7,7)))
print ("LCA(1, 8) = %d" %(Node.findLCA(root,1,8)))
print ("LCA(8, 9) = %d" %(Node.findLCA(root,8,9)))
print ("LCA(0, 0) = %d" %(Node.findLCA(root,0,0)))
 



