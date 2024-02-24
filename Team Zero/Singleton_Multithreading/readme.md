# Slides P5-BE Page #96
- The code is creating a fixed sized thread pool with 10 threads to handle 10 tasks.
- Each task is about instantiation a Singleton object to see if really each thread will be referencing the same object.
### Result 
- Some threads are referencing different object which means that more than one Singleton object was created.
- **It's proven now practically that Lazy Evaluation Implementation for Singleton is not multithreading safe.**
### Resources
- [Tim Buchalka's Academy Course](https://www.udemy.com/course/java-design-patterns-course/)
- [Geeks For Geeks](https://www.geeksforgeeks.org/thread-pools-java/)
