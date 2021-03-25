import re

spam = input()

white_space = spam.count("_")
upper_case = sum(1 for c in spam if c.isupper())
lower_case = sum(1 for c in spam if c.islower())

white_spaces = white_space / len(spam)
upper_cases = upper_case / len(spam)
lower_cases = lower_case / len(spam)
special_signs = 1 - white_spaces - upper_cases - lower_cases

print("%.6f" % white_spaces)
print("%.6f" % lower_cases)
print("%.6f" % upper_cases)
print("%.6f" % special_signs)