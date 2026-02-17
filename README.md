# Producer-Consumer Problem Project

## Project Overview:
This project addresses the Producer-Consumer Problem, a synchronization issue in multi-process systems where two processes, the producer and the consumer, share a fixed-size buffer. The producer generates data and inserts it into the buffer, while the consumer removes and processes it.

### Problem:
The challenge is to synchronize the producer and consumer processes to avoid issues such as:
- Race Conditions: Multiple processes accessing shared data simultaneously, leading to inconsistencies.
- Deadlock: Processes waiting indefinitely for each other.
- Data Loss: If synchronization fails, data may be overwritten or missed.

### Solution:
To solve this, semaphores are used to control access to the shared buffer:
- Counting Semaphores: Manage available resources (empty or full slots in the buffer).
- Binary Semaphores (Mutex): Ensure mutual exclusion when accessing the shared buffer.

The producer and consumer use these semaphores to ensure safe and synchronized operations.

## Practical Part:
### Tasks:
- Simulate print jobs with a buffer where producers add jobs and consumers print them.
- Producer Threads: Insert data into the buffer with a ½ second delay.
- Consumer Threads: Remove data from the buffer with a 1-second delay.

### Code Files:
1. Buffer.java: Logic for the shared buffer with synchronization mechanisms.
2. Producer.java: Producer thread that generates and adds jobs to the buffer.
3. Consumer.java: Consumer thread that processes jobs from the buffer.
4. Main.java: Initializes the buffer and starts the producer and consumer threads.
5. OS Presentation.pdf: Presentation outlining the theory and implementation.
6. Project Guidelines.pdf: Guidelines for completing the project.

### Execution:
This project demonstrates synchronization between producer and consumer threads, preventing race conditions, deadlocks, and ensuring safe data handling.

## Project Group:
- Raneem Mohsen 
- Rawan Alfouzan 
- Aljazi Aleqab 
- Zainab Komailah 
- Yasmin Altwaijiry
- Instructor: Dr. Alanoud Al-Harbi

## Task Breakdown:
The project is divided into both theoretical and practical parts, emphasizing synchronization problems in operating systems. Key concepts:
1. Concept/Idea - Explanation of the Producer-Consumer pattern.
2. Problem - Addressing issues like race conditions and deadlocks.
3. Use in Operating Systems - Managing shared resources efficiently.
4. Semaphores as a Solution - Synchronizing processes using semaphores.
