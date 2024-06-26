import os


# Returns the directories contents in a list
def get_contents_of_dir(path):
    contents = os.listdir(path)

    for item in contents:
        print(item)
    return contents


# Writes the elements in contents to the "contents.txt" file in separate lines including line number
def write_contents(contents):
    f = open("/Users/sgoeddel/Desktop/contents.txt", "a")
    i = 0
    for line in contents:
        contents[i] = str(i) + ": " + line
    s = "\n"
    formatted = s.join(contents)
    f.write(formatted)


if __name__ == '__main__':
    contents = get_contents_of_dir('/Users/sgoeddel/Projects/ci-tools')
    write_contents(contents)

