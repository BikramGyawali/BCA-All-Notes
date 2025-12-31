#include <stdio.h>
#include <unistd.h>

int main() {
    pid_t pid = fork();

    if (pid > 0) {
  
        printf("Parent exiting...\n");
        return 0;
    }
    else if (pid == 0) {
       
        sleep(5);
        printf("Orphan Process\n");
        printf("Child PID: %d\n", getpid());
        printf("New Parent PID (init/systemd): %d\n", getppid());
    }

    return 0;
}

