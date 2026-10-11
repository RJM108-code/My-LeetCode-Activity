class Solution(object):

  def validPalindrome(self, s):

    #helper function
    def is_palindrome_range(i, j):
      while i < j:
        if s[i] != s[j]:
          return False
        i += 1
        j -= 1
      return True

    left = 0
    right = len(s) - 1

    while left < right:
      if s[left] == s[right]:
        left += 1
        right -= 1
      else:
        return is_palindrome_range(left + 1, right) or is_palindrome_range(left, right - 1)

    return True