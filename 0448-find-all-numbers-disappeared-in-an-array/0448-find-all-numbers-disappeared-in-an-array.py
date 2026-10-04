class Solution(object):
    def findDisappearedNumbers(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """

        l = len(nums)
        s = set(nums)
        res = []
        for i in range(1,l+1):
            if i not in s:
                res.append(i)
            

        res.sort()
        return res

        