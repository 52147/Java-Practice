### Queue
A `Queue` is a collection used to hold multiple elements prior to processing. Queues typically, but do not necessarily, order elements in a FIFO (first-in, first-out) manner.

- **PriorityQueue**
  - **Description:** Unbounded priority queue based on a priority heap.
  - **Performance:** Provides O(log(n)) time for the enqueuing and dequeuing methods (offer, poll, remove() and add).
  - **Use Case:** When you need a priority heap-based queue.