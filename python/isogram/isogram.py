def is_isogram(string):
    characters = []

    for l in filter(str.isalpha, string.lower()):
        if l in characters:
            return False
        else:
            characters.append(l)

    return True
