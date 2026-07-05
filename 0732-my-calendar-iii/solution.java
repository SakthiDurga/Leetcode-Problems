class MyCalendarThree {
    private TreeMap<Integer, Integer> calendar;
    public MyCalendarThree() {
        calendar = new TreeMap<>();
    }
    
    public int book(int start, int end) {
        calendar.put(start, calendar.getOrDefault(start,0)+1);
        calendar.put(end, calendar.getOrDefault(end, 0)-1);
        int activeBookings = 0;
        int max = 0;
        for(int eventCount : calendar.values()){
            activeBookings += eventCount;
            max = Math.max(max, activeBookings);
        }
        return max;
    }
}

/**
 * Your MyCalendarThree object will be instantiated and called as such:
 * MyCalendarThree obj = new MyCalendarThree();
 * int param_1 = obj.book(startTime,endTime);
 */
