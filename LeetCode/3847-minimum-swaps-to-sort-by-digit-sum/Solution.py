class Solution:
    def minSwaps(self, nums: List[int]) -> int:
        def digitSum(a):
            s=0
            while a:
                s+=a%10
                a//=10
            return s
        n=len(nums)
        a=[]

        for i in nums:
            a.append([digitSum(i),i])

        a.sort()

        sorted_nums=[]
        for i in a:
            sorted_nums.append(i[1])

        pos={}
        for i in range(n):
            pos[nums[i]]=i

        ans=0

        for i in range(n):
            if nums[i]!=sorted_nums[i]:
                j=pos[sorted_nums[i]]

                pos[nums[i]]=j
                pos[nums[j]]=i

                nums[i],nums[j]=nums[j],nums[i]
                ans+=1

        return ans