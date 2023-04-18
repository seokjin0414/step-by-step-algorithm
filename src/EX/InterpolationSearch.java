package EX;

public class InterpolationSearch {
    int interpolationSearch(int arr[], int n, int x)
    {

        int low = 0, high = (n - 1);
        int pos = 0;

        while (arr[low] != arr[high] && x >= arr[low] && x <= arr[high])
        {
            pos = low + (((high - low) / (arr[high] - arr[low])) * (x - arr[low]));

            if (arr[pos] == x)
                return pos;
            else if (arr[pos] > x)
                high = pos - 1;
            else
                low = pos + 1;
        }

        if (x == arr[low])
            return low;
        else
            return -1;
    }

}
