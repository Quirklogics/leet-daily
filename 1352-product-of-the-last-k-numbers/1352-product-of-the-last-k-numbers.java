class ProductOfNumbers {
    private List<Long> ans;
    public ProductOfNumbers() {
        ans = new ArrayList<>();
        ans.add(1L);
    }
    
    public void add(int num) {
        if(num == 0){
            ans = new ArrayList<>();
            ans.add(1L);
        } else{
            ans.add(ans.get(ans.size() - 1) * num);
        }
    }
    
    public int getProduct(int k) {
        int n = ans.size();
        if(k >= n){
          return 0;
        } 
        return (int) (ans.get(n - 1) / ans.get(n - k - 1));
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */