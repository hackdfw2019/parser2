import re
import sys
import os

RESERVED = ["abstract", "continue", "for", "new", "switch", "assert", "default", "goto", "package", "synchronized", "boolean", "do", "if", "private", "this", "break", "double", "implements", "protected", "throw", "byte", "else", "import", "public", "throws", "case", "enum", "instanceof", "return", "transient", "catch", "extends", "int", "short", "try", "char", "final", "interface", "static", "void", "class", "finally", "long", "strictfp", "volatile", "const", "float", "native", "super", "while"]

SAMPLES_DIR = 'assets/samples/'
MADLIBS_DIR = 'assets/madlibs/'


def remove_comments(s):
    for x in re.findall(r'("[^\n]*"(?!\\))|(//[^\n]*$|/(?!\\)\*[\s\S]*?\*(?!\\)/)',s,8):s=s.replace(x[1],'')
    return s


def clean():
    if not os.path.exists(MADLIBS_DIR):
        os.makedirs(MADLIBS_DIR)

    # remove comments from samples, and write the result to madlibs
    for filename in os.listdir(SAMPLES_DIR):
        text = remove_comments(open(SAMPLES_DIR + filename, 'r').read())
        to_write = open(MADLIBS_DIR + filename, 'w')
        to_write.write(text)

    # remove whitespace from madlibs, and write it back to madlibs
    for filename in os.listdir(MADLIBS_DIR):
        texts = open(MADLIBS_DIR + filename, 'r').readlines()
        result = []
        for text in texts:
            if (not (not text or text.isspace())) and (not (text.strip().startswith("import") or text.strip().startswith("package"))):
                result.append(text)
        result_string = ''.join(result)
        to_write = open(MADLIBS_DIR + filename, 'w')
        to_write.write(result_string)


def is_var_char(c):
    return ord('a') <= ord(c) <= ord('z') or \
           ord('A') <= ord(c) <= ord('Z') or \
           ord('0') <= ord(c) <= ord('9') or \
           ord(c) == ord('_')


def tokenize(s):
    result = []
    curr_var = ""
    for c in list(s):
        if is_var_char(c):
            curr_var += c
        else:
            if len(curr_var) > 0:
                result.append(curr_var)
            curr_var = ""
            result.append(str(c))
    if len(curr_var) > 0:
        result.append(curr_var)
    return result


def anonymize_madlibs():
    for filename in os.listdir(MADLIBS_DIR):
        lines = open(MADLIBS_DIR + filename, 'r').readlines()
        buffer = []
        for line in lines:
            var_map = {}
            index = 0
            buffer_line = []
            for token in tokenize(line):
                if is_var_char(token[0]) and token not in RESERVED:
                    if token not in var_map:
                        var_map[token] = index
                        index += 1
                    buffer_line.append('$' + str(var_map[token]))
                else:
                    buffer_line.append(token)
            buffer.append(''.join(buffer_line))
        to_write = open(MADLIBS_DIR + filename, 'w')
        to_write.write(''.join(buffer))


clean()
anonymize_madlibs()