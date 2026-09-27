class Solution(object):
    def firstUniqChar(self, s):
        """
        :type s: str
        :rtype: int
        """
        d = dict()

        for i in s:
            if i not in d:
                d[i] = 1
            else:
                d[i] += 1

        for idx, c in enumerate(s):
            if d[c] == 1:
                return idx

        return -1