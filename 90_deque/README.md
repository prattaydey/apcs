# THE SPANISH INQUISITION
## Prattay Dey, Joshua Gao, Faiza Huda

### To-Do List
- Finalize interface and which versions of add and remove method we want to use.
- Start implementation, as simple as possible by using pass-thru functionality wherever we can.
- Update notes.txt w/ Discos and QCCs as we go.
- Update readme when finished.

### Design Decisions
- We decided to do use LinkedList over ArrayList because LinkedLIst already implements Deque, so that makes pass-thru functionality easier.


## Interface with generic type <E>
### Add Methods
`public void addFirst(E e)` - adds e to the front, throws exception if no space available <br>
`public void addLast(E e)` - adds e to the end, throws exception if no space available <br>


### Remove Methods
`public E removeFirst()` - retrieves & removes the element at the front <br>
`public E removeLast()` - retrieves & removes the element at the end <br>


### Peek Methods
`public E peekFirst()` - returns element at front, returns null if empty <br>
`public E peekLast()` - returns element at end, returns null if empty <br>


### Other Methods
`public boolean isEmpty()` - returns true if Deque is empty, false otherwise <br>
`public int size()` - returns number of elements in the Deque <br>
