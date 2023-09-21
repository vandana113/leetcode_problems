class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> row0 = new ArrayList<>();
        row0.add(1);
        result.add(row0);
        for(int i=1; i<n; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j=1; j<i; j++) {
                List<Integer> prevRow = result.get(i-1);
                int first = prevRow.get(j-1);
                int second = prevRow.get(j);
                row.add(first + second); 
            }
            row.add(1);
            result.add(row);
        }
        return result;
    }
}