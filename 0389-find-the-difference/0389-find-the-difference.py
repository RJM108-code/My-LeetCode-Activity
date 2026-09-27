class Solution(object):
    def findTheDifference(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: str
        """
        l2 = list(t)

        for i in s:
            if i in l2:
                l2.remove(i)


        return str(l2[0])