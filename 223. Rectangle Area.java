public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        if(E>=C || A>=G || F>=D || B>=H) return (D-B)*(C-A) + (H-F)*(G-E);
        int x1 = Math.max(A, E);
        int x2 = Math.min(C, G);
        int y1 = Math.max(B, F);
        int y2 = Math.min(D, H);
        return (D-B)*(C-A) + (H-F)*(G-E) - Math.abs((x1-x2)*(y1-y2));
    }
}