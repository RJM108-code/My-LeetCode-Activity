class Solution(object):
    def countSegments(self, s):
        """
        :type s: str
        :rtype: int
        """
        if len(s)==0:
            return 0
        
        l = s.split()

        return len(l)
        