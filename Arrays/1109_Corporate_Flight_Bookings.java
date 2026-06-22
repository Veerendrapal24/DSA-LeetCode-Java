// LeetCode 1109 - Corporate Flight Bookings

class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] arr = new int[n];

        for (int[] brr : bookings) {
            for (int i = brr[0]; i <= brr[1]; i++) {
                arr[i - 1] += brr[2];
            }
        }

        return arr;
    }
}