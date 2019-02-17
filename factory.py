import random, os
from preprocess import SAMPLES_DIR, MADLIBS_DIR

med_words = open(os.path.join(os.path.dirname(__file__), "assets/dict_med.txt"), 'r').readlines()
sho_words = open(os.path.join(os.path.dirname(__file__), "assets/dict_sho.txt"), 'r').readlines()

def random_words():
    rand = random.randint(0, 16)
    if rand >= 8:
        return random.choice(med_words).rstrip()
    elif rand >= 6:
        return random.choice(med_words).rstrip().capitalize()
    elif rand >= 2:
        return random.choice(sho_words).rstrip() + (random.choice(med_words).rstrip()).capitalize()
    else:
        return random.choice(sho_words).rstrip() + "_" + random.choice(med_words).rstrip()

class Factory:
    def __init__(self):
        self.filename = random.choice(os.listdir(MADLIBS_DIR))

    def get_candidates(self, count=5):
        with open(MADLIBS_DIR + self.filename, 'r') as f:
            lines = f.readlines()
            for line in lines:
                candidates = []
                for i in range(count):
                    temp_line = line
                    for x in range(0, 20):
                        temp_line = temp_line.replace('$' + str(x), random_words())
                    candidates.append(temp_line)
                yield candidates