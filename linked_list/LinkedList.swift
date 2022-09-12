class LinkedList {
    var data: String
    var next: LinkedList?

    init(data: String) {
        self.data = data
        self.next = nil
    }

    func search(target: String) -> LinkedList? {        
        if (data != nil && data == target) {
            return self
        } 

        if (next == nil) {
            return nil
        }
        
        return next?.search(target: target)
    }
}

var doesNotContainFish = LinkedList(data: "Dog")
print("search fails: ")
print(doesNotContainFish.search(target: "Fish")) 

var containsFish = LinkedList(data: "Fish")
print("search succeeds: ")
print(containsFish.search(target: "Fish"))