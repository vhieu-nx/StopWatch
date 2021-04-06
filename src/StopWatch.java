public class StopWatch {
    private long startTime;
    private long endTime;
    public StopWatch(){
        this.startTime = System.currentTimeMillis();
    }
    public void start(){
        this.startTime = System.currentTimeMillis();
    }
    public void end(){
        this.endTime = System.currentTimeMillis();
    }
    public  long getElapsedTime(){
        return this.endTime - this.startTime;
    }
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        int arr[] = new int[100000];
        for (int i = 0; i < 100000 ; i++) {
            arr[i] = i;
        }
        for (int i = 0; i < arr.length - 1 ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]  = arr[i];
                }
            }
        }
        stopWatch.end();
        System.out.println(stopWatch.getElapsedTime());
    }
}
