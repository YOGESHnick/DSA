class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int ambugal = 0;
        int prevEnd = points[0][1];
        for (int i = 0; i < points.length; ++i) {
            if (points[i][0] > prevEnd) {
                ambugal++;
                prevEnd = points[i][1];
            }
        }
        return ambugal+1;
        // intha + 1 is for 1 balloon case, defult ah 1 venum la...athaan
    }
}
