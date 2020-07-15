//  Question Link: https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/545/week-2-july-8th-july-14th/3390/

class Day_7_AngleBetweenHandsofaClock {
    public double angleClock(int hour, int minutes) {
        double hr = (hour * 60 + minutes) * 0.5;
        double min = minutes * 6;
        double angle = Math.abs(hr - min);
        if (angle <= 180.0)
            return angle;
        return (360.0 - angle);
    }
}