class Node:
# Constructor to create a new binary node
    def __init__(self, key):
        self.key =  key
        self.left = None
        self.right = None

    def findPath(root, path, k):

        # Baes Case
        if root is None:
            return False

        # Store this node is path vector. The node will be
        # removed if not in path from root to k
        path.append(root.key)

        # See if the k is same as root's key
        if root.key == k :
            return True

        # Check if k is found in left or right sub-tree
        if ((root.left != None and Node.findPath(root.left, path, k)) or (root.right!= None and Node.findPath(root.right, path, k))):
            return True

        # If not present in subtree rooted with root, remove
        # root from path and return False
        
        path.pop()
        return False

    def findLCA(root, n1, n2):

    # To store paths to n1 and n2 fromthe root
        path1 = []
        path2 = []

        # Find paths from root to n1 and root to n2.
        # If either n1 or n2 is not present , return -1
        if (not Node.findPath(root, path1, n1) or not Node.findPath(root, path2, n2)):
            return -1

        # Compare the paths to get the first different value
        i = 0
        while(i < len(path1) and i < len(path2)):
            if path1[i] != path2[i]:
                break
            i += 1
        return path1[i-1]



