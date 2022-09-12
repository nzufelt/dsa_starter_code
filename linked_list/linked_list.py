class LinkedList(object):
    def __init__(self, data):
        self.data = data
        self.next = None

    def search(self, target):
        if self.data == target:
            return self

        if not self.next:
            return None

        return self.next.search(target)     

if __name__ == "__main__":
    doesNotContainFish = LinkedList("Dog")
    print("search fails: {}".format(doesNotContainFish.search("Fish")))

    containsFish = LinkedList("Fish")
    print("search succeeds: {}".format(containsFish.search("Fish")))