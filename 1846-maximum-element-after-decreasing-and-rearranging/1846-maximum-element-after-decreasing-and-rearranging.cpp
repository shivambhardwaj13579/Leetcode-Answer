class Solution {
public:
    int maximumElementAfterDecrementingAndRearranging(vector<int>& arr) {
        sort(arr.begin(),arr.end());
        int cur=1;
        arr[0]=1;
        for(int i=1;i<arr.size();i++)
        {
            if(abs(arr[i-1]-arr[i])>1)
            {
                arr[i]=arr[i-1]+1;
            }
        }
        return arr[arr.size()-1];
    }
};