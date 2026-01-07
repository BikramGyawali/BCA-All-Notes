#include <stdio.h>
#include <unistd.h>

int main() {
    pid_t pid = fork();

    if (pid == 0) {
        // Child process
        printf("Child Process\n");
        printf("Child PID: %d\n", getpid());
        printf("Parent PID: %d\n", getppid());
    } 
    else if (pid > 0) {
        // Parent process
        printf("Parent Process\n");
        printf("Parent PID: %d\n", getpid());
    } 
    else {
        printf("Fork failed\n");
    }

    return 0;
}

