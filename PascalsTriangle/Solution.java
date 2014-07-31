public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        if(numRows==0) {
            return triangle;
        } 
        if(numRows>=1) {
            triangle.add(new ArrayList<Integer>());
            triangle.get(0).add(1);
        }
        if(numRows>=2) {
            triangle.add(new ArrayList<Integer>());
            triangle.get(1).add(1);
            triangle.get(1).add(1);
        }
        if(numRows>=3) {
            for(int i=2; i<numRows; i++) {
                triangle.add(new ArrayList<Integer>());
                for(int j=0; j<=i; j++) {
                    if(j==0 || j==i) {
                        triangle.get(i).add(1);
                    } else {
                        triangle.get(i).add(triangle.get(i-1).get(j-1)+triangle.get(i-1).get(j));
                    }
                }
            }
        }
        return triangle;
    }
}
