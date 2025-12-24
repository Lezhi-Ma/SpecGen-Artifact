class PassPillowBranch {
    //@ public ghost int time_new = 0;
    //@ requires n > 1 && time >= 0;
    //@ ensures \result == ((time_new < n) ? (time_new + 1) : (n * 2 - time_new - 1));
    public int passPillow(int n, int time) {
        time = time % (n - 1) * 2;
        //@ set time_new = time;
        if (time < n) {
            return time + 1;
        }
        return n * 2 - time - 1;
    }
}
