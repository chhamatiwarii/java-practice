class sequence_generator:
    def __init__(self, start, step):
        self.start = start
        self.step = step

    def __enter__(self):
        def generate():
            current = self.start
            while True:
                yield current
                current += self.step
        
        self.gen = generate()
        return self.gen

    def __exit__(self, exc_type, exc_value, traceback):
        self.gen = None