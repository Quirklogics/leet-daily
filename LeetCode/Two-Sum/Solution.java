1class Solution:
2    def twoSum(self, nums: List[int], target: int) -> List[int]:
3        dict = {}
4        for i, value in enumerate(nums):
5            req = target - value
6            if req in dict:
7                return [dict[req], i]
8            dict[value] = i
9        return []