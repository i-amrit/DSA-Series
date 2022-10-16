''' Given a list of folders, remove all sub-folders in those folders and return in any order the folders after removing. If a folder[i] is located within another folder[j], it is called a sub-folder of it. 
The format of a path is one or more concatenated strings of the form: / followed by one or more lowercase English letters. For example, /leetcode and /leetcode/problems are valid paths while an empty string and / are not. 

Input : folder = ["/a","/a/b","/c/d","/c/d/e","/c/f"]
Output : ["/a","/c/d","/c/f"]
'''


def removeSubFolder(folder):

    result  = []

    folder.sort()

    result.append(folder[0])

    print('[', folder[0], end=', ')

    for i in range(1, len(folder)):        
        current = folder[i]
        prev = result[len(result)-1]

        if len(current)>len(prev) and current[len(prev)] == '/' and prev == current[:len(prev)]:
            continue
        else:
            result.append(current)

        print(current, end=', ')
    
    print(']')


folder = ['/a', '/a/b', '/c/d', '/c/d/e', '/c/f']
print('Input: ', folder)
print('Output: ', end='')
removeSubFolder(folder)