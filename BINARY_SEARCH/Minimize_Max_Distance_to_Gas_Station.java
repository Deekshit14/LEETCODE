// https://www.geeksforgeeks.org/problems/minimize-max-distance-to-gas-station/1
package BINARY_SEARCH;

public class Minimize_Max_Distance_to_Gas_Station {
    public static void main(String[] args) {
        int [] stations = {1, 2, 3, 4, 5};
        // int [] stations = {1, 13, 17, 23};
        // int K = 5;
        int K = 5;
        System.out.println(findSmallestMaxDist(stations, K));
    }

    public static double findSmallestMaxDist(int stations[],int K) {
        double start = 0;
        double end = 0;
        
        for (int i=0; i<stations.length - 1; i++)
        {
            end = Math.max(end, (double)(stations[i+1] - stations[i]));
        }
        
        double diff = 1e-6;
        while (end - start > diff)
        {
            double mid = start + (end - start)/2;
            int cnt = num_of_Gas_Stations_Req(stations, mid);
            if (cnt > K)
                start = mid;
            else
                end = mid;
        }
        return end;
    }
    
    public static int num_of_Gas_Stations_Req(int [] stations,double dist)
    {
        int cnt = 0;
        for (int i=1; i<stations.length; i++)
        {
            int num_in_Between = (int)((stations[i] - stations[i - 1]) / dist);
            if ((stations[i] - stations[i-1]) == (dist * num_in_Between))
                num_in_Between--;
            cnt += num_in_Between;
        }
        return cnt;
    }
}
