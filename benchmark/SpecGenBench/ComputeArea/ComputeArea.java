class ComputeArea {
    public int computeOverlapArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = (ax2 - ax1) * (ay2 - ay1), area2 = (bx2 - bx1) * (by2 - by1);
        int overlapWidth = (ax2<bx2?ax2:bx2) - (ax1>bx1?ax1:bx1), overlapHeight = (ay2<by2?ay2:by2) - (ay1>by1?ay1:by1);
        int overlapArea = (overlapWidth>0?overlapWidth:0) * (overlapHeight>0?overlapHeight:0);
        return area1 + area2 - overlapArea;
    }
}
