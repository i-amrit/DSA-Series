def reverseWords(s):
    words = s.split()
    words = [word[::-1] for word in words]
    words = ' '.join(words)
    return words


if __name__ == "__main__":
    input = 'My name is siddhi'
    print(reverseWords(input))


