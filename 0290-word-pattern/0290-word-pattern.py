class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """

        p_lst = list(pattern)
        s_lst = s.split(' ')

        a = len(p_lst)
        b = len(s_lst)

        if a!=b :
            return False

        sol = dict()
        
        for i, j in zip(p_lst, s_lst):
            if i not in sol.keys() and j not in sol.values():
                sol[i] = j
            elif i in sol.keys():
                if sol.get(i) != j:
                    return False
            else:
                return False
            
        
        return True
        