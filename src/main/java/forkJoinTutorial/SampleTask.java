package forkJoinTutorial;

import java.util.concurrent.RecursiveTask;

//This is the task that we want o compute also this should have way out like BASE CONDITION
public class SampleTask extends RecursiveTask<Integer> {
    int array[];
    int start;
    int end;

    public SampleTask(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        if(end<=3) {
            int mid = (start+end) / 2;
            SampleTask leftfork = new SampleTask(array,start, mid);
            SampleTask rightFork = new SampleTask(array,mid+1,end-1);
            leftfork.fork();
            rightFork.fork();
            return leftfork.join() + rightFork.join();
        }else {

            int sum=0;
            for(int i= start;i<end;i++) {
                sum+=array[i];
            }
            return sum;

        }
    }
}
